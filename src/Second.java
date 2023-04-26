import java.net.SocketOption;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.StringTokenizer;


class Car{
    String nameCar1;
    static int km;
    static String nameCar = "Бибика";
    public static void bnarck() {
        System.out.println("Привет МИР");

    }
    public void gav(){
        System.out.println("абракадабра");

    }
}



public class Second {
    public static void main(String[] args) {
        Car newCar1 = new Car();
        Car newCar2 = new Car();
        newCar1.nameCar1="BMW";
        newCar2.nameCar1= "Лексус";
        System.out.println(newCar1.nameCar);
        System.out.println(newCar2.nameCar);
        Car.nameCar="Жопа енота";
        System.out.println(newCar1.nameCar);
        System.out.println(newCar2.nameCar);
        //Car.bnarck();
        //System.out.println(Car.km);
        //Car newCar = new Car();
        //int x = Car.km;
        //System.out.println(Car.nameCar);
        //String c;
        //char z;
        //double q;












        //Scanner str = new Scanner(System.in);
        //String text = str.nextLine();
        //StringTokenizer tokenizer = new StringTokenizer(text, " ");
        //if (tokenizer.hasMoreTokens()) {
        //    String command = tokenizer.nextToken();
        //    if (Objects.equals("display", command)) {
        //        if (tokenizer.hasMoreTokens()) {
        //            String parameter = tokenizer.nextToken();
//
        //            if (Objects.equals(parameter, "datetime")) {
        //                System.out.println("1. 2023-01-01 some text");
        //            } else {
        //                System.out.println("unexpected parameter");
        //            }
//
        //        } else {
        //            System.out.println("1. some text");
        //        }
//
        //    }
//
        //} else {
        //    System.out.println("error");
        //}
    }

}
