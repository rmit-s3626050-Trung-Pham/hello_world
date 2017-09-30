/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Model.DatabaseConnection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author phamtrung
 */
public class DatabaseConnectionTest {
    
    DatabaseConnection dbConn = new DatabaseConnection();
    public DatabaseConnectionTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        dbConn = new DatabaseConnection();
    }
    
    @After
    public void tearDown() {
        
    }
    
    @Test
    public void testDBConnection(){
        assertTrue(dbConn.dbConnect());
    }
    
    @Test
    public void testCreateCarerAccount(){
    
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
