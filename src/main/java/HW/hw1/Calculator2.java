package HW.hw1;

public class Calculator2 {
    public double calculateDiscount(double purchaseAmount, double discountPercentage) {
        if (purchaseAmount < 0 || discountPercentage < 0 || discountPercentage > 100) {
            throw new ArithmeticException("Invalid arguments");
        }
        double discountAmount = (purchaseAmount * discountPercentage) / 100;
        return purchaseAmount - discountAmount;
    }

}
