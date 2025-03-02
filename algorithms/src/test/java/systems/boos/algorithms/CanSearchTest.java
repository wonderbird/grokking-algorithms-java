package systems.boos.algorithms;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * Test implementation of different search algorithms.
 *<p>
 * This test interface is implemented for each class providing a search
 * algorithm. Examples are given in
 *<p>
 * - {@link SearchBinaryWhileLoopTest}
 *<p>
 * Documentation of Test Interfaces:
 *<p>
 * - <a href="https://stackoverflow.com/questions/55437810/how-to-test-different-implementations-for-an-interface-in-junit5-without-duplica">stackoverflow: How to test different implementations for an interface in Junit5 without duplicating the code</a>
 * - <a href="https://junit.org/junit5/docs/current/user-guide/#writing-tests-test-interfaces-and-default-methods">Chapter "2.15. Test Interfaces and Default Methods" in "JUnit5 User Guide"</a>
 * </p>
 */
interface CanSearchTest<T extends CanSearch> {
  T createSearcher();

  @Test
  default void search_listSize0_returnsEmpty() {
    var actual = createSearcher().search(Collections.emptyList(), 0);
    assertThat(actual, equalTo(Optional.empty()));
  }

  @Test
  default void search_listSize1WithoutTarget_returnsEmpty() {
    var actual = createSearcher().search(List.of(0), 1);
    assertThat(actual, equalTo(Optional.empty()));
  }

  @ParameterizedTest
  @ValueSource(ints = { 0, 5 })
  default void search_listSize1WithTarget_returns0(int listElement) {
    var actual = createSearcher().search(List.of(listElement), listElement);
    assertThat(actual, equalTo(Optional.of(0)));
  }

  @Test
  default void search_listSize2WithTarget1St_returns0() {
    var actual = createSearcher().search(List.of(0, 1), 0);
    assertThat(actual, equalTo(Optional.of(0)));
  }

  @Test
  default void search_listSize2WithTarget2Nd_returns1() {
    var actual = createSearcher().search(List.of(0, 1), 1);
    assertThat(actual, equalTo(Optional.of(1)));
  }

  @Test
  default void search_listSize3WithTarget1St_returns0() {
    var actual = createSearcher().search(List.of(0, 1, 2), 0);
    assertThat(actual, equalTo(Optional.of(0)));
  }

  @Test
  default void search_listSize4WithTarget3Rd_returns0() {
    var actual = createSearcher().search(List.of(0, 1, 2, 4), 2);
    assertThat(actual, equalTo(Optional.of(2)));
  }
}
