import java.util.Objects;

public class MyHashSet {
    public MyHashSetNode[] buckets;
    public int size;
    public int capacity;

    public MyHashSet(int capacity) {
        buckets = new MyHashSetNode[capacity];
        this.capacity = capacity;
        size = 0;
    }

    public void add(String word) {
        MyHashSetNode node = new MyHashSetNode(word);
        int index = node.hashCode() % capacity;
        node = buckets[index];
        while (node != null) {
            if (node.word.equals(word)) {
                return;
            }
            node = node.next;
        }
        MyHashSetNode newNode = new MyHashSetNode(word);
        newNode.next = buckets[index];
        buckets[index] = newNode;
        size++;

    }

    public boolean contains(String word){

        MyHashSetNode node = new MyHashSetNode(word);
        int index = node.hashCode() % capacity;
        node = buckets[index];
        while (node != null) {
            if (node.word.equals(word)) {
                return true;
            }
            node = node.next;
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

        return Objects.hash(word);
    }

    @Override
    public String toString() {
        return "MyHashSetNode{" + "word='" + word + '\'' + ", next=" + next + '}';
    }
}