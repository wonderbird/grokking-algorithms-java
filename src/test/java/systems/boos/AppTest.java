package systems.boos;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class AppTest {

  @Test
  void selectionSort_emptyList_returnsEmpty() {
    var actual = App.selectionSort(Collections.emptyList());
    assertThat(actual, empty());
  }

  @Test
  void selectionSort_singleElement_returnsElement() {
    List<Integer> input = List.of(1);
    var expected = new Integer[] { 1 };

    var actual = App.selectionSort(input);

    assertThat(actual, contains(expected));
  }

  @Test
  void selectionSort_listOfSortedElements_returnsSameList() {
    List<Integer> input = List.of(1, 7, 12);
    var expected = new Integer[] { 1, 7, 12 };

    var actual = App.selectionSort(input);

    assertThat(actual, contains(expected));
  }

  @Test
  void selectionSort_twoElementsSortedDescending_sortsAscending() {
    List<Integer> input = List.of(12, 7);
    var expected = new Integer[] { 7, 12 };

    var actual = App.selectionSort(input);

    assertThat(actual, contains(expected));
  }

  @Test
  void selectionSort_severalUnsortedElements_sortsAscending() {
    List<Integer> input = List.of(12, 7, 42, 3);
    var expected = new Integer[] { 3, 7, 12, 42 };

    var actual = App.selectionSort(input);

    assertThat(actual, contains(expected));
  }

  @Test
  void binarySearch_emptyList_returnsEmpty() {
    var actual = App.binarySearch(Collections.emptyList(), 0);
    assertThat(actual, equalTo(Optional.empty()));
  }

  @Test
  void binarySearch_targetNotInList_returnsEmpty() {
    var actual = App.binarySearch(List.of(0), 1);
    assertThat(actual, equalTo(Optional.empty()));
  }

  @ParameterizedTest
  @ValueSource(ints = { 0, 5 })
  void binarySearch_targetInListWithSingleElement_returns0(int listElement) {
    var actual = App.binarySearch(List.of(listElement), listElement);
    assertThat(actual, equalTo(Optional.of(0)));
  }

  @Test
  void binarySearch_targetFirstOfTwoElements_returns0() {
    var actual = App.binarySearch(List.of(0, 1), 0);
    assertThat(actual, equalTo(Optional.of(0)));
  }

  @Test
  void binarySearch_targetSecondOfTwoElements_returns1() {
    var actual = App.binarySearch(List.of(0, 1), 1);
    assertThat(actual, equalTo(Optional.of(1)));
  }

  @Test
  void binarySearch_targetFirstOfThreeElements_returns0() {
    var actual = App.binarySearch(List.of(0, 1, 2), 0);
    assertThat(actual, equalTo(Optional.of(0)));
  }
}
