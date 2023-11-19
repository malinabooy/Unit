package HW.hw3;

class CheckNumber {
    public boolean evenOddNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean numberInInterval(int n) {
        if (n > 25 && n < 100) {
            return true;
        } else{
            return false;
        }
    }
}
