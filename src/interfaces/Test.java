package interfaces;

public class Test {
    public static void main(String[] args) {
        Info info1 = new Animal(1);
        Info info2 = new Person("Bob");
        info1.shouInfo();
        info2.shouInfo();

    }
}
