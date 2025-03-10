package systems.boos.algorithms;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class QuickSortPivotRandomTest implements CanSortTest<QuickSortPivotRandom> {

  @Override
  public QuickSortPivotRandom createSorter() {
    return new QuickSortPivotRandom();
  }

  @Override
  @Test
  @Disabled("Caveat: QuickSort does not support duplicates")
  public void sort_severalUnsortedElementsWithDuplicates_sortsAscending() {
    fail("QuickSort does not support duplicates");
  }
}
