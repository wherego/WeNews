package com.darklh.wenews.network;

import com.orhanobut.logger.Logger;

import java.io.IOException;

import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;

/**
 * Created by 14074533 on 16/10/12.
 */
public class LoggerIntercepter implements Interceptor {
    public static final String tag = "Retrofit";

    private StringBuilder sb = new StringBuilder();

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        logForRequest(request);
        Response response = chain.proceed(request);
        return logForResponse(response);
    }

    private Response logForResponse(Response response) {
        try {
            Response.Builder builder = response.newBuilder();
            Response clone = builder.build();
            sb.append("\nresponseCode = ").append(clone.code());
            ResponseBody body = clone.body();
            if (body != null) {
                MediaType mediaType = body.contentType();
                if (mediaType != null) {
                    if (isText(mediaType)) {
                        String resp = body.string();
                        sb.append("\nresponseBody = " + resp);
                        body = ResponseBody.create(mediaType, resp);
                        Logger.i(sb.toString());
                        sb.setLength(0);
                        return response.newBuilder().body(body).build();
                    } else {
                        sb.append("\nresponseBody's content : \" + \" maybe [file part] , too large too print , ignored!");
                    }
                }
            }
        } catch (Exception e) {
        }
        Logger.i(sb.toString());
        sb.setLength(0);
        return response;
    }

    private void logForRequest(Request request) {
        try {
            String url = request.url().toString();
            Headers headers = request.headers();
            sb.append(request.method());
            sb.append(" ").append(url);
            RequestBody requestBody = request.body();
            if (requestBody != null) {
                sb.append("\nrequestBody : ").append(bodyToString(request));
            }
        } catch (Exception e) {
        }
    }

    private boolean isText(MediaType mediaType) {
        if (mediaType.type() != null && mediaType.type().equals("text")) {
            return true;
        }
        if (mediaType.subtype() != null) {
            if (mediaType.subtype().equals("json") ||
                    mediaType.subtype().equals("xml") ||
                    mediaType.subtype().equals("html") ||
                    mediaType.subtype().equals("webviewhtml")
                    )
                return true;
        }
        return false;
    }

    private String bodyToString(final Request request) {
        try {
            final Request copy = request.newBuilder().build();
            final Buffer buffer = new Buffer();
            copy.body().writeTo(buffer);
            return buffer.readUtf8();
        } catch (final IOException e) {
            return "something error when show requestBody.";
        }
    }
}