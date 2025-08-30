import java.util.HashMap;
import java.util.Map;

class MyKey {
    private String name;

    public MyKey(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        // 强制 hash 一样
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        // 故意让任何两个对象都不相等
        return this == obj;
    }

    @Override
    public String toString() {
        return "MyKey{" + name + "}";
    }
}

public class HashMapCollisionTest2 {
    public static void main(String[] args) {
        Map<MyKey, String> map = new HashMap<>();

        MyKey k1 = new MyKey("A");
        MyKey k2 = new MyKey("B"); // hashCode 一样，但 equals 返回 false

        // 插入第一个
        String v1 = map.put(k1, "value1");
        System.out.println("put(k1, value1) 返回: " + v1); // null

        // 插入第二个（hash 冲突，但 key 不相等）
        String v2 = map.put(k2, "value2");
        System.out.println("put(k2, value2) 返回: " + v2); // null

        // 打印最终 map
        System.out.println("最终 map: " + map);
    }
}
