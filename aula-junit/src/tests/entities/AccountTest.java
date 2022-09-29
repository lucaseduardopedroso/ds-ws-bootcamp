package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Account;
import tests.factory.AccountFactory;

public class AccountTest {

    @Test
    public void depositShouldIncreaseBalanceWhenPositiveAmount() {
        // Arrange
        Double amount = 200.0;
        Double expectedBalance = 196.0;
        Account account = AccountFactory.createEmptyAccount();
        // Act
        account.deposit(amount);
        // Assert
        Assertions.assertEquals(expectedBalance, account.getBalance());
    }

    @Test
    public void depositShouldDoNothingWhenNegativeAmount() {
        // Arrange
        Double amount = -200.0;
        Double expectedValue = 100.0;
        Account account = AccountFactory.createAccount(expectedValue);
        // Act
        account.deposit(amount);
        // Assert
        Assertions.assertEquals(expectedValue, account.getBalance());
    }
}
