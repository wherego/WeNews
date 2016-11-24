package com.darklh.wenews.ui;

import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Toast;

import com.darklh.wenews.util.LoadingUtil;

/**
 * Created by darklh on 2016/11/17.
 */

public class BaseActivity extends AppCompatActivity {

    public void showToast(String str) {
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    }

    public void showProgress() {
        LoadingUtil.show(this);
    }

    public void dismissProgress() {
        LoadingUtil.dismiss();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:
                super.onBackPressed();
                break;
            default:
                return super.onOptionsItemSelected(item);

        }
        return true;
    }
}
