package com.example.playstore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class INDuberEats extends AppCompatActivity {
    private WebView W;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_induber_eats);
        W=findViewById(R.id.w);
        W.loadUrl("https://www.ubereats.com/en-IN/?ad_id=338854781923&adg_id=58700004181546694&adgroup_id=58700004181546694&adgroup_name=UberEats%3EBMM&campaign_id=71700000037880539&cid=71700000037880539&dev=c&ext_id=&gclid=Cj0KCQjwrpLoBRD_ARIsAJd0BIU2fsaapSUKWTXJ4tlN9RC6_NUOaP69yBhO8coQ74fmQpJen0mYhYkaAjYZEALw_wcB&gclsrc=aw.ds&kw=%2Buber+%2Beater&kw_id=p34591972634&kwid=p34591972634&lint_id=&lphy_id=9050511&match=b&net=g&placement=&pos=1t1&ran=5058887893955633403&target=&utm_campaign=search-google-brand_77_-99_IN-National_e_dsk_acq_cpc_en_CNT_UberEats_BMM&utm_medium=cpc-brand&utm_source=google&utm_term=%2Buber+%2Beater");
        WebSettings wb=W.getSettings();
        // wb.setJavaScriptCanOpenWindowsAutomatically(true);
        wb.setJavaScriptEnabled(true);
        W.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if(W.canGoBack()){
            W.goBack();}
        else
        {
            super.onBackPressed();
        }
    }}



