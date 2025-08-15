package main;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("coloque o número para calcular a fatorial: ");
        int factorial_number = scanner.nextInt();
        int number = Function.factorial(factorial_number);
        scanner.close();

        System.out.println(number);
    }
}
