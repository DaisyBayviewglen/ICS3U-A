package day2;

public class ExampleTwo {
    public static void main(String[] args) {
        int x = 4, y = 7;
        double a = 6.4, b = 7.9;
        double c = 1.0;

        int sum = x + y; // sum is assigned x_y
                         // = is the assigmnet opperator

        int p = y % 2; // remainder (modulus)
        p = y / 2; // division

        double mult = a * b; // double * double = double
        x = x - 1; // substarct 1from x and signs it back to x

        int numStudents = 14;
        numStudents = numStudents + 1;
        numStudents++; // line 21 same as line 20
        numStudents = numStudents - 1;
        numStudents--; // line 23 same as 22

        numStudents += 3; // same as numStudents = numStudents + 3;

        numStudents -= 2; // same as numStudents = numStudents - 1;

        double temperature = 12.9;

        temperature *= 2; // same as temperature = temperature *2;

        temperature /= 2; // same as temperature = temperature / 2;

        x %= 2; // same as temperature = temperature % 2;

    }

}
