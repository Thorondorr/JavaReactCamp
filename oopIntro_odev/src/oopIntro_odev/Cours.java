package oopIntro_odev;

public class Cours implements Entity {
	
	public int id;
	public String courseName;
	public String explanation;
	
	public Cours() {
		
	}
	public Cours(int id,String courseName,String explanation) {
		
		this.id=id;
		this.courseName=courseName;
		this.explanation=explanation;
	}

}
