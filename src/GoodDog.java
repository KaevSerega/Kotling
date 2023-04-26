import java.util.Arrays;
import java.util.Scanner;

public class GoodDog {
    String name;
    private  int size;
    public int getSize(){
        return size;
    }
    public void setSize(int s){
        size =s;

    }
    void bark(){
        if (size > 60){
            System.out.println("Гав, Гав!!!");
        }
        else if (size>14){
            System.out.println("Вуф, Вуф!!!");
        }else {
            System.out.println("Тяф, Тяф!!!");
        }
    }
}

class GoodDogTestDrive{
    public static void main(String[] args) {
        GoodDog [] pets = new GoodDog[3];
        //pets[0].name="Джокер";
        //pets[1].name="Мэтью";
        //pets[2].name="Джордж";
        for (int i = 0; i < pets.length; i++) {
            pets[i]= new GoodDog();
           Scanner str = new Scanner(System.in);
           String name = str.nextLine();
           int numb = str.nextInt();
           pets[i].name=name;
           pets[i].setSize(numb);
           pets[i].bark();
        }
        for (int i = 0; i < pets.length; i++) {
            System.out.println(pets[i].name+ " " + pets[i].getSize());

        }



        //GoodDog one = new GoodDog();
        //one.setSize(70);
        //GoodDog two = new GoodDog();
        //two.setSize(8);
        //System.out.println("Первая собака: "+ one.getSize());
        //System.out.println("Вторая собака "+ two.getSize());
        //one.bark();
        //two.bark();
    }
}