package Journalisation;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import Singleton.Singleton;

public class Journal {
	private static Journal journalerreur;
	private StringBuffer log;
	private static Journal journal;

	private Journal() {
		this.log = new StringBuffer();
	}
	public static synchronized Journal getJournal()
	{
		
		if (journal == null)
			journal = new Journal();

		return journal;
	}
	public static synchronized Journal getErreur()
	{
		if (journalerreur == null)
			journalerreur = new Journal();

		return journalerreur;
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
