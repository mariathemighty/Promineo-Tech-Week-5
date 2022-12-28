package Wk5Coding;

public class AsteriskLogger implements Logger {

	@Override
	public void Log(String x) {
		// TODO Auto-generated method stub
		System.out.println("***" + x + "***");
	}
	@Override
	public void Error(String y) {
		// TODO Auto-generated method stub

		System.out.println("***********************************");
		System.out.println("***Error:" + y + "***");
		System.out.println("***********************************");
		
	}

}
