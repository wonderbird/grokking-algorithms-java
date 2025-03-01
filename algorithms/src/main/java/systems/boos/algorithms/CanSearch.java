package systems.boos.algorithms;

import java.util.List;
import java.util.Optional;

public interface CanSearch {
  Optional<Integer> binarySearch(List<Integer> numbers, int target);

  String getDescription();
}
