package com.example.xyzreader.remote;

import com.example.xyzreader.ui.ArticleListActivity;

import java.net.MalformedURLException;
import java.net.URL;

public class Config{

    public static final URL BASE_URL;

    private static String TAG = Config.class.toString();

    static {
        URL url = null;

        try {
            url = new URL("https://go.udacity.com/xyz-reader-json" );
        } catch (MalformedURLException ignored) {
            ArticleListActivity articleListActivity = new ArticleListActivity();
            articleListActivity.snackBar(1);
        }

        BASE_URL = url;
    }
}
