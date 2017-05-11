package quock.dagger2sample;

import android.app.Activity;
import android.app.Application;
import android.util.Log;

import javax.inject.Inject;

import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasDispatchingActivityInjector;

/**
 * Created by altaf.h.shaikh on 5/11/2017.
 */

public class YourApplication extends Application implements HasDispatchingActivityInjector{
    @Inject
    DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;

    @Inject NetworkApi networkApi;
    @Override
    public void onCreate() {
        super.onCreate();
        DaggerApplicationComponent.create().inject(this);
        boolean isValid =networkApi.isValidUser("","");
        Log.d("inject", String.valueOf(isValid));
    }

    @Override
    public DispatchingAndroidInjector<Activity> activityInjector() {
        return  dispatchingAndroidInjector;
    }
}
