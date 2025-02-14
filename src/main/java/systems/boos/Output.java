package systems.boos;

public class Output {

  private final StringBuilder buffer;

  public Output() {
    this.buffer = new StringBuilder();
  }

  public void append(String format, Object... args) {
    buffer.append(format.formatted(args));
  }

  @Override
  public String toString() {
    return buffer.toString();
  }
}
