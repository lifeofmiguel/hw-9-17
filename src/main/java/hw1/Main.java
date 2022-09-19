package hw1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("what the temp outside? high, low, or humid?");
        String temp = scan.nextLine();

        if (temp.equalsIgnoreCase("high")){
            System.out.println("sunblock may be needed");
        } else if (temp.equalsIgnoreCase("low")){
            System.out.println("a coat may be needed");
        } else if (temp.equalsIgnoreCase("humid")){
            System.out.println("It's muggy!");
        }
    }
}
