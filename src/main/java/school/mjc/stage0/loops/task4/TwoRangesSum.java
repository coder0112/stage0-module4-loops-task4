package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int n, int m) {
        int sum = 0, s = 0;
        if (m < 0) {
            System.out.println("last number in row is negative");
            return;
        } else if (n > m) {
            System.out.println("number to skip is bigger then the last");
            return;
        }
        for (int i = 1; i <= m; i++) {
            if (i <= n) {
                sum += i;
            } else {
                s += i;
            }
        }
        System.out.println("skipped sum is " + sum + "\ncounted sum is " + s);
    }
}
