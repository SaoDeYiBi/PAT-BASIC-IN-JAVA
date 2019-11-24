package personal.gaozhiqiang.patbasic;

import java.util.Scanner;

public class T1001 {

    public static void main(String[] args) {
        try (
                Scanner scanner = new Scanner(System.in)
        ) {
            int count = 0;
            int inNum = scanner.nextInt();
            while (inNum != 1) {
                boolean odd = (inNum & 1) == 1;
                if (odd) {
                    inNum = 3 * inNum + 1;
                }
                inNum = inNum >>> 1;
                count++;
            }
            System.out.println(count);
        }
    }

}
