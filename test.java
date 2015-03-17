
public class test {
   
	public static void main( String[] args ){
		
	/*	for(Planet planet : Planet.values()){
			
			System.out.printf("%s -> % 4d km/h%n",planet.name(), planet.bahngeschwindigkeit());
			
		}
		*/
		for(LieblingsFilme lie : LieblingsFilme.values()){
			
			System.out.printf(lie.toString());
			
		}
		
		LieblingsFilme l = LieblingsFilme.Naruto;
		LieblingsFilme l2 = LieblingsFilme.valueOf("Naruto");
		LieblingsFilme l3 = LieblingsFilme.values()[2];
		
		System.out.println(l2 == l3);
		System.out.println(l == l2);
		System.out.println(l == l3);
		
		
		
	}
	

}
