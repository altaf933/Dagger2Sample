package quock.dagger2sample;

import dagger.Component;
import dagger.android.AndroidInjectionModule;

/**
 * Created by altaf.h.shaikh on 5/11/2017.
 */

@Component(modules = {ActivityModule.class, AndroidInjectionModule.class})
public interface ApplicationComponent  {
    void inject(YourApplication application);
    //void inject(MainActivity activity);
}
