import java.util.ArrayList;
import java.util.Random;

public class NaiveMain {
    public static void main(String[] args) {
        ArrayList<String> input = generateRandomStrings(1000000, 5);
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
        System.out.println(printed.size());
//        for (String s : ans){
//            System.out.println(s);
//        }
    }

    public static ArrayList<String> manualInit() {
        ArrayList<String> input = new ArrayList<>();
        input.add("a");
        input.add("ab");
        input.add("abc");
        input.add("abcd");
        input.add("ab");
        input.add("ad");
        input.add("aee");
        input.add("aqqqq");
        input.add("ad");
        input.add("abbb");
        input.add("ar");
        input.add("aaa");
        input.add("aaa");
        input.add("aqq");
        input.add("qwea");
        input.add("dfdasa");
        input.add("xcxa");
        input.add("rra");
        input.add("ar");
        input.add("ayyy");
        input.add("ai");
        input.add("al");
        input.add("aq");
        input.add("adfsad");
        input.add("axcv");
        input.add("asdfasasfs");
        input.add("hiii");
        input.add("a");
        input.add("aqqqq");
        input.add("abc");
        input.add("abbb");
        input.add("aqq");
        input.add("qwea");
        input.add("dfdasa");
        input.add("rra");
        input.add("al");
        input.add("ayyy");
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
