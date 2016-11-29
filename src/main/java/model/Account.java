package model;


import com.google.appengine.api.datastore.Key;

import java.util.List;

/**
 * Created by Elias on 11/23/2016.
 */
public class Account {

    private List<Key> challengesCompleted;

    private List<Key> challengesPending;

    private String userId;

    private String password;

    public Account() {
    }

    public Account(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Key> getChallengesCompleted() {
        return challengesCompleted;
    }

    public void setChallengesCompleted(List<Key> challengesCompleted) {
        this.challengesCompleted = challengesCompleted;
    }

    public List<Key> getChallengesPending() {
        return challengesPending;
    }

    public void setChallengesPending(List<Key> challengesPending) {
        this.challengesPending = challengesPending;
    }

}
