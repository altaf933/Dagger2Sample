package quock.dagger2sample;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by altaf.h.shaikh on 5/11/2017.
 */

@Subcomponent
public interface MainActivitySubComponent extends AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {

    }
}
