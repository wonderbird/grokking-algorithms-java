package systems.boos.algorithms;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

class MaxTest {

  @Test
  void max_emptyList_0() {
    assertThat(Max.max(Collections.emptyList()), is(0));
  }

  @Test
  void max_singleElement_returnsThatElement() {
    assertThat(Max.max(Collections.singletonList(6)), is(6));
  }

  @Test
  void max_twoElementsAscending_returnsLastElement() {
    assertThat(Max.max(List.of(3, 8)), is(8));
  }

  @Test
  void max_twoElementsDescending_returnsFirstElement() {
    assertThat(Max.max(List.of(8, 3)), is(8));
  }

  @Test
  void max_threeElementsAscending_returnsLastElement() {
    assertThat(Max.max(List.of(1, 2, 3)), is(3));
  }

  @Test
  void max_arbitraryMixedElements_returnsMax() {
    assertThat(Max.max(List.of(23, 8, 5, 687, 49, 34)), is(687));
  }
}
