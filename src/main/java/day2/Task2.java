package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int a = i.nextInt();
        int b = i.nextInt();
        if (a >= b) {
            System.out.println("Некорректный ввод");
        }
        for (int q = a + 1; q < b; q++) {
            if (q % 5 == 0 && q % 10 != 0) {
                System.out.print(q + " ");
            }
        }
    }
}

