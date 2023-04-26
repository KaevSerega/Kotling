class Fish{
    String name;
    static{
        String forel = "forel";
    }
}




public class Time1 {
    public static void main(String[] args) {
        Fish faw = new Fish();
        faw.name=" fdsfs";

        System.out.println(faw.name);
    }
}


//import java.time.LocalDate;
//import java.time.LocalDateTime;
//
//class Animal {
//    String name;
//    int age;
//}
//
//class Player {
//    //Player serega = new Player();
//    int hitPoints;
//    String ferstName;
//    String secondName;
//
//}
//
//class TodoItem {
//    LocalDateTime time;
//    String x;
//}
//
//
//public class Time1 {
//    public static void main(String[] args) {
//        TodoItem item3=nower("апав");
//
//
//        TodoItem item1 = new TodoItem();
//        TodoItem item2 = new TodoItem();
//        item2.time = LocalDateTime.now().plusDays(1);
//        item2.x = "Жопа глаз";
//        item1.time = LocalDateTime.now().minusDays(1);
//        item1.x = "Рука нога";
//        TodoItem[] allItem = new TodoItem[]{item1, item2,item3};
//        for (int i = 0; i < allItem.length; i++) {
//            System.out.println(allItem[i].time + " " + allItem[i].x);
//        }
//    }
//
//    //путь первый1 возвращать тудуайтам 2 принимать первым аргументом строку Пусть возвращает
//    //новый тудуайтам с текущей датой и строка записывается в икс
//    public static TodoItem nower(String x) {
//            TodoItem newTodoItem = new TodoItem();
//            newTodoItem.time= LocalDateTime.now();
//            newTodoItem.x = x;
//            return  newTodoItem;
//
//    }
//}
////LocalDateTime date1 = LocalDateTime.now();
////String text=date1;
////}
//






