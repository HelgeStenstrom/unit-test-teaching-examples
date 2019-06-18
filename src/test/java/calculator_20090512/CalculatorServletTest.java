package calculator_20090512;

import org.jmock.integration.junit3.MockObjectTestCase;

import java.util.HashMap;

public class CalculatorServletTest extends MockObjectTestCase {

  private Calculator calculator;
  private final CalculatorServlet calculatorServlet = new CalculatorServlet();
  
  @Override
  protected void setUp() throws Exception {
    super.setUp();
    calculator = mock(Calculator.class);
  }
  
  public void testAdditionOfTwoInts() {
    HashMap<String, String[]> params = new HashMap<>();
    params.put("num1", new String[] {"5"});
    params.put("num2", new String[] {"2"});
    params.put("oper", new String[] {"+"});
    
    String response = calculatorServlet.calculate(params);
    assertEquals("7", response);
  }
  
  
  public void testAdditionOfNegativeInts() {
    HashMap<String, String[]> params = new HashMap<>();
    params.put("num1", new String[] {"-5"});
    params.put("num2", new String[] {"2"});
    params.put("oper", new String[] {"+"});
    
    String response = calculatorServlet.calculate(params);
    assertEquals("-3", response);
  }
  
  
}
