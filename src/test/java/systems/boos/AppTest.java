package systems.boos;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

class AppTest {

  @Test
  void executeDemos_approvalTest() {
    Output output = new Output();
    App.executeDemos(output);
    Approvals.verify(output);
  }
}
