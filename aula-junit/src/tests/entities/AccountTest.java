package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Account;

public class AccountTest {

    @Test
    public void depositShouldIncreaseBalanceWhenPositiveAmount() {
        // Arrange
        Double amount = 200.0;
        Double expectedBalance = 196.0;
        Account account = new Account(1L, 0.0);
        // Act
        account.deposit(amount);
        // Assert
        Assertions.assertEquals(expectedBalance, account.getBalance());
    }
}
