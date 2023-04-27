import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

class Dog{
    String name;
    int age;

    @Override
    public String toString() {
        return name +" " + age ;
    }
}



public class AddTeacher {
    public static void main(String[] args) {
        Dog [] hjjh = new Dog[7];
        for (int i = 0; i < hjjh.length; i++) {
            hjjh[i]=new Dog();
            hjjh[i].age=1;
            hjjh[i].name="hgcdhg";
        }
        int e=0;
        System.out.println(Arrays.toString(hjjh));
        Dog [] dogs =new Dog[9];
        for (Dog dog:dogs) {
            dog=new Dog();
            dog.age=567;
            dog.name="hgkjg";


        }



        System.out.println(Arrays.toString(dogs));





    }
}
