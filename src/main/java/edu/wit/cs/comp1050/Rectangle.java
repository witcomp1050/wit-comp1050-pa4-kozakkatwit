package edu.wit.cs.comp1050;

//TODO: document this class
public class Rectangle extends Shape2D {
	private final Point2D ll;
	private final Point2D ur;
	private final Point2D c;
	
	private final Point2D[] v;
	
	private final double a;
	private final double p;
	/**
	 * Constructs a rectangle given two points
	 * 
	 * @param color rectangle color
	 * @param p1 point 1
	 * @param p2 point 2
	 */
	public Rectangle(String color, Point2D p1, Point2D p2) {
super(color, "Rectangle");
		
		ll = new Point2D(Math.min(p1.getX(), p2.getX()), Math.min(p1.getY(), p2.getY()));
		ur = new Point2D(Math.max(p1.getX(), p2.getX()), Math.max(p1.getY(), p2.getY()));
		
		final Point2D ul = new Point2D(ll.getX(), ur.getY());
		final Point2D lr = new Point2D(ur.getX(), ll.getY());
		
		v = new Point2D[] {ll, ul, ur, lr};
		
		final double l = ll.distanceTo(lr);
		final double h = ll.distanceTo(ul);
		
		p = 2*l + 2*h;
		a = l*h;
		
		c = new Point2D(ll.getX() + 0.5*l, ll.getY() + 0.5*h);
	}
	
	/**
	 * Returns true if provided
	 * another rectangle whose 
	 * lower-left and upper-right
	 * points are equal to this
	 * rectangle
	 * 
	 * @param o another object
	 * @return true if the same rectangle
	 */
	@Override
	public boolean equals(Object o) {
		if (o instanceof Rectangle) {
			final Rectangle r = (Rectangle) o;
			return (ll.equals(r.ll) && ur.equals(r.ur));
		} else {
			return false;
		} // replace with your code
	}
	
	/**
	 * Gets the lower-left corner
	 * 
	 * @return lower-left corner
	 */
	public Point2D getLowerLeft() {
		return ll; // replace with your code
	}
	
	/**
	 * Gets the upper-right corner
	 * 
	 * @return upper-right corner
	 */
	public Point2D getUpperRight() {
		return ur; // replace with your code
	}

	@Override
	public double getArea() {
		return a; // replace with your code
	}

	@Override
	public double getPerimeter() {
		return p; // replace with your code
	}

	@Override
	public Point2D getCenter() {
		return c;
	}

	@Override
	public Point2D[] getVertices() {
		 return v;
	}

}
