import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Rule;
import testy2.MeasureTime;
import testy2.TableSort;

public class TestFile extends MeasureTime{
    
    TableSort tableSort;

    @Rule
    public MeasureTime timer = new MeasureTime();
    
    public TestFile() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        tableSort = new TableSort();
        tableSort.fillTable();
    }
    
    @After
    public void tearDown() {
    }
    
   @Test
    public void testQuicksort() {
        tableSort.quicksort(tableSort.randomNumbers, 0, 9999999);
    }

}
