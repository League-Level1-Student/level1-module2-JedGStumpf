package _02_smurf;

public class SmurfRunner {

	public static void main(String[] args) {
		Smurf smurf = new Smurf("Smurfette");
		System.out.println(smurf.getName());
		smurf.eat();
		System.out.println(smurf.getHatColor());
		System.out.println(smurf.isGirlOrBoy());
	}

}
