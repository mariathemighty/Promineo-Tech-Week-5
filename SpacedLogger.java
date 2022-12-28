package Wk5Coding;

public class SpacedLogger implements Logger {

	@Override
	public void Log(String x) {
		// TODO Auto-generated method stub
		
		//String word = "";
		for(int i=0; i< x.length(); i++) {
			//word = a.charAt(i) + " ";
			System.out.print(x.charAt(i) + " ");
			}
		//System.out.println(word);

	}

	@Override
	public void Error(String y) {
		// TODO Auto-generated method stub
		//String wordError = "";
		System.out.print("ERROR: ");
		for(int i=0; i< y.length(); i++) {
		//wordError = b.charAt(i) + " ";
		System.out.print(y.charAt(i) + " ");	
		}
		

	}

}
