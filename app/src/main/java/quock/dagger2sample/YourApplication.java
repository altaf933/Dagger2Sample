package quock.dagger2sample;

import android.app.Activity;
import android.app.Application;
import android.util.Log;

import javax.inject.Inject;

import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasDispatchingActivityInjector;
import quock.component.DaggerNetComponent;
import quock.component.NetComponent;

/**
 * Created by altaf.h.shaikh on 5/11/2017.
 */

public class YourApplication extends Application implements HasDispatchingActivityInjector {
    @Inject
    DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;

    private NetComponent mNetComponent;

    @Inject
    NetworkApi networkApi;

    @Override
    public void onCreate() {
        super.onCreate();

        DaggerApplicationComponent.create().inject(this);

        mNetComponent = DaggerNetComponent.builder()
                .appModule(new AppModule(this))
                .netModule(new NetModule("https://api.github.com"))
                .build();



        boolean isValid = networkApi.isValidUser("", "");
        Log.d("inject", String.valueOf(isValid));
    }

    @Override
    public DispatchingAndroidInjector<Activity> activityInjector() {
        return dispatchingAndroidInjector;
    }

    public NetComponent getmNetComponent() {
        return mNetComponent;
    }
}
