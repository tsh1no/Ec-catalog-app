package com.example.tsh1no.ec_catalog_app;

import android.app.Activity;
import android.net.Uri;
import android.os.AsyncTask;

/**
 * Created by PC-006 on 2015/12/09.
 */
public class AsyncHttpRequest extends AsyncTask<Uri.Builder, Void, String> {

    private Activity mainActivity;

    public AsyncHttpRequest(Activity activity){

        // 呼び出し元のアクティビティ
        this.mainActivity = activity;
    }

    @Override
    protected String doInBackground(Uri.Builder... params) {

        //httpリクエストでデータを送信


        return null;
    }
}
