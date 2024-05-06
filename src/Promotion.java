

public class Promotion {

	private String name;
	private Etudiant[] etudiants;
	
	
	public Promotion(String name) {
		super();
		this.name = name;
		this.etudiants = new Etudiant[100];
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	public void addEtudiant(Etudiant etudiant){
			if(this.etudiants.length<100) {
				this.etudiants[this.etudiants.length]=etudiant;
			}
	}
	
	// Nombre d'étudiants ayant validés
		public int nbEtudiantsValides() {
			int nb = 0;
			for (Etudiant e : etudiants) {
				if (e != null) {
					if (e.moyenneNotes().getValeur() >= 11) {
						nb++;
					}
				} else
					break;
			}
			return nb;
		}

		// Nombre d'absents
		public int nbAbsence() {
			int nb = 0;
			for (Etudiant e : etudiants) {
				if (e != null) {
					for (Note n : e.getNotes()) {
						if (n.isEstAbsent()) {
							nb++;
						}
					}
				}
			}
			return nb;
		}

	
	 public void afficherEtudiantsResultats() {
		   System.out.println("Promotion"+name);
		   for(Etudiant etudiant:etudiants) {
			   if(etudiant!=null) {
				   etudiant.afficherResultats();
			   }else
				   break;
		   }
		   int nbEtudiantsValides=nbEtudiantsValides();
		   System.out.println("nombre d'etudiants ayant valides:"+nbEtudiantsValides);
	 }


	
	 
	 
	 

}


