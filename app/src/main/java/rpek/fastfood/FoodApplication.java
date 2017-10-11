package rpek.fastfood;

import android.app.Activity;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

import javax.inject.Inject;

import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasDispatchingActivityInjector;
import io.realm.Realm;

/**
 * Created by r.pek on 11.10.2017.
 */

public class FoodApplication extends Application implements HasDispatchingActivityInjector {

    @Inject
    DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;


    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);

    }

    @Override
    public void onCreate() {
        MultiDex.install(this);
        super.onCreate();
       // DaggerAppComponents.create().inject(this);

        Realm.init(this);
    }

    @Override
    public DispatchingAndroidInjector<Activity> activityInjector() {
        return dispatchingAndroidInjector;
    }
}
