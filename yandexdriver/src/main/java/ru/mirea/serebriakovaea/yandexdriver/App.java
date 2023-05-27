package ru.mirea.serebriakovaea.yandexdriver;

import android.app.Application;

import com.yandex.mapkit.MapKitFactory;

public class App extends Application {
    private final String API_KEY = "0d4e1344-8d5e-4c7b-8805-7dc2cadd1850";

    @Override
    public void onCreate() {
        super.onCreate();
        MapKitFactory.setApiKey(API_KEY);
    }
}
