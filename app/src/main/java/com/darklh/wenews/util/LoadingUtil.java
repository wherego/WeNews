package com.darklh.wenews.util;

import android.app.ProgressDialog;
import android.content.Context;

/**
 * Created by darklh on 2016/11/23.
 */

public class LoadingUtil {
    private static ProgressDialog dialog;

    public static void show(Context context) {
        dismiss();
        dialog = new ProgressDialog(context);
        dialog.show();
    }

    public static void dismiss() {
        if (dialog != null) {
            dialog.dismiss();
            dialog = null;
        }
    }
}
