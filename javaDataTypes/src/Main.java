
/*
Input Format

The first line contains an integer, t , denoting the number of test cases.
Each test case, t , is comprised of a single line with an integer, n , which can be arbitrarily large or small.

Output Format

For each input variable n and appropriate primitive dataType,
you must determine if the given primitives are capable of storing it. If yes, then print:

n can be fitted in:
* dataType

If there is more than one appropriate data type,
print each one on its own line and order them by size (i.e.: byte<short<int<long).

If the number cannot be stored in one of the four aforementioned primitives, print the line:

n can't be fitted anywhere.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {

            try {

                long number = scanner.nextLong();
                System.out.println(number + " can be fitted in:");
                if (number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE)
                    System.out.println("* byte");
                if (number >= Short.MIN_VALUE && number <= Short.MAX_VALUE)
                    System.out.println("* short");
                if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE)
                    System.out.println("* int");
                if (number >= Long.MIN_VALUE && number <= Long.MAX_VALUE)
                    System.out.println("* long");

            } catch (Exception exception) {
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }

        }

    }
}