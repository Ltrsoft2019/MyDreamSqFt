package com.ltrsoft.mydreamsqft.app.di;

import android.content.Context;

import com.ltrsoft.mydreamsqft.app.util.SharedPreferencesManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn(SingletonComponent.class)
public class UtilModule {
    @Singleton
    @Provides
    public SharedPreferencesManager provideSharedPreferencesManager(@ApplicationContext Context context ) {
        return new SharedPreferencesManager(context);
    }
}
