package ChatBot;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        // #1
        System.out.println("Hello! My name is MiMi");
        System.out.println("I was created in 2022");
        // #2
        System.out.println("Please, remind me your name.");

        Scanner scanner = new Scanner(System.in);

        System.out.printf("What a great name you have, %s!\n", scanner.next());
        // #3
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        int remainder3 = scanner.nextInt();
        int remainder5 = scanner.nextInt();
        int remainder7 = scanner.nextInt();
        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;

        System.out.printf("Your age is %d; that's a good time to start programming!\n", age);
        //4
        System.out.println("Now I will prove to you that I can count to any number you want");
        int count = scanner.nextInt();

        for (int i = 0; i <= count; i++) {
            System.out.printf("%d !\n", i);
        }
        //5
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");

        int j = 0;

        while (j <= 0) {
            int userAnswer = scanner.nextInt();
            switch (userAnswer) {
                case 2 -> {
                    System.out.println("Great, you right!");
                    j += 1;
                }
                default -> {
                    System.out.println("Please, try again.");
                }
            }
        }
        System.out.println("Goodbye, have a nice day!");
    }
}
