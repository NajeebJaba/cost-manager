/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelTest;

import cost.manager.Model.user;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author user
 */
public class userTest {
    @Test
    public void testNullUser() {
        user c = new user();
        assertEquals(c, null);

    }


    @Test
    public void testUser() {
        user c = new user();
        c.setEmail("ABC@ABC.com");
        assertEquals(c.getEmail(), "ABC@ABC.com");

    }

}
