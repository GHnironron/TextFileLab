/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package quickcart.reading.and.writing.files;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author chris
 */
public class QuickcartReadingAndWritingFilesTest {
    
    public QuickcartReadingAndWritingFilesTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of readItemsFromFile method, of class QuickcartReadingAndWritingFiles.
     */
    @Test
    public void testReadItemsFromFile() {
        System.out.println("readItemsFromFile");
        ArrayList<String> expResult = null;
        ArrayList<String> result = QuickcartReadingAndWritingFiles.readItemsFromFile();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of writeReceiptToFile method, of class QuickcartReadingAndWritingFiles.
     */
    @Test
    public void testWriteReceiptToFile() {
        System.out.println("writeReceiptToFile");
        String message = "";
        QuickcartReadingAndWritingFiles.writeReceiptToFile(message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of parsePrice method, of class QuickcartReadingAndWritingFiles.
     */
    @Test
    public void testParsePrice() {
        System.out.println("parsePrice");
        String line = "";
        double expResult = 0.0;
        double result = QuickcartReadingAndWritingFiles.parsePrice(line);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class QuickcartReadingAndWritingFiles.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        QuickcartReadingAndWritingFiles.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
