/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelTest;

import cost.manager.Model.category;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author user
 */
public class categoryTest {

    @Test
    public void testNullCategory() {
        category c = new category();
        assertEquals(c, null);

    }

    @Test
    public void testDuplicateCategory() {
        category c = new category("TEST");
        category d = new category("TEST");
        assertEquals(c, d);

        category a = new category("TEST");
        category b = new category("TEST1");
        assertNotEquals(c, d);

    }

    @Test
    public void testCategory() {
        category c = new category("TEST");
        assertEquals(c.toString(), "TEST");

        category a = new category("T");
        assertEquals(c.toString(), "T");
    }

}
