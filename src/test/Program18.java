package test;

public class Program18 {

	
	public static boolean isNumberOrNot(String ip) {
		
		try {
			Integer.parseInt(ip);
		}
		catch(Exception e) {
			return false;
		}
		return true;
	}
}
