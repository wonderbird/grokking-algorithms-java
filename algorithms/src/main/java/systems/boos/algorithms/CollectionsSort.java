package systems.boos.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSort implements CanSort {

  public List<Integer> sort(List<Integer> numbers) {
    var result = new ArrayList<>(numbers);

    Collections.sort(result);

    return result;
  }

  @Override
  public String getDescription() {
    return "Collections.sort";
  }
}
