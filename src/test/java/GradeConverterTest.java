import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GradeConverterTest {

  private GradeConverter converter;

  @Before
  public void setUp() throws Exception {
    converter = new GradeConverter();
  }

  @Test
  public void testConverter1() {
    String expected = "A";
    String actual = converter.convert(100);
    assertEquals(expected, actual);
  }

  //Test code hello wordl

  @Test
  public void testConverter2() {
    String expected = "A";
    String actual = converter.convert(90);
    assertEquals(expected, actual);
  }
}