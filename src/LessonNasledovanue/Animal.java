package LessonNasledovanue;

public class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("I am eating");
    }
    public void sleep(){
        System.out.println("I am sleeping");
    }

}
