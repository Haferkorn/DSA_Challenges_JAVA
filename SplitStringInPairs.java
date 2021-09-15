import java.util.ArrayList;

public class SplitSting {
    public static String checkModus(String str) {
        String check;
        if (str.length() % 2 == 0) {
            check = "even";
        } else {
            check = "odd";
        }
        return check;
    }



    public static ArrayList<String> getPairs(String str) {
        String pair = "";
        ArrayList<String> arr = new ArrayList<>();
        String modus = checkModus(str);
        if (modus.equals("even")) {
            for (int i = 0; i < str.length() - 1; i += 2) {
                if (pair.length() < 2) {
                    pair += str.charAt(i);
                    pair += str.charAt(i + 1);
                    arr.add(pair);
                } else {
                    pair = "";
                    pair += str.charAt(i);
                    pair += str.charAt(i + 1);
                    arr.add(pair);
                }
            }
            return arr;
        } else if (modus.equals("odd")) {
            for (int i = 0; i < str.length() - 2; i += 2) {
                if (pair.length() < 2) {
                    pair += str.charAt(i);
                    pair += str.charAt(i + 1);
                    arr.add(pair);
                } else {
                    pair = "";
                    pair += str.charAt(i);
                    pair += str.charAt(i + 1);
                    arr.add(pair);
                }
            }
            pair="";
            pair += str.charAt(str.length()-1) + "_";
            arr.add(pair);
        }
        return arr;
    }
}
