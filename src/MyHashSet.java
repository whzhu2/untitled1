import java.util.Objects;

public class MyHashSet {
    public MyHashSetNode[] buckets;
    public int size;

    public MyHashSet(int capacity) {
        buckets = new MyHashSetNode[capacity];
        size = capacity;
    }

    public void add(String word) {
        MyHashSetNode node = new MyHashSetNode(word);
        int index = node.hashCode();
        buckets[index] = node;
    }

    public boolean contains(String word){

        MyHashSetNode n = new MyHashSetNode(word);
        int index = n.hashCode();
        n = buckets[index];
        if (n == null)
            return false;
         else if (n.word.equals(word)) {
            return true;
        }
        return false;
    }
}

class MyHashSetNode {
    public String word;
    public MyHashSetNode next = null;

    public MyHashSetNode(String word) {
        this.word = word;
    }

    @Override
    public int hashCode() {

        return Objects.hash(word) % 10;
    }

    @Override
    public String toString() {
        return "MyHashSetNode{" +
                "word='" + word + '\'' +
                ", next=" + next +
                '}';
    }
}