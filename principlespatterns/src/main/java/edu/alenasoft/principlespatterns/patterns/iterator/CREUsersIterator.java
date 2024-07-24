package edu.alenasoft.principlespatterns.patterns.iterator;

public class CREUsersIterator implements Iterator<CREUser> {

    private final CREUser[] users;
    private int currentPosition = 0;

    public CREUsersIterator(CREUser[] users) {
        this.users = users;
    }

    @Override
    public CREUser next() {
        return users[currentPosition++];
    }

    @Override
    public boolean isDone() {
        return currentPosition >= users.length;
    }

    @Override
    public CREUser currentItem() {
        if (isDone()) {
            return users[users.length - 1];
        }

        return users[currentPosition];
    }
}
