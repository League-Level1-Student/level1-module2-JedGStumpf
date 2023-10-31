package _99_extra._04_tea_party;

public class TeaParty {

	public static void main(String[] args) {

//		welcome("Elton John", false, true);
//
	}
	public String welcome(String name, boolean isWoman, boolean isKnighted) {
		String surname;

		
		if (isWoman) {
			if (isKnighted) {
				surname = "Lady ";
			} else {
				surname = "Ms. ";
			}
		} else {
			if (isKnighted) {
				surname = "Sir ";
			} else {
				surname = "Mr. ";
			}
		}
		
		String message = "Hello " + surname + name;
		System.out.println(message);
		return message;
		
        
    }

}
