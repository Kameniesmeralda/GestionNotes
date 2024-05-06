
public class ResultatsUniteEnseignement {

	private String NomUniteEnseignement;
	private Note note;
	
	
	public ResultatsUniteEnseignement(String nomUniteEnseignement, Note note) {
		super();
		this.NomUniteEnseignement = nomUniteEnseignement;
		this.note = note;
	}


	public Note getNote() {
		return note;
	}


	public void setNote(Note note) {
		this.note = note;
	}


	@Override
	public String toString() {
		return NomUniteEnseignement +":"+note.toString();
	}
	
	

}
