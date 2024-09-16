package day2;

public class ExampleOne {
    public static void main(String[] args) {
        // add the digits from a four digit number

        int num = 3049;
        int digit1 = num / 1000;
        int digit2 = num / 100 % 10; // 4753 / 100 = 47, 47% 10 = 7
        int digit3 = num / 10 % 10;
        int digit4 = num % 10;

        System.out.println(digit1 + digit2 + digit3 + digit4);

    }

}
