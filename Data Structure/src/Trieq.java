public class Trieq {
  static class TrieNodeq {
    TrieNodeq[] children = new TrieNodeq[128];
    boolean leaf;
  }

  public static void insertString(TrieNodeq root, String s) {
    TrieNodeq v = root;
    for (char ch : s.toCharArray()) {
      TrieNodeq next = v.children[ch];
      if (next == null)
        v.children[ch] = next = new TrieNodeq();
      v = next;
    }
    v.leaf = true;
  }

  public static void printSorted(TrieNodeq node, String s) {
    for (char ch = 0; ch < node.children.length; ch++) {
      TrieNodeq child = node.children[ch];
      if (child != null)
        printSorted(child, s + ch);
    }
    if (node.leaf) {
      System.out.println(s);
    }
  }

  // Usage example
  public static void main(String[] args) {
    TrieNodeq root = new TrieNodeq();
    insertString(root, "hell");
    insertString(root, "hello");
    insertString(root, "wor");
    insertString(root, "world");
    insertString(root, "hi");
    printSorted(root, "");
  }
}