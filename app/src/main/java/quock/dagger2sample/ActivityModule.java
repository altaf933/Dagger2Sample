package quock.dagger2sample;

import android.app.Activity;

import dagger.Module;
import dagger.android.AndroidInjector;

/**
 * Created by altaf.h.shaikh on 5/11/2017.
 */

@Module(subcomponents = {MainActivitySubComponent.class})
public abstract class ActivityModule {
    abstract AndroidInjector.Factory<? extends Activity> bindYourActivityInjectorFactory
            (MainActivitySubComponent component);

}
