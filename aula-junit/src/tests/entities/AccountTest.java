package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Account;
import tests.factory.AccountFactory;

public class AccountTest {

    @Test
    public void depositShouldIncreaseBalanceWhenPositiveAmount() {
        // Arrange
        double amount = 200.0;
        double expectedBalance = 196.0;
        Account account = AccountFactory.createEmptyAccount();
        // Act
        account.deposit(amount);
        // Assert
        Assertions.assertEquals(expectedBalance, account.getBalance());
    }

    @Test
    public void depositShouldDoNothingWhenNegativeAmount() {
        // Arrange
        double amount = -200.0;
        double expectedValue = 100.0;
        Account account = AccountFactory.createAccount(expectedValue);
        // Act
        account.deposit(amount);
        // Assert
        Assertions.assertEquals(expectedValue, account.getBalance());
    }

    @Test
    public void fullWithdrawShouldClearBalanceAndReturnFullBalance(){
        // Arrange
        double expectedValue = 0.0;
        double initialBalance = 800.0;
        Account account = AccountFactory.createAccount(initialBalance);
        // Act
        double result = account.fullWithdraw();
        // Assert
        Assertions.assertTrue(expectedValue == account.getBalance());
        Assertions.assertTrue(result == initialBalance);
    }

    @Test
    public void withdrawShouldDecreaseBalanceWhenSufficientBalance(){
        // Arrange
        double amount = 500.0;
        double expectedValue = 300.0;
        Account account = AccountFactory.createAccount(800.0);
        // Act
        account.withdraw(amount);
        // Assert
        Assertions.assertEquals(expectedValue, account.getBalance());
    }

    @Test
    public void withdrawShouldThrowExceptionWhenInsufficientBalance(){
        // Arrange
        double amount = 801.0;
        Account account = AccountFactory.createAccount(800.0);
        // Act
        // account.withdraw(amount);
        // Assert
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(amount);
        });
    }
}
