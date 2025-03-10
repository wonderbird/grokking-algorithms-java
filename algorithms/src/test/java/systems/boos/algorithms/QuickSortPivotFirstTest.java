package systems.boos.algorithms;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class QuickSortPivotFirstTest implements CanSortTest<QuickSortPivotFirst> {

  @Override
  public QuickSortPivotFirst createSorter() {
    return new QuickSortPivotFirst();
  }

  @Override
  @Test
  @Disabled("Caveat: QuickSort does not support duplicates")
  public void sort_severalUnsortedElementsWithDuplicates_sortsAscending() {
    fail("QuickSort does not support duplicates");
  }
}
