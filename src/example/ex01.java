package example;

/**
 * ex01
 */
public class ex01 {

    public static void main(String args[]) {
        System.out.print(fac(5));
    }

    // 用for
    private static int facfor(int num) {
        int total = 1;
        if (num > 2) {
            for (int i = 1; i <= num - 1; i++) {
                total *= (i + 1);
            }
        } else {
            total = num;
        }

        return total;
    }

    private static int fac(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * fac(num - 1);
        }
    }

}