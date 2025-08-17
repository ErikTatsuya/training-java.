package main;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        while(true){
            Scanner scanner = new Scanner(System.in);

            System.out.println("coloque o número para calcular a fatorial: ");
            int factorial_number = scanner.nextInt();

            int number = Function.factorial(factorial_number);

            int turn_off = 0;
            if (number == turn_off){
                System.out.println("Programa encerrado.");
                break;
            }

            scanner.close();
            System.out.println(number);}
    }
}
