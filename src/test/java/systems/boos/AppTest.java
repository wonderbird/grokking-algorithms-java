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
}
