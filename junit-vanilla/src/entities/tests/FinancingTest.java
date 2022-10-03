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
    public void setTotalAmountShouldThrowIllegalArgumentExceptionWhenInvalidData() {
        // Arrange
        Double totalAmountUpdated = 200000.0;
        Financing financing = new Financing(100000.0, 2000.0, 80);

        // Act
        //financing.setTotalAmount(totalAmountUpdated);

        // Assert
        assertThrows(IllegalArgumentException.class, () -> financing.setTotalAmount(totalAmountUpdated));
    }

    @Test
    public void setIncomeShouldUpdateIncomeWhenValidData() {
        // Arrange
        Double incomeUpdated = 3000.0;
        Financing financing = new Financing(100000.0, 2000.0, 80);

        // Act
        financing.setIncome(incomeUpdated);

        // Assert
        assertEquals(incomeUpdated, financing.getIncome());
    }

    @Test
    public void setIncomeShouldThrowIllegalArgumentExceptionWhenInvalidData() {
        // Arrange
        Double incomeUpdated = 1000.0;
        Financing financing = new Financing(100000.0, 2000.0, 80);

        // Act
        //financing.setIncome(incomeUpdated);

        // Assert
        assertThrows(IllegalArgumentException.class, () -> financing.setIncome(incomeUpdated));
    }

    @Test
    public void setMonthsShouldUpdateMonthsWhenValidData() {
        // Arrange
        Integer monthsUpdated = 160;
        Financing financing = new Financing(100000.0, 2000.0, 80);

        // Act
        financing.setMonths(monthsUpdated);

        // Assert
        assertEquals(monthsUpdated, financing.getMonths());
    }

    @Test
    public void setMonthsShouldThrowIllegalArgumentExceptionWhenInvalidData() {
        // Arrange
        Integer monthsUpdated = 20;
        Financing financing = new Financing(100000.0, 2000.0, 80);

        // Act
        //financing.setMonths(monthsUpdated);

        // Assert
        assertThrows(IllegalArgumentException.class, () -> financing.setMonths(monthsUpdated));
    }

    @Test
    public void entryShouldReturnCorrectValue() {
        // Arrange
        Double totalAmount = 100000.0;
        Double income = 2000.0;
        Integer months = 80;
        Double expectedValue = 20000.0;
        Financing financing = new Financing(totalAmount, income, months);

        // Act
        Double result = financing.entry();

        // Assert
        assertEquals(expectedValue, result);
    }

    @Test
    public void quotaShouldReturnCorrectValue() {
        // Arrange
        Double totalAmount = 100000.0;
        Double income = 2000.0;
        Integer months = 80;
        Double expectedValue = 1000.0;
        Financing financing = new Financing(totalAmount, income, months);

        // Act
        Double result = financing.quota();

        // Assert
        assertEquals(expectedValue, result);
    }
}
