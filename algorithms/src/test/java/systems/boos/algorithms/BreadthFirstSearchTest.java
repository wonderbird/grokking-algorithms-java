package systems.boos.algorithms;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class BreadthFirstSearchTest {
  @Test
  void toList_emptyFriends_sizeIs0() {
    var friends = new Friends();
    assertThat(friends.toList().size(), is(0));
  }

  @Test
  void addPerson_emptyFriends_personContained() {
    var friends = new Friends();
    friends.addPerson("you");
    assertThat(friends.toList(), contains("you"));
  }

  @Test
  void addPerson_emptyFriends_personHasNoFriends() {
    var friends = new Friends();
    friends.addPerson("you");
    assertThat(friends.getFriendsOf("you").size(), is(0));
  }

  @Test
  void addPerson_twoPersonsAdded_bothPersonsContained() {
    var friends = new Friends();
    friends.addPerson("you");
    friends.addPerson("Bob");
    assertThat(friends.toList(), containsInAnyOrder("you", "Bob"));
  }

  @Test
  void addPerson_samePersonAddedTwice_personContainedOnlyOnce() {
    var friends = new Friends();
    friends.addPerson("you");
    friends.addPerson("you");

    var listOfPersons = friends.toList();
    var numberOfYouPersons = listOfPersons.stream().filter(person -> person.equals("you")).count();
    assertThat(numberOfYouPersons, is(1L));
  }

  @Test
  void addFriends_personAnd1FriendAddedToEmptyFriends_2PersonsContained() {
    var friends = new Friends();
    friends.addFriends("you", "Bob");
    assertThat(friends.toList(), containsInAnyOrder("you", "Bob"));
  }

  @Test
  void addFriends_personAnd3FriendsAddedToEmptyFriends_4PersonsContained() {
    var friends = new Friends();
    friends.addFriends("you", "Bob", "Claire", "Alice");
    assertThat(friends.toList(), containsInAnyOrder("you", "Bob",  "Claire", "Alice"));
  }

  @Test
  void addFriends_personAnd3FriendsAddedToEmptyFriends_3PersonsAreFriendToPerson() {
    var friends = new Friends();
    friends.addFriends("you", "Bob", "Claire", "Alice");

    var friendsOfPerson = friends.getFriendsOf("you");
    assertThat(friendsOfPerson.size(), is(3));
    assertThat(friendsOfPerson, containsInAnyOrder("Bob",  "Claire", "Alice"));
  }

  private static class Friends {
    private HashMap<String, LinkedList<String>> graph = new HashMap<>();

    public void addPerson(String person) {
      graph.put(person,  new LinkedList<>());
    }

    public void addFriends(String person, String... personsFriends) {
      addPerson(person);
      for (String friend : personsFriends) {
        addPerson(friend);
      }
    }

    public List<String> toList() {
      return graph.keySet().stream().toList();
    }

    public List<String> getFriendsOf(String you) {
      return graph.get(you);
    }
  }
}
