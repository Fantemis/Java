package Journalisation;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import Singleton.Singleton;

public class JournalMultiton {
	private static final Map<Object, JournalMultiton> instanceMultiton = new HashMap<Object, JournalMultiton>();
	private StringBuffer log;
	
	
	
	
	public static synchronized JournalMultiton getInstance(Object key) 
	{
		JournalMultiton instance = instanceMultiton.get(key);
		if (instance == null)
			synchronized (JournalMultiton.class) {
				if(instance==null) {
					instance=new JournalMultiton();
					instanceMultiton.put(key, instance);
				}
			}

		return instance;
	}
	private JournalMultiton() {
		this.log = new StringBuffer();
	}
	
	public void ajouterLog(String log) {
		Date d = new Date();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH'h'mm'm'ss's'SSS");
		this.log.append("[" + dateFormat.format(d) + "] " + log + "\n");
	}

	@Override
	public String toString() {
		return this.log.toString();
	}	
}
