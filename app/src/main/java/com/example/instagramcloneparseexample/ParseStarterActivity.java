package com.example.instagramcloneparseexample;

import android.app.Application;

import com.parse.Parse;

public class ParseStarterActivity extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.setLogLevel(Parse.LOG_LEVEL_DEBUG);

        Parse.initialize(new Parse.Configuration.Builder(this)
            .applicationId("UYIgdCs7Nbq38MPhnKlduSSQtyTHTKFpbGWmGc0D")
                .clientKey("14k9agqnySf9isExLMbH4wRxhkUMOqXaA5dHqmcB")
                .server("https://parseapi.back4app.com/")
                .build()
        );
    }
}
