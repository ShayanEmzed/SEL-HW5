import java.util.ArrayList;
import java.util.Random;

public class NaiveMain {
    public static void main(String[] args) {
        ArrayList<String> input = generateRandomStrings(100000, 5);
//        ArrayList<String> input = manualInit();
        ArrayList<String> printed = new ArrayList<>();
        for (int i = 0; i < input.size(); i++) {
            int cnt = 0;
            for (String value : input) {
                if (input.get(i).equals(value)) {
                    cnt += 1;
                }
            }
            if (cnt > 1) {
                boolean flag = true;
                for (String s : printed) {
                    if (s.equals(input.get(i))) {
                        flag = false;
                    }
                }
                if (flag) {
                    System.out.println(input.get(i));
                    printed.add(input.get(i));
                }
            }
        }
        System.out.println("\nNumber of repeated strings: " + printed.size());
    }

    public static ArrayList<String> manualInit() {
        ArrayList<String> input = new ArrayList<>();
        input.add("hi");
        input.add("hey");
        input.add("shayan");
        input.add("hiiiii");
        input.add("shayan");
        input.add("software");
        input.add("hi");
        return input;
    }

    public static ArrayList<String> generateRandomStrings(int numberOfStrings, int length) {
        ArrayList<String> randomStrings = new ArrayList<>();
        Random random = new Random();

        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        for (int i = 0; i < numberOfStrings; i++) {
            StringBuilder randomString = new StringBuilder();
            for (int j = 0; j < length; j++) {
                char randomChar = characters.charAt(random.nextInt(characters.length()));
                randomString.append(randomChar);
            }
            randomStrings.add(randomString.toString());
        }

        return randomStrings;
    }
}
