import java.util.Scanner;
//import java.util.Match;


class Home{


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println(x);
        int age = 50;
        int age2= 41;
        System.out.printf("%d + %d"+"="+(age+age2)+"\n", age,age2);
        System.out.println(age+age2+" "+(age - age2));
        System.out.println(Math.pow(age,3));
        System.out.println(age*age*age);
    }
}
