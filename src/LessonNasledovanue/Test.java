package LessonNasledovanue;

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal("ghdjhg",57);
        animal1.eat();
        animal1.sleep();
        Dog dog1=new Dog("ghdjhg",57);
        dog1.eat();
        dog1.sleep();
        dog1.name="Вумля";
        dog1.age=4;
        dog1.bark();
        System.out.println(dog1.age+" " + dog1.name);

    }
}
