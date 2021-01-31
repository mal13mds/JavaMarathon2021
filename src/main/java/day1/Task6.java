package day1;

public class Task6 {
    public static void main(String[] args) {
        int k = 5;
        int a = 1;
        int p = a * k;
        while (a < 10) {
            System.out.println(a + " x " + k + " = " + p);
            a++;
            p = a * k;
        }
    }
}
