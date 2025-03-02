package systems.boos.algorithms;

import java.util.List;
import java.util.Optional;

public interface CanSearch {
  Optional<Integer> search(List<Integer> numbers, int target);

  String getDescription();
}
