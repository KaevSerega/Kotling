import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;

class ShotWeapon {
    String nameWeapon;//имя оружия
    String cartridgeType;//тип патронов
    int numberOfRounds;//кол-во патронов в магазине
    LocalDateTime teme;

    public ShotWeapon(String name, String type, int pull) {
        nameWeapon = name;
        cartridgeType = type;
        numberOfRounds = pull;
    }
}

public class Weapon {
    public static void main(String[] args) {
        ShotWeapon[] armor = new ShotWeapon[2];
        ShotWeapon fds = new ShotWeapon("nameWeapon", "cartridgeType", 12);
        System.out.println();

        for (int i = 0; i < armor.length; i++) {
            Scanner arm = new Scanner(System.in);
            System.out.println("ВВедите название оружия");
            String nameWeapon = arm.nextLine();
            System.out.println("Введите тип патронов");
            String cartridgeType = arm.nextLine();
            System.out.println("ВВедите колличество патронов в магазине = ");
            int coll = arm.nextInt();
            ShotWeapon armor2 = new ShotWeapon(nameWeapon, cartridgeType, coll);
            armor[i] = armor2;

        }
        for (int i = 0; i < armor.length; i++) {
            System.out.println("имя оружия "+armor[i].nameWeapon+"\n"+"тип патронов "+armor[i].cartridgeType+"\n"+"кол-во патронов в магазине = "+armor[i].numberOfRounds);
        }
    }
}




