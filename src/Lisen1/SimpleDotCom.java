package Lisen1;

import java.io.IOException;

public class SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;

    public void setLocationCells(int[] locs) {
        locationCells = locs;
    }

    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "Мимо";
        for (int i = 0; i < locationCells.length; i++) {
            if (guess == locationCells[i]) {
                locationCells[i] = -1; // отмечаем подбитый элемент как "-1"
                result = "Попал";
                numOfHits++;
                break;
            } else if (locationCells[i] == -1) { // проверяем, не был ли элемент уже подбит
                result = "Уже был подбит";
            }
        }
        if (numOfHits == locationCells.length) {
            result = "Потопил";
        }
        System.out.println(result);
        return result;
    }
    public static void main(String[] args) throws IOException {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        SimpleDotCom theDotCom = new SimpleDotCom();
        int randomNum = (int) (Math.random() * 5);
        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        theDotCom.setLocationCells(locations);
        boolean isAlive = true;
        while (isAlive) {
            String guess = helper.getUserInput("Введите число ");
            String result =theDotCom.checkYourself(guess);
            numOfGuesses++;
            if (result.equals("Потопил")) {
                isAlive = false;
                System.out.println("Вам потребовалось " + numOfGuesses + " попыток(и)");

            }

        }
    }
}
//class SimpleDotComTestDrive{
//    public static void main(String[] args) {
//        SimpleDotCom dot = new SimpleDotCom();
//        int[ ] locations ={ -2,3,4};
//        dot.setLocationCells(locations);
//        String userGuess = "-2";
//        String result = dot.checkYourself(userGuess);
//
//    }
//}
