/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Resources;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/**
 *
 * @author tonyM
 */
public class PersonaTest {
    
    
    /**
     * Test of calcAnnoNacimiento method, of class Persona.
     */
    @Test
    public void testCalcAnnoNacimiento() {
        System.out.println("calcAnnoNacimiento");
        Persona instance = new Persona();
        instance._edad = 26;
        int expResult = 1997;
        int result = instance.calcAnnoNacimiento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        if(result!=expResult)
//        { 
//            fail("The test case is a prototype.");
//        
//        }
      
    }


    
}
