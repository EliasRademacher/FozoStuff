package model;


import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.users.User;

import java.util.List;

/**
 * Created by Elias on 11/23/2016.
 */
public class Account {
    private List<Key> challengesCompleted;

    private List<Key> challengesPending;

    /* TODO: Replace usages of model.Person with appengine.api.User,
    and migrate appropriate fields of model.Person to model.Account. */

    private Person fozoUser;

    private String userId;

    /* TODO: Change this to return an appengine.api.User. */
    public Person getUser() {
        return fozoUser;
    }

    /* TODO: Change this to set this.user */
    public void setUser(Person user) {
        this.fozoUser = user;
    }


}
