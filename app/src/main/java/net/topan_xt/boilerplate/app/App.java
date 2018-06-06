package net.topan_xt.boilerplate.app;

import android.app.Application;
import android.content.Context;

import java.util.Locale;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/*************************************************
 * Author     : Topan E.                         *
 * Contact    : topan.xt@gmail.com               *
 * Created on : Jun 06, 2018.                    *
 *************************************************/

public class App extends Application {
    public static final String TAG = App.class.getSimpleName();

    private static App mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;

        Realm.init(this);
        RealmConfiguration config = new RealmConfiguration
                .Builder()
                .deleteRealmIfMigrationNeeded()
                .name(Realm.DEFAULT_REALM_NAME)
                .build();
        Realm.setDefaultConfiguration(config);
        Locale.setDefault(new Locale("id_ID"));
    }

    public static Context getContext(){
        return mInstance.getApplicationContext();
    }
}
