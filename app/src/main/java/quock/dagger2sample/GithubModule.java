package quock.dagger2sample;

import java.util.ArrayList;

import dagger.Module;
import dagger.Provides;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by altaf.h.shaikh on 5/13/2017.
 */

@Module
public class GithubModule {

    public interface GitHubApiInterface {
        @GET("/org/{orgName}/repos")
        Call<ArrayList<Repository>> getRepository(@Path("orgName") String orgName);
    }

    @Provides
    @UserScope //Need to be consistent with component scop
    public GitHubApiInterface provideGitHubInterface(Retrofit retrofit) {
        return retrofit.create(GitHubApiInterface.class);
    }

}
