package systems.boos.algorithms;

public class HashTable {
  private final Integer[] values;

  public HashTable() {
    var size = (int) Math.pow(2, 8);
    values = new Integer[size];
  }

  public void add(String key, int value) {
    var index = calculateIndexFromHashFor(key);
    values[index] = value;
  }

  public Integer get(String key) {
    var index = calculateIndexFromHashFor(key);
    return values[index];
  }

  private int calculateIndexFromHashFor(String key) {
    var hash = key.hashCode();

    // limit index to 0 .. values.length
    var boundedHash = hash % values.length;

    if (boundedHash < 0) {
      boundedHash += values.length;
    }

    return boundedHash;
  }
}
