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

        System.out.printf("Your age is %d; that's a good time to start programming!", age);
    }
}
