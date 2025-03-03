package systems.boos.algorithms;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.empty;

import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * Test implementation of different sorting algorithms.
 *<p>
 * This test interface is implemented for each class providing a sorting
 * algorithm. Examples are given in
 *<p>
 * - {@link SelectionSortTest}
 *<p>
 * Refer to {@link CanSearchTest} for more information on Test Interfaces like this.
 */
public interface CanSortTest<T extends CanSort> {
  T createSorter();

  @Test
  default void sort_emptyList_returnsEmpty() {
    var actual = createSorter().sort(Collections.emptyList());
    assertThat(actual, empty());
  }

  @Test
  default void sort_singleElement_returnsElement() {
    List<Integer> input = List.of(1);
    var expected = new Integer[] { 1 };

    var actual = createSorter().sort(input);

    assertThat(actual, contains(expected));
  }

  @Test
  default void sort_listOfSortedElements_returnsSameList() {
    List<Integer> input = List.of(1, 7, 12);
    var expected = new Integer[] { 1, 7, 12 };

    var actual = createSorter().sort(input);

    assertThat(actual, contains(expected));
  }

  @Test
  default void sort_twoElementsSortedDescending_sortsAscending() {
    List<Integer> input = List.of(12, 7);
    var expected = new Integer[] { 7, 12 };

    var actual = createSorter().sort(input);

    assertThat(actual, contains(expected));
  }

  @Test
  default void sort_severalUnsortedElements_sortsAscending() {
    List<Integer> input = List.of(12, 7, 42, 3);
    var expected = new Integer[] { 3, 7, 12, 42 };

    var actual = createSorter().sort(input);

    assertThat(actual, contains(expected));
  }
}
