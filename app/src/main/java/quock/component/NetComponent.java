package quock.component;

import android.content.SharedPreferences;

import javax.inject.Singleton;

import dagger.Component;
import okhttp3.OkHttpClient;
import quock.dagger2sample.AppModule;
import quock.dagger2sample.NetModule;
import retrofit2.Retrofit;

/**
 * Created by altaf.h.shaikh on 5/12/2017.
 */

@Singleton
@Component(modules = {AppModule.class,NetModule.class})
public interface NetComponent {
//    void inject(MainActivity activity);

    //Downstream component need these exposed
    //the method name does not matter
    Retrofit retrofit();
    OkHttpClient okkOkHttpClient();
    SharedPreferences sharedPreferences();

}
