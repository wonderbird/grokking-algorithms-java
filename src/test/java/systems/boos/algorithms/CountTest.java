package systems.boos.algorithms;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

class CountTest {

  @Test
  void count_emptyList_0() {
    assertThat(Count.count(Collections.emptyList()), is(0));
  }

  @Test
  void count_singleElement_1() {
    assertThat(Count.count(Collections.singletonList("Bred")), is(1));
  }

  @Test
  void count_twoElements_2() {
    assertThat(Count.count(List.of("Bred", "Butter")), is(2));
  }
}
