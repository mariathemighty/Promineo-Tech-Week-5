package Wk5Coding;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Logger logger = new AsteriskLogger();
	logger.Log("Test");
	System.out.println();
	logger.Error("Test Error");
	System.out.println();
	

Logger logger2 = new SpacedLogger();
	logger2.Log("Test2");
	System.out.println();
	logger2.Error("Test2 Error");
	System.out.println();

	}

}
