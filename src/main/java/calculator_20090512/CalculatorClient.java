package calculator_20090512;

class CalculatorClient {

  /**
   * @param args command line arguments
   * @throws Exception some exception might be thrown
   */
  public static void main(String[] args) throws Exception {
    Server server = new Server();
    server.start(8080);
    
  }

}
