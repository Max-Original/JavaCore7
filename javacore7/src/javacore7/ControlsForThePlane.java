package javacore7;

public class ControlsForThePlane extends Plane{
	
	public int move = (int) (Math.random()*100);
	public int move1 = (int) (Math.random()*100);
	public int move2 = (int) (Math.random()*100);
	public int move3 = (int) (Math.random()*100);
	
	public ControlsForThePlane(int move) {
		super();
		this.move = move;
	}

	public ControlsForThePlane() {
		super();
		
	}

	public double getMove() {
		return move;
	}

	public void setMove(int move) {
		this.move = move;
	}

	public void moveUp() {
		System.out.println( "The plane moves up for " + move + " km");
	}
	
	public void moveDown() {
		System.out.println( "The plane moves down for " + move1 + " km");
	}
	
	public void moveLeft() {
		System.out.println("The plane moves left for " + move2 + " km");
	}
	
	public void moveRight() {
		System.out.println("The plane moves right for " + move3 + " km");
	}

	@Override
	public String toString() {
		return "ControlsForThePlane [move=" + move + ", getMove()=" + getMove() + "]";
	}

	
}
