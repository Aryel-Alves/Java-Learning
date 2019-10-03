package n5_Ponto2D;

public class Ponto2D {

	private double x;
	private double y;
	
	// constructors
	public Ponto2D() {
		this.x = 0;	
		this.y = 0;
	}

	public Ponto2D(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	//getters and setters	
	public double getX() {
		return this.x;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public double getY() {
		return this.y;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	
	/*public static double EuclideanDistance(Ponto2D PontoA, Ponto2D PontoB) {
		double x = Math.pow((PontoB.x - PontoA.x),2);
		double y = Math.pow((PontoB.y - PontoA.y),2);
		return Math.sqrt(x+y);
	}*/
	//methods
	public double EuclideanDistance(Ponto2D PontoB) {
		double x = Math.pow((PontoB.x - this.x),2);
		double y = Math.pow((PontoB.y - this.y),2);
		return Math.sqrt(x+y);
	}

	@Override
	public String toString() {
		return "[x=" + x + ", y=" + y + "]";
	}
	
}
