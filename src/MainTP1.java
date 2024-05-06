import java.util.Locale;

public class MainTP1 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.FRENCH);
		Note note1 = new Note(15.256);
		Note note2 = new Note(12);
		Note note3 = new Note();
		Note note4 = new Note();
		
		ResultatsUniteEnseignement rue1 = new ResultatsUniteEnseignement("Info", note1);
		ResultatsUniteEnseignement rue2 = new ResultatsUniteEnseignement("Droit", note2);
		System.out.println(rue1);
		System.out.println(rue2);
		
		Etudiant et1 = new Etudiant("Dupand","Durand");
		et1.addResultats("info", note1);
		et1.addResultats("Droit", note2);
		Etudiant et2 = new Etudiant("Toto","Tata");
		
		et2.addResultats("info", note3);
		et2.addResultats("Droit", note4);
		
		System.out.println(et1);
		System.out.println(et2);
		System.out.println("Moyenne = "+et1.moyenneNotes());
		
		Promotion prom = new Promotion(" I1FA2025 ");
		prom.addEtudiant(et1);
		prom.addEtudiant(et2);
		prom.afficherEtudiantsResultats();
		System.out.println("Nombre d'étudiants ayant valide :"+prom.nbEtudiantsValides());
		System.out.println("Nombre d'absence de la promo :"+prom.nbAbsence());

	}
	}


