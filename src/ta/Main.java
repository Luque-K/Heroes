package ta;

public class Main {

	public static void main(String[] args) {

		
		Persona tony_stark = new Persona( "Tony Stark",35) ;
		
		System.out.println(tony_stark.name+":"+tony_stark.edad);
	
		
		Superhero iron_man = new Superhero(tony_stark.name, tony_stark.edad);
	iron_man.heroName="Iron man";
	iron_man.powers = new String[] {"volar","Pelear"};
	
	
		
	}

}
