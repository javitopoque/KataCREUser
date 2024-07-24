package edu.alenasoft.principlespatterns.patterns.iterator;

public class CREUserAggregate implements Aggregate {

  @Override
  public Iterator createIterator() {
    var client = new CREUserApiClient();
    return new CREUsersIterator(client.getCREUsers());
  }
}
