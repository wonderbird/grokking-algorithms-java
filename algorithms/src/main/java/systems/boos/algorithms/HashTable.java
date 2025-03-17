package systems.boos.algorithms;

public class HashTable {
  private final Integer[] values;

  public HashTable() {
    var size = (int) Math.pow(2, 8);
    values = new Integer[size];
  }

  public Integer get(String key) {
    var index = hashString(key);
    return values[index];
  }

  private int hashString(String key) {
    var hash = key.hashCode();

    var boundedHash = hash % values.length;
    if (boundedHash < 0) {
      boundedHash += values.length;
    }

    return boundedHash;
  }

  public void add(String key, int value) {
    var index = hashString(key);
    values[index] = value;
  }
}
