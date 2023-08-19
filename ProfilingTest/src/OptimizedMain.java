import java.util.*;

public class OptimizedMain {
    public static void main(String[] args) {
        ArrayList<String> input = generateRandomStrings(1000000, 2);
    //        ArrayList<String> input = manualInit();
        int numberOfRepeated = 0;
        while (true) {
            String repeatedStr = "";
            for (String s : input) {
                int cnt = 0;
                for (String str : input) {
                    if (s.equals(str)) {
                        cnt += 1;
                        if (cnt > 1) {
                            repeatedStr = s;
                            break;
                        }
                    }
                }
            }
            if (repeatedStr.equals("")) {
                break;
            } else {
                System.out.println(repeatedStr);
                numberOfRepeated += 1;
                Iterator<String> iterator = input.iterator();
                while (iterator.hasNext()) {
                    String nextString = iterator.next();
                    if (nextString.equals(repeatedStr)) {
                        iterator.remove();
                    }
                }
            }
        }
        System.out.println("\nNumber of repeated strings: " + numberOfRepeated);
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
