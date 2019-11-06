
public class Elipse implements Figura {
 
	private double x,y, rX, rY;
		
	public void desenha() {
		System.out.println("Desenho de uma Elipse!!!");
		System.out.println("x: "+x+ " ,  y: "+y);
		System.out.println("Rx: "+rX+ " ,  Ry: "+rY);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getrX() {
		return rX;
	}

	public void setrX(double rX) {
		this.rX = rX;
	}

	public double getrY() {
		return rY;
	}

	public void setrY(double rY) {
		this.rY = rY;
	}

	public Elipse(double x, double y, double rX, double rY) {
		super();
		this.x = x;
		this.y = y;
		this.rX = rX;
		this.rY = rY;
	}
	
	
}
