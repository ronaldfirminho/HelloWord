
public  enum  LieblingsFilme{
	
	Matrix("Ronald",8), Superman("Brice",8), Naruto("Eboue",9), OnePiece("Michael",10);
	
	private final String regisseur;
	
	private final int bewertung;
	
	
	private LieblingsFilme(String regisseur, int bewertung){
		
		this.regisseur = regisseur;
		this.bewertung = bewertung;
	}

	public String toString(){
		
		return String.format((" %20.10s, bewertung %4d%n"),regisseur, bewertung);
	}
}
