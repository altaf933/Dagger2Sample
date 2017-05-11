package quock.dagger2sample;

import javax.inject.Inject;

/**
 * Created by altaf.h.shaikh on 5/11/2017.
 */

public class NetworkApi {

    @Inject
    public NetworkApi() {

    }

    public boolean isValidUser(String username, String password) {
        // imagine an actual network call here
        // for demo purpose return false in "real" life
        if (username == null || username.length() == 0) {
            return false;
        } else {
            return true;
        }
    }
}
