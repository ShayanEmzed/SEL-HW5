import java.util.*;

public class OptimizedMain {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Press any key to start ...");
//        scanner.nextLine();
        ArrayList<String> input = generateRandomStrings(10000000, 5);
//        ArrayList<String> input = manualInit();
        HashMap<String, Integer> dict = new HashMap<>();
        HashMap<String, Integer> printed = new HashMap<>();
        for (String s : input) {
            if (dict.containsKey(s)) {
                if (!printed.containsKey(s)) {
                    printed.put(s, 1);
                    System.out.println(s);
                }
            } else {
                dict.put(s, 1);
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
