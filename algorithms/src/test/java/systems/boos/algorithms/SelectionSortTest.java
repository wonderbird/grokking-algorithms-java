package systems.boos.algorithms;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.empty;

import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

class SelectionSortTest {

  @Test
  void selectionSort_emptyList_returnsEmpty() {
    var actual = SelectionSort.selectionSort(Collections.emptyList());
    assertThat(actual, empty());
  }

  @Test
  void selectionSort_singleElement_returnsElement() {
    List<Integer> input = List.of(1);
    var expected = new Integer[] { 1 };

    var actual = SelectionSort.selectionSort(input);

    assertThat(actual, contains(expected));
  }

  @Test
  void selectionSort_listOfSortedElements_returnsSameList() {
    List<Integer> input = List.of(1, 7, 12);
    var expected = new Integer[] { 1, 7, 12 };

    var actual = SelectionSort.selectionSort(input);

    assertThat(actual, contains(expected));
  }

  @Test
  void selectionSort_twoElementsSortedDescending_sortsAscending() {
    List<Integer> input = List.of(12, 7);
    var expected = new Integer[] { 7, 12 };

    var actual = SelectionSort.selectionSort(input);

    assertThat(actual, contains(expected));
  }

  @Test
  void selectionSort_severalUnsortedElements_sortsAscending() {
    List<Integer> input = List.of(12, 7, 42, 3);
    var expected = new Integer[] { 3, 7, 12, 42 };

    var actual = SelectionSort.selectionSort(input);

    assertThat(actual, contains(expected));
  }
}
