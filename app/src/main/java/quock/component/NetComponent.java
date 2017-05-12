package quock.component;

import javax.inject.Singleton;

import dagger.Component;
import quock.dagger2sample.AppModule;
import quock.dagger2sample.MainActivity;
import quock.dagger2sample.NetModule;

/**
 * Created by altaf.h.shaikh on 5/12/2017.
 */

@Singleton
@Component(modules = {AppModule.class,NetModule.class})
public interface NetComponent {
    void inject(MainActivity activity);
}
