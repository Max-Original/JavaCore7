package javacore7;

public class Cy27 extends ControlsForThePlane implements SpecialOpportunities{
	
	public int maxSpeed;
	public String color;

	
	public Cy27() {
		super();
		this.maxSpeed = 400;
		this.color = "Green";
	}

	@Override
	public void turboAcceleration() {
		System.out.println("You are boosted and your speed is now " + exstraSpeed + " km");
	}

	@Override
	public void stealthTechnology() {
		System.out.println("Now anyone cant see you for " + disappear + " min");
		
	}

	@Override
	public void nuclearStrike() {
		System.out.println("We are going to launch " + missiles + " missiles");
		
	}

	@Override
	public String toString() {
		return "Cy27 [maxSpeed=" + maxSpeed + ", color=" + color + ", getMove()=" + getMove() + "]";
	}

	
	
}
