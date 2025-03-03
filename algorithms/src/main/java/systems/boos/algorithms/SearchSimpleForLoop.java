package systems.boos.algorithms;

import java.util.List;
import java.util.Optional;

public class SearchSimpleForLoop implements CanSearch {

  @Override
  public Optional<Integer> search(List<Integer> numbers, int target) {
    for (int i = 0; i < numbers.size(); i++) {
      if (numbers.get(i) == target) {
        return Optional.of(i);
      }
    }

    return Optional.empty();
  }

  @Override
  public String getDescription() {
    return "Simple Search Using For Loop";
  }
}
