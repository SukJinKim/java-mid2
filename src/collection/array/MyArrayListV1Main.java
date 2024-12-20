package collection.array;

public class MyArrayListV1Main {

    public static void main(String[] args) {
        MyArrayListV1 list = new MyArrayListV1();
        System.out.println("===데이터 추가===");
        System.out.println(list);
        list.add("a");
        System.out.println(list);
        list.add("b");
        System.out.println(list);
        list.add("c");

        System.out.println("===기능 사용===");
        System.out.println("list.size() = " + list.size());
        System.out.println("list.get(1) = " + list.get(1));
        System.out.println("list.indexOf(\"C\") = " + list.indexOf("C"));
        System.out.println("list.set(2, \"Z\") = " + list.set(2, "Z"));
        System.out.println(list);

        System.out.println("===범위 초과===");
        System.out.println(list);
        list.add("d");
        System.out.println(list);
        list.add("e");
        System.out.println(list);

        // 범위 초과
        list.add("f");
        System.out.println(list);
    }
}
