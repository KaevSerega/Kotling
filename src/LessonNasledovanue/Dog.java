package LessonNasledovanue;

public class Dog extends Animal{
    public void  bark(){
        System.out.println("I am bark");
    }
    public void eat(){
        System.out.println("Dog is eating");

    }

    public Dog(String name, int age) {
        super(name, age);
    }
}
