package edu.alenasoft.principlespatterns.patterns.iterator;

public class CREUserApiClient {

    public CREUser[] getCREUsers() {
        CREUser[] users = new CREUser[2];
        users[0] = new CREUser(1, new UserData("John", "123 Main St", 1000.0));
        users[1] = new CREUser(2, new UserData("Jane", "456 Elm St", 1500.0));

        return users;
    }
}
