package functions_behaviour;

public class Functions {
	
	
	
	public String[] date_Funtion(String date) {
		String date1=date;
		String [] array_date=date1.split("/");
		return array_date;	
	}
	
	public String[] subjects_Function(String sub) {
		String [] array_Sub=sub.split(",");
		return array_Sub;
		
	}
}
