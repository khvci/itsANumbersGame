import java.util.HashMap;
import java.util.Map;

public class RandomNumber {
    private final int randomNumber;
    private final String numberStr;
    private static Map<Integer, String> units = new HashMap<>();
    private static Map<Integer, String> tenths = new HashMap<>();
    private static Map<Integer, String> numbersMap = new HashMap<>();

    static {
        units.putAll(Map.of(
                0, "",
                1, "one",
                2, "two",
                3, "three",
                4, "four",
                5, "five",
                6, "six",
                7, "seven",
                8, "eight",
                9, "nine"
        ));

        units.putAll(Map.of(
                10, "ten",
                11, "eleven",
                12, "twelve",
                13, "thirteen",
                14, "fourteen",
                15, "fifteen",
                16, "sixteen",
                17, "seventeen",
                18, "eighteen",
                19, "nineteen"
        ));

        tenths.putAll(Map.of(
                20, "twenty",
                30, "thirty",
                40, "forty",
                50, "fifty",
                60, "sixty",
                70, "seventy",
                80, "eighty",
                90, "ninety"
        ));

        numbersMap.put(0, "zero");
        for (int i = 20; i < 100; i+= 10) {
            for (int j = 0; j < 10; j++) {
                String str = tenths.get(i) + units.get(j);
                numbersMap.put((i + j), str);
            }
        }
        for (int i = 1; i < 20; i++) {
            numbersMap.put(i, units.get(i));
        }
        numbersMap.put(100, "one hundred");
    }
    public RandomNumber() {
        this.randomNumber = (int)(Math.random() * 100);
        this.numberStr = numbersMap.get(randomNumber);
    }
    public int getRandomNumber() {
        return randomNumber;
    }
    public String getNumberStr() {
        return numberStr;
    }
}
