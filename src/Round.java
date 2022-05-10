import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Round {
    static Scanner scanner = new Scanner(System.in);
    private static Map<String, Integer> wrongAnswers = new HashMap<>();
    private static int right = 0;
    private static int wrong = 0;

    public Round() {
        RandomNumber randomNumber = new RandomNumber();
        System.out.print(randomNumber.getNumberStr() + " ");
        int userInput = scanner.nextInt();
        if (userInput == randomNumber.getRandomNumber()) {
            ++right;
        } else {
            ++wrong;
            System.out.println(String.format("- Well, it was %d", randomNumber.getRandomNumber()));
            wrongAnswers.put(randomNumber.getNumberStr(), userInput);
        }
    }

    public static int getRight() {
        return right;
    }

    public static int getWrong() {
        return wrong;
    }

    public static Map<String, Integer> getWrongAnswers() {
        return wrongAnswers;
    }

    public static void clearWrongAnswers() {
        Round.wrongAnswers.clear();
    }

    public static void setRight(int right) {
        Round.right = right;
    }

    public static void setWrong(int wrong) {
        Round.wrong = wrong;
    }
}
