package systems.boos.algorithms;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

class SumTest {

  @Test
  void sum_emptyList_returns0() {
    assertThat(Sum.sum(Collections.emptyList()), is(0));
  }

  @Test
  void sum_oneElement_returnsItsValue() {
    assertThat(Sum.sum(Collections.singletonList(1)), is(1));
  }

  @Test
  void sum_twoElements_returnsSum() {
    assertThat(Sum.sum(List.of(2, 3)), is(5));
  }
}
