import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LeapYearTest {

    //Tester om commit fungerer
    @Test
    public void if_year_modulo_400() {
        assertTrue(LeapYear.isLeapYear(2000));
    }

    @Test
    public void if_year_modulo_4_and_modulo_not_100() {
        assertTrue(LeapYear.isLeapYear(2024));
    }

    @Test
    public void if_year_modulo_not_4() {
        assertFalse(LeapYear.isLeapYear(1754));
    }

    @Test
    public void if_year_modulo_100_and_modulo_not_400() {
        assertFalse(LeapYear.isLeapYear(170));
    }

}
