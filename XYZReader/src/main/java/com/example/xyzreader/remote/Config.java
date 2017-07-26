package com.example.xyzreader.remote;

import com.example.xyzreader.ui.ArticleListActivity;

import java.net.MalformedURLException;
import java.net.URL;

public class Config{

    public static final URL BASE_URL;

    private final static String URL_REVIEW
            = "https://raw.githubusercontent.com/TNTest/xyzreader/master/data.json";

    private final static String URL_BASE
            = "https://go.udacity.com/xyz-reader-json";

    private static String TAG = Config.class.toString();

    static {
        URL url = null;

        try {
            url = new URL( URL_REVIEW );
        } catch (MalformedURLException ignored) {
            ArticleListActivity articleListActivity = new ArticleListActivity();
            articleListActivity.snackBar(1);
        }

        BASE_URL = url;
    }
}
