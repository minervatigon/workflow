package bank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import gestor.GestorSensores;

public class BanckAccountTest {
    
    @Test
    @DisplayName("Crea una cuenta con saldo inicial")
    public void creaCuenta_balanceConsistente(){
        //Arrange
        int cantidad=1000;
        BankAccount cuenta = new BankAccount(cantidad);

        //Assert
        assertEquals(cantidad, cuenta.getBalance());
    }

    @Test
    @DisplayName("Retira dinero de la cuenta")
    public void retiraDinero_balanceConsistente(){
        //Arrange
        int cantidad=1000;
        BankAccount cuenta = new BankAccount(cantidad);
        //Act
        cuenta.withdraw(500);
        //Assert
        assertEquals(500, cuenta.getBalance());
    }

    @Test
    @DisplayName("Deposita dinero en la cuenta")
    public void depositaDinero_balanceConsistente(){
        //Arrange
        int cantidad=1000;
        BankAccount cuenta = new BankAccount(cantidad);
        //Act
        cuenta.deposit(500);
        //Assert
        assertEquals(1500, cuenta.getBalance());
    }


    @Test
    @DisplayName("Retira mas dinero del que hay en la cuenta")
    public void retiraDinero_balanceIncorrecto(){
        //Arrange
        int cantidad=1000;
        BankAccount cuenta = new BankAccount(cantidad);
        //Act
        //Assert
        try {
            cuenta.withdraw(1500);
        } catch (IllegalArgumentException e) {
            assertEquals("No hay suficiente saldo", e.getMessage());
        }
    }

    @Test
    @DisplayName("Deposita una cantidad negativa")
    public void depositaDinero_balanceIncorrecto(){
        //Arrange
        int cantidad=1000;
        BankAccount cuenta = new BankAccount(cantidad);
        //Act
        //Assert
        try {
            cuenta.deposit(-500);
        } catch (IllegalArgumentException e) {
            assertEquals("Cantidad no valida", e.getMessage());
        }
    }
}
