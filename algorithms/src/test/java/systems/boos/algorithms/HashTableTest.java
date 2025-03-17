package systems.boos.algorithms;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class HashTableTest {
  private static HashTable hashTable;

  @BeforeAll
  static void setup() {
    hashTable = new HashTable();
    hashTable.add("Apple", 1);
    hashTable.add("Banana", 2);
    hashTable.add("Petrol [l]", 11);
    hashTable.add("Oil", 42);
    hashTable.add("Olives", 7);
  }

  @Test
  void lookupValues() {
    assertEquals(1, hashTable.get("Apple"));
    assertEquals(2, hashTable.get("Banana"));
    assertEquals(11, hashTable.get("Petrol [l]"));
    assertEquals(42, hashTable.get("Oil"));
    assertEquals(7, hashTable.get("Olives"));
    assertNull(hashTable.get("Not in the  table"));

    // To inspect the HashTable, place a breakpoint in a line above and use
    // your IDE to view the variable hashTable.
  }
}
