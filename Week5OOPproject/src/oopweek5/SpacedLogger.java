package oopweek5;



public class SpacedLogger implements Logger{
	
	@Override
	public void log(String log) {
		//needs to take the string and put (***"Hello"***)
		String result = "H e l l o";
		System.out.println(result);
	}

	@Override
	public void error(String error) {
		// needs to be spaced between each letter
		String result2= "ERROR: H e l l o";
		System.out.println(result2);
			
	}
		
		
}
