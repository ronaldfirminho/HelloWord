
public enum Planet {

	Merkur(10,1), Venus(20,2), Erde(30,3), Mars(40,4), Jupiter(50,5), Saturn(60,6),
	 
	Uranus(70,7), NEPTUN(80,8);
	
	private final int entfernung;
	private final int umlaufzeit;
	
	 private Planet(int entfernung, int umlaufzeit){
		 
		 this.entfernung = entfernung;
		 this.umlaufzeit = umlaufzeit;
	 }
	 
	 public int bahngeschwindigkeit(){
		 
		 return 2 * entfernung *  umlaufzeit ;
	 }
	
}
