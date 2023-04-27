import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.io.*;

class TodoItem {
    LocalDateTime time;
    String text;
    //void add(){

   // }
}


class Main {
    public static final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm");

    public static void main(String[] args) throws IOException, NumberFormatException {
        try (FileWriter writer = new FileWriter("notes33.txt", true)) {
            ArrayList<TodoItem> itemsMain = new ArrayList<>();
            int number = 0;
            int del = 0;

            int rox = 1;
            boolean y = true;

            while (y) {
                TodoItem item2 = new TodoItem();
                Scanner str = new Scanner(System.in);
                String text = str.nextLine();
                String textNew;
                StringTokenizer tokenizer = new StringTokenizer(text, " ");

                try {String command = tokenizer.nextToken();
                    if (Objects.equals(command, "delete")) {
                        if (tokenizer.hasMoreTokens()) {
                            textNew = text.substring(7);
                            del = Integer.parseInt(textNew);
                            del--;
                            itemsMain.remove(del);
                            number--;
                            if (number == 0) {
                                System.out.println("Теперь тут пусто");
                            } else {
                                for (int e = 0; e < itemsMain.size(); e++) {// добавляем 5 к `nums[]`
                                    System.out.print(rox++);
                                    System.out.print(". " + itemsMain.get(e).text.trim() + "\n");
                                }
                            }
                            rox = 1;
                        }
                    } else if (Objects.equals(command, "add")) {
                        if (tokenizer.hasMoreTokens()) {
                            //tringTokenizer tokenizer = new StringTokenizer(text, " ");
                            int x = text.length();
                            textNew = text.substring(4);
                            itemsMain.add(item2);
                            itemsMain.get(number).text = textNew;
                            itemsMain.get(number).time = LocalDateTime.now();
                            System.out.println(itemsMain.get(number).text);
                            String text2 = textNew;
                            writer.write(text2 + " " + itemsMain.get(number).text);
                            number++;
                        }
                    } else if (Objects.equals("display", command)) {
                        if (itemsMain.size() == 0) {
                            System.out.println("Тут пусто, но вы можете меня заполнить");
                        } else if (tokenizer.hasMoreTokens()) {
                            String parameter = tokenizer.nextToken();
                            if (Objects.equals(parameter, "datetime")) {
                                for (int q = 0; q < itemsMain.size(); q++) {// добавляем 5 к `nums[]`
                                    System.out.print(rox++);
                                    System.out.print(". " + dateFormatter.format(itemsMain.get(q).time));
                                    System.out.print(". " + itemsMain.get(q).text.trim() + "\n");
                                }
                            } else {
                                System.out.println("Некоретный ввод!!!");
                            }
                            rox = 1;
                        } else if (Objects.equals("display", command)) {
                            for (int q = 0; q < itemsMain.size(); q++) {// добавляем 5 к `nums[]`
                                System.out.print(rox++);
                                System.out.print(". " + itemsMain.get(q).text.trim() + "\n");
                            }
                            rox = 1;
                        }
                    } else if (Objects.equals(command, "exit")) {
                        System.out.println("конец программы!!!");
                        y = false;

                    }else {
                        System.out.println("Неизвестная команда!!!");
                    }
                } catch (NumberFormatException e) {
                    System.err.println("Введите число");
                } catch (IndexOutOfBoundsException e) {
                    System.err.println("Выход за размеры массива, максимальное число " + number);
                }catch (NoSuchElementException e){
                    System.err.println("Введите команду");
                }
            }
        }
    }
}












