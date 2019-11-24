package personal.gaozhiqiang.patbasic;

import java.util.Scanner;

@SuppressWarnings("ALL")
public class T1006 {

    public static void main(String[] args) {
        try (
                Scanner scanner = new Scanner(System.in)
        ) {
            int[] counts = {0, 0, 0}; // 个 十 百

            String inLine = scanner.nextLine();
            char[] inChars = inLine.toCharArray();

            int idx = 0;
            for (int i = inChars.length - 1; i >= 0; i--) {
                counts[idx++] = inChars[i] - 48;
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < counts[2]; i++) {
                sb.append('B');
            }
            for (int i = 0; i < counts[1]; i++) {
                sb.append('S');
            }
            for (int i = 1; i <= counts[0]; i++) {
                sb.append(i);
            }
            System.out.println(sb.toString());
        }
    }

}
