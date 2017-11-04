package bruteforce;

public class bruteforce {
	public bruteforce() {
		
	}
	
	public String debrute(String x) {
		int i = 0;
		String a= "";
		char carac = 's';
		while (i < x.length()) {
			if (carac != 'z') {
				carac++;
				a+=carac;
			}
			else {
				carac = 'a';
				carac--;
			}
			
			
			
			i++;
		}
		return a;
	}
}
