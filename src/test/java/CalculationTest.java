import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationTest {
    public CalculationTest() {

    }

    void testCalculateArea(){
        Calculation calculation = new Calculation();
        assertEquals( 8, calculation.calculateArea(2, 4));
    }
    void testCalculateCircleACircumference(){
        Calculation calculation = new Calculation();
        assertEquals(18.84955592153876, calculation.calculateCircleCircumference(3));
    }
}