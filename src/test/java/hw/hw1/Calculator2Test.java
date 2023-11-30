package hw.hw1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


public class Calculator2Test {
    @Test
    public void testCalculateDiscountWithValidArguments() {
        Calculator2 calculator = new Calculator2();
        double purchaseAmount = 100.0;
        double discountPercentage = 20.0;

        double discountedAmount = calculator.calculateDiscount(purchaseAmount, discountPercentage);

        // Проверяем, что скидка была правильно применена
        Assertions.assertThat(discountedAmount).isEqualTo(80.0);
    }

    @Test
    public void testCalculateDiscountWithNegativePurchaseAmount() {
        Calculator2 calculator = new Calculator2();
        double purchaseAmount = -100.0;
        double discountPercentage = 20.0;

        // Проверяем, что метод выбрасывает исключение при отрицательной сумме покупки
        Assertions.assertThatThrownBy(() -> calculator.calculateDiscount(purchaseAmount, discountPercentage))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Invalid arguments");
    }

    @Test
    public void testCalculateDiscountWithInvalidDiscountPercentage() {
        Calculator2 calculator = new Calculator2();
        double purchaseAmount = 100.0;
        double discountPercentage = 120.0;

        // Проверяем, что метод выбрасывает исключение при недопустимом проценте скидки
        Assertions.assertThatThrownBy(() -> calculator.calculateDiscount(purchaseAmount, discountPercentage))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Invalid arguments");
    }
}
