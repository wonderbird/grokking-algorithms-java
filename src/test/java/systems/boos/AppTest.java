package systems.boos;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.Test;

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

  @Test
  void binarySearch_targetInListWithSingleElement_returnsTargetIndex() {
    var actual = App.binarySearch(List.of(0), 0);
    assertThat(actual, equalTo(Optional.of(0)));
  }
}
