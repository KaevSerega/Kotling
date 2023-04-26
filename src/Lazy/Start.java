package Lazy;

class Player2 implements Play {
    String name;
    int age;

    public Player2(String name, int age) {
        this.age = age;
        this.name = name;

    }

    @Override
    public void movePlay() {
        System.out.println("Игрок " + name + " в возрасте " + age + " лет" + " начал забег");
    }

    @Override
    public void dead() {
        System.out.println(name+" ушол в мир иной в возрасте "+ age+ " лет");
    }
}

class People implements Play {
    String name;
    String sex;

    public People(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }


    @Override
    public void movePlay() {
        System.out.println(name + " начал(а) движение, и господи это " + sex);

    }

    @Override
    public void dead() {
        System.out.println(name + " умерла, он(а) был(а) " + sex);
    }
}


public class Start {
    public static void main(String[] args) {
        Player2 games = new Player2("Жора", 26);
        games.movePlay();
        games.dead();
        People man = new People("Тамара", "Женщина");
        man.movePlay();
        man.dead();

    }
}
