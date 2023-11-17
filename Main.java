import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int value = new Scanner(System.in).nextInt();
        int i;
        for(i = 1; i * i < value; i = i + 1) {
            if (value % i == 0) {
                System.out.println(i + "*" + value / i + "\n" + value / i + "*" + i);
            }
        }
        if (i * i == value) {
            System.out.println(i + "*" + i);
        }
    }
}
