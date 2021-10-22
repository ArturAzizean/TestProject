package oca;

public class FeedingSchedule {
    public static void main(String[] args) {
        boolean keepGoing = true;
        int count = 0;
        int x = 3;

        while (count++ < 3) {
            int y = (1 + 2 * count) % 3;

            switch (y) {
                default:
                case 0: x -= 1; break; // if y not equals 0 or 1 by default will be case 0
                case 1: x += 5;
            }
        }
        System.out.println(x);
    }
}
