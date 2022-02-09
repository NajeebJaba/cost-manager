/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelTest;

import cost.manager.Model.cost;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author user
 */
public class costTest {
    @Test
    public void testNullCost() {
        cost c = new cost();
        assertEquals(c, null);

    }
    
    @Test
    public void testCategory() {
        cost c = new cost();
        c.setCurrency("$");
        assertEquals(c.getCurrency(), "$");

    }

}
