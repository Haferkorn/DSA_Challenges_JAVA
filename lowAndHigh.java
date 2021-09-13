public class Kata {
    public static void main(String[] args) {
        System.out.println(highAndLow("1 1 3"));
        //String[] test= cuttoArray("3 4 5");
        //System.out.println(test[1]);
    }

    public static String[] cuttoArray(String number) {
        String arr[] = number.split(" ");
        return arr;
    }

    public static String highAndLow(String numbers) {
        String[] numberarray = cuttoArray(numbers);
        int minimum=Integer.parseInt(numberarray[0]);
        int maximum=Integer.parseInt(numberarray[0]);

        for (String digit : numberarray) {

            if (Integer.parseInt(digit) > maximum) {
                maximum = Integer.parseInt(digit);
            } else if (Integer.parseInt(digit) < minimum) {
                minimum = Integer.parseInt(digit);
            } else {
                continue;
            }

        }return minimum + " " + maximum;
    }
}
