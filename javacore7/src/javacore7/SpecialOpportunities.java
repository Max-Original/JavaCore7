package javacore7;

public interface SpecialOpportunities {

	public int exstraSpeed = (int) (Math.random()* (100)) + 450;
	public int disappear = (int) (Math.random()* 20);
	public int missiles = (int) (Math.random()* 10);
	
	public void turboAcceleration();
	
	public void stealthTechnology();
	
	public void nuclearStrike();
	
	
	
}
