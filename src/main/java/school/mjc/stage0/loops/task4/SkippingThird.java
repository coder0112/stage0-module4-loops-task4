package school.mjc.stage0.loops.task4;

public class SkippingThird {
    public void printUntilButThird(int lastPrinted) {
        if (lastPrinted < 1) {

        }
        for (int i = 1; i <= lastPrinted; i++) {
            if (i % 3 != 0) {
                System.out.println(i);
            }
        }
    }
}
