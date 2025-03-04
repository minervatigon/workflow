package factorial;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FactTest {

    Fact factorial;

    @BeforeEach
    public void initTest(){
        factorial = new Fact();
    }
    /*
     * 1. 0 -> 1
     * 2. 1 -> 1
     * 3. 2 -> 2
     */

     @Test
     public void compute_Fact0_Returns0 (){
            //Act
            int result = factorial.compute(0);

            //Arrange
            assertEquals(1, result);
     }

     @Test
     public void compute_Fact2_Returns2 (){
            //Act
            int result = factorial.compute(2);

            //Arrange
            assertEquals(2, result);
     }


}
