package personal.gaozhiqiang.patbasic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class T1005 {

    public static void main(String[] args) {
        try (
                Scanner scanner = new Scanner(System.in)
        ) {
            int arraySize = scanner.nextInt();
            int[] inNums = new int[arraySize];
            List<Integer> outNums = new ArrayList<>(arraySize);
            Set<Integer> covered = new HashSet<>();

            for (int i = 0; i < arraySize; i++) {
                int inNum = scanner.nextInt();
                inNums[i] = inNum;
            }

            for (int i = 0; i < arraySize; i++) {
                int tmp = inNums[i];
                if (covered.contains(tmp)) {
                    continue;
                }
                while (tmp != 1) {
                    boolean odd = (tmp & 1) == 1;
                    if (odd) {
                        tmp = 3 * tmp + 1;
                    }
                    tmp = tmp >>> 1;
                    covered.add(tmp);
                }
            }

            for (int i = 0; i < arraySize; i++) {
                if (covered.contains(inNums[i])) {
                    continue;
                }
                outNums.add(inNums[i]);
            }
            outNums.sort(Comparator.comparingInt(num -> num));

            int outSize = outNums.size();
            for (int i = outSize - 1; i >= 0; i--) {
                System.out.print(outNums.get(i));
                if (i != 0) {
                    System.out.print(" ");
                }
            }
        }
    }

}

/*
    我们称一个数列中的某个数 n 为“关键数”，如果 n 不能被数列中的其他数字所覆盖
 */