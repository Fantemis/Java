package Journalisation;


public class TestComptesBancairesMultiton {

	public static void main(String[] args) {
        CompteBancaireJournalMultiton cb1 = new CompteBancaireJournalMultiton(123456789);
        CompteBancaireJournalMultiton cb2 = new CompteBancaireJournalMultiton(987654321);
        cb1.déposer(100);
        cb2.retirer(10);
        cb1.retirer(80);
        cb2.déposer(-1.33);
        cb2.déposer(18.8);
        cb1.retirer(-150.0);
        
        System.out.println(JournalMultiton.getInstance("journal"));
        System.out.println(JournalMultiton.getInstance("journalerreur"));
 
	}

}
