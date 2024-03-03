
/*
Task

Given an integer,n, perform the following conditional actions:

If n is odd, print Weird
If n is even and in the inclusive range of  to , print Not Weird
If n is even and in the inclusive range of  to , print Weird
If n is even and greater than , print Not Weird

Complete the stub code provided in your editor to print whether or not  is weird.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        if(N % 2 == 1) {
            System.out.println("Weird");
        }else if(N % 2 == 0 && 2<=N && N<=5) {
            System.out.println("Not Weird");
        }else if(N % 2 == 0 && 6<=N && N<=20){
            System.out.println("Weird");
        }else if(N % 2 == 0 && N>20) {
            System.out.println("Not Weird");
        }

        scanner.close();


    }
}