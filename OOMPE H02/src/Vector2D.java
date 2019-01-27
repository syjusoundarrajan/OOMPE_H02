

public class Vector2D {
	private double x;
	private double y;
	
	public Vector2D()
	{
		this.x = 0;
		this.y = 0;
	}
	
	public Vector2D(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	public void print (String prefix)
	{
		System.out.println(prefix + "[ " + x + " " + y + "]");
	}
	
	public double scalarProduct(Vector2D vector2)
	{
		return this.x * vector2.x + this.y * vector2.y;
	}
	
	public Vector2D scale(double scaling)
	{
		return new Vector2D(this.x * scaling, this.y * scaling);
	}
	
	public Vector2D add (Vector2D vector2)
	{
		return new Vector2D(this.x + vector2.x, this.y + vector2.y);
	}
	
	public Vector2D substract(Vector2D vector2)
	{
		return new Vector2D(this.x - vector2.x, this.y - vector2.y);
	}
	
	public double norm()
	{
		return Math.sqrt(this.scalarProduct(this));
	}
	
	public double getX()
	{
		return this.x;
	}
	
	public double getY()
	{
		return this.y;
	}

}
