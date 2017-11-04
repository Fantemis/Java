package Journalisation;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import Singleton.Singleton;

public class JournalUneInstance {
	private StringBuffer log;
	private static JournalUneInstance journal;

	private JournalUneInstance() {
		this.log = new StringBuffer();
	}
	public static synchronized JournalUneInstance getJournal()
	{
		
		if (journal == null)
			journal = new JournalUneInstance();

		return journal;
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
