package javacore7;

public abstract class Plane {

	public int length, width, weight;
	public int startEngine = (int) (Math.random()* (68)) + 20;
	public double planeInTheAir = Math.random() * 1000;
	
	public void startEngine() {
		System.out.println("engine will start in " + startEngine + " minutes") ;
	};
	
	public void planeTakeoff() {
		System.out.println("the plane will be in the air for " + planeInTheAir + " km");
	};
	
	public void landing() {
		System.out.println("The plain is going to land");
	}

	@Override
	public String toString() {
		return "Plane [length=" + length + ", width=" + width + ", weight=" + weight + ", startEngine=" + startEngine
				+ ", planeInTheAir=" + planeInTheAir + "]";
	};
}
