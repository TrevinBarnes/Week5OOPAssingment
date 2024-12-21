package oopweek5;



public class AsteriskLogger implements Logger{

	@Override
	public void log(String log) {
		//needs to take the string and put (***"Hello"***)
		 {
			log/*<-- this is why */ ="***"+ "Hello" +"***";
			System.out.println(log);// is printing to console
		} 
		
		
	}

	@Override
	public void error(String error) {
		// needs to take the string and put it in a box of asterisks
		error="*****************"+ "***Error:Hello***"+ "*****************";
		System.out.println(error);			
					
		/* 
		 ***************** 
		 ***Error:Hello***
		 *****************
		 */

		}

}
