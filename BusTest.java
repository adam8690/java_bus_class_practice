import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusTest{
  Bus bus;
  Person person;

  @Before
  public void before() {
    bus = new Bus("1");
  }

  @Test
  public void busStartsEmpty() {
    assertEquals( true, bus.isEmpty() );
  }
  @Test
  public void busCountStartsZero() {
    assertEquals( 0, bus.count() );
  }

  @Test
  public void addingElevenReturnsOneAndTenPassengers() {
    assertEquals( 1, bus.add(11) );
    assertEquals( 10, bus.count() );
  }  

  @Test
  public void addingLessThanTenReturnsZeroAndFivePassengers() {
    assertEquals( 0, bus.add(5) );
    assertEquals( 5, bus.count() );
  }

  @Test
  public void emptyBusIsNotFull() {
    assertEquals(false, bus.isFull());
  }

  @Test
  public void fullBusIsFull(){
    bus.add(11);
    assertEquals(true, bus.isFull());
  } 
}