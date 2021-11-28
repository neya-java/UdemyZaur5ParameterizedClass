public class ParameterizedClass2 {
    public static void main(String[] args) {
        Info2 <String , Integer> pair1 = new Info2<>("Hi", 12345);
        System.out.println(pair1.getValue1() + " " + pair1.getValue2());

        Info2 <Integer, Double> pair2 = new Info2<>(12345, 12.334);
        System.out.println(pair2.getValue1() + " " + pair2.getValue2());

        Info3<String> pair3 = new Info3<>("Hi", "By");
        System.out.println(pair3.getValue1() + " " + pair3.getValue2());
    }
}

class Info2 <V1, V2> {
    private V1 value1;
    private V2 value2;

    public Info2(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getValue1() {
        return value1;
    }

    public V2 getValue2() {
        return value2;
    }
}

class Info3 <V> {
    private V value1;
    private V value2;

    public Info3(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V getValue1() {
        return value1;
    }

    public V getValue2() {
        return value2;
    }
}
