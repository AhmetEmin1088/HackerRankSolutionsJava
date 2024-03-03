/*
        Task
         In this challenge, you must read 3 integers from stdin and then print them to stdout.
         Each integer must be printed on a new line.

        Input Format
         There are 3 lines of input, and each line contains a single integer.

        Sample Input
         42
         100
         125

        Sample Output
         42
         100
         125
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


    }
}