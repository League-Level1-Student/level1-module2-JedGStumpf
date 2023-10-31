package _99_extra._05_minion;

public class Minion {
	private String name; 
	private int eyes; 
	private String color; 
	private String master;
	
	public Minion(String name, int eyes, String color, String master) {
		this.name = name;
		this.eyes = eyes;
		this.color = color;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	public int getEyes() {
		// TODO Auto-generated method stub
		return this.eyes;
	}

	public String getColor() {
		// TODO Auto-generated method stub
		return this.color;
	}

	public String setMaster(String master) {
		// TODO Auto-generated method stub
		this.master = master;
		return this.master;
		
	}

	public String getMaster() {
		// TODO Auto-generated method stub
		return setMaster(master);
	}

}
