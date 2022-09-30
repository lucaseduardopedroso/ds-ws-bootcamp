package entities.tests;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import entities.Financing;

public class FinancingTest {
    @Test
    public void constructorShouldCreateNewFinancingWhenValidData() {
        // Arrange
        Double totalAmount = 100000.0;
        Double income = 2000.0;
        Integer months = 80;

        // Act
        Financing financing = new Financing(totalAmount, income, months);

        // Assert
        assertEquals(totalAmount, financing.getTotalAmount());
        assertEquals(income, financing.getIncome());
        assertEquals(months, financing.getMonths());
    }

    @Test
    public void constructorShouldThrowIllegalArgumentExceptionWhenInvalidData() {
        // Arrange
        Double totalAmount = 100000.0;
        Double income = 2000.0;
        Integer months = 20;

        // Act
        //new Financing(totalAmount, income, months);

        // Assert
        assertThrows(IllegalArgumentException.class, () -> new Financing(totalAmount, income, months));
    }

    @Test
    public void setTotalAmountShouldUpdateTotalAmountWhenValidData() {
        // Arrange
        Double totalAmountUpdate = 50000.0;
        Financing financing = new Financing(100000.0, 2000.0, 80);

        // Act
        financing.setTotalAmount(totalAmountUpdate);

        // Assert
        assertEquals(totalAmountUpdate, financing.getTotalAmount());
    }

    @Test
    public void setAmountShouldThrowIllegalArgumentExceptionWhenInvalidData() {
        // Arrange
        Double totalAmountUpdated = 200000.0;
        Financing financing = new Financing(100000.0, 2000.0, 80);

        // Act
        //financing.setTotalAmount(totalAmountUpdated);

        // Assert
        assertThrows(IllegalArgumentException.class, () -> financing.setTotalAmount(totalAmountUpdated));
    }

}
