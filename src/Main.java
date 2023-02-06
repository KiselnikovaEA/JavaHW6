import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        MyHashSet set = new MyHashSet(20, 30, 10, 15);
        set.add(45);
        System.out.println(set);
    }
}

class MyHashSet {
    private final HashMap<Integer, Object> hMap = new HashMap<>();
    MyHashSet(int... numbers) {
        for (int num: numbers) {
            hMap.put(num, null);
        }
    }
    public void add (int number) {
        hMap.put(number, null);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for (int key: hMap.keySet()) {
            sb.append(key + " ");
        }
        sb.append("]");
        return sb.toString();
    }
}