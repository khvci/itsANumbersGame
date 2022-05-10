public class Game {
    private final long startTime = System.currentTimeMillis();
    private static int highScore = Integer.MIN_VALUE;

    {
        System.out.println("\nYou have 30 seconds. Write integer equivalent next to the provided string.\n");
        while (System.currentTimeMillis() - startTime < 30000) {
            Round round = new Round();
        }
        int points = Round.getRight() - (Round.getWrong() * 2);
        //Points.highestScore = Math.max(points, Points.highestScore);
        highScore = Math.max(points, highScore);

        System.out.println(String.format("\nYou gave %d right and %d wrong answers", Round.getRight(), Round.getWrong()));
        System.out.println("Wrong answers: " + Round.getWrongAnswers());
        System.out.println(String.format("Points: %d, High Score: %d", points, highScore));
        Round.setRight(0);
        Round.setWrong(0);
        Round.clearWrongAnswers();
    }
}
