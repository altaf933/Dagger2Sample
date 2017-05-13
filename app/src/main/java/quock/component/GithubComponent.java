package quock.component;

import dagger.Component;
import quock.dagger2sample.GithubModule;
import quock.dagger2sample.MainActivity;
import quock.dagger2sample.UserScope;

/**
 * Created by altaf.h.shaikh on 5/13/2017.
 */

@UserScope
@Component(dependencies = NetComponent.class,modules = GithubModule.class)
public interface GithubComponent {
    void inject(MainActivity activity);
}
