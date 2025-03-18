package systems.boos.algorithms;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;

class BreadthFirstSearchTest {
  @Test
  void someTest() {
    HashMap<String, ArrayList<String>> graph = new HashMap<>();
    graph.put("you", new ArrayList<>());

    Optional<String> result = BreadFirstSearch.search(graph.get("you"));
    assertTrue(result.isPresent());
  }

  private static class BreadFirstSearch {
    public static Optional<String> search(List<String> friends) {
      return Optional.empty();
    }
  }
}
