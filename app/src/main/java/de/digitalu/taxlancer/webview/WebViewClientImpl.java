package de.digitalu.taxlancer.webview;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewClientImpl extends WebViewClient {

    public static final String DOMAIN = "https://www.taxlancer.de/";
    //public static final String DOMAIN = "https://domoskanonos.github.io/nidoca-webcomponents/";

    private Activity activity = null;

    public WebViewClientImpl(Activity activity) {
        this.activity = activity;
    }

    @Override
    public boolean shouldOverrideUrlLoading(WebView webView, String url) {

        if (url.contains(DOMAIN)) return false;

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        activity.startActivity(intent);

        return true;

    }




}