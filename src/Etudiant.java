
public class Etudiant {

	private String nom;
	private String prenom;
	private ResultatsUniteEnseignement[] resultats;
	
	
	public Etudiant(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.resultats =new ResultatsUniteEnseignement[30];
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public void addResultats(String nomUniteEnseignement,Note note) {
		for(int i=0;i<resultats.length;i++) {
			if (resultats[i]==null) {
				resultats[i]=new  ResultatsUniteEnseignement(nomUniteEnseignement,note);	
			}
		}
	}
	
	public Note[] getNotes() {
		Note[]notes=new Note[this.resultats.length];
		for(int i=0; i<this.resultats.length;i++) {
			notes[i]=this.resultats[i]!=null ? this.resultats[i].getNote():null;
		}
		return notes;
	}

	
	public Note moyenneNotes() {
		return Note.moyennesNotes(getNotes());
	}
	
	public void afficherResultats() {
		 System.out.println(nom+""+prenom);
		 for(ResultatsUniteEnseignement resultat:resultats) {
			 if(resultat!=null) {
				 System.out.println(resultat.toString()); 
			 }
		 }
		 Note moyenne=moyenneNotes();
		 System.out.println("Note moyenne:"+ moyenne.toString());
		
	}


	@Override
	public String toString() {

		String ch="";
		ch=this.nom + " " + this.prenom + "\n";
		for(ResultatsUniteEnseignement r : resultats) {
			if(r != null) {
				
			}
		}
		return ch;
	}
	
	
}

	
	
