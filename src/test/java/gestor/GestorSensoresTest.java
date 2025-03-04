package gestor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.annotation.Target;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GestorSensoresTest {

    @Test
    @DisplayName("Agregar sensor anyade sensor a la lista")

    public void agregarSensor_SenjsorNoExistente_AnyadeSensorLista(){
        //Arrange
        GestorSensores gestor = new GestorSensores();
        String nombre = "Nuevo Sensor";

        //Act
        gestor.agregarSensor(nombre);

        //Assert
        assertEquals(1, gestor.getNumeroSensores());
    }

    @Test
    @DisplayName("Borra un sensor de la lista existente")
    public void borrarSensor_SesorExistente_BorrarSensor(){
        //Arrange
        GestorSensores gestor = new GestorSensores();
        String nombre = "SensorAEliminar";
        gestor.agregarSensor(nombre);
        //Act
        gestor.borrarSensor(nombre);
        //Assert
        assertEquals(0, gestor.getNumeroSensores());
    }

    @Test
    @DisplayName("Borrar sensor no existente lanza excepcion")
    public void borrarSensor_SensorNoExistente_LanzaExcepcion(){
        //Arrange
        GestorSensores gestor = new GestorSensores();
        String nombre = "SensorAEliminar";
        //Act
        //Assert
        try {
            gestor.borrarSensor(nombre);
        } catch (IllegalArgumentException e) {
            assertEquals("Sensor no existe", e.getMessage());
        }
    }

    @Test
    @DisplayName("Agregar sensor existente lanza excepcion")
    public void agregarSensor_SensorExistente_LanzaExcepcion(){
        //Arange
        GestorSensores gestor = new GestorSensores();
        String nombre = "SensorExistente";
        gestor.agregarSensor(nombre);
        //Act
        //Assert
        try {
            gestor.agregarSensor(nombre);
        } catch (IllegalArgumentException e) {
            assertEquals("Sensor ya existe", e.getMessage());
        }
    }

    @Test
    @DisplayName("Comprobar numero de sensores sin anyadir")
    public void getNumeroSensores_SinSensores_CeroSensores(){
        //Arrange
        GestorSensores gestor = new GestorSensores();
        //Act
        //Assert
        assertEquals(0, gestor.getNumeroSensores());
    }
   

    
    
}
