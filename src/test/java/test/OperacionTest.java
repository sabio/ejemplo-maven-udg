package test;

import com.udg.prueba.service.OperacionService;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class OperacionTest{
    
    private static OperacionService operacionService;
    
    @BeforeAll
    public static void setup() {
        operacionService = new OperacionService();
    }
    
    @DisplayName("Probando suma")
    @Test
    void testSuma() throws Exception {
        assertEquals(operacionService.suma(2, 2), new Integer(4));   
    }
    
    @DisplayName("Probando resta")
    @Test
    void testResta() throws Exception {
        assertEquals(operacionService.resta(2, 2), new Integer(0));   
    }
}
