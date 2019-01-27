

import java.awt.Color;
import java.awt.Graphics2D;

import inf.v3d.obj.UnstructuredMesh;
import inf.v3d.view.Viewer;

public class Rectangle2D {
	private Vector2D lowerLeftCorner;
	private double width;
	private double height;
	
	public Rectangle2D()
	{
		this.lowerLeftCorner = new Vector2D(0,0);
		this.width = 1;
		this.height = 2;
	}
	
	public Rectangle2D(double x, double y, double w, double h)
	
	{
		this.lowerLeftCorner = new Vector2D(x, y);
		this.width = w;
		this.height = h;
	}
	
	public Rectangle2D(Vector2D lowerLeftCorner, double width, double height)
	
	{
		this.lowerLeftCorner = lowerLeftCorner;
		this.width = width;
		this.height = height;
		
	}
	
	
	
	public double getArea()
	
	{
		return this.width * this.height;
	}
	
	
	
	public void draw (Viewer view)
	{
		UnstructuredMesh mesh = new UnstructuredMesh();
		mesh.addPoint(this.lowerLeftCorner.getX(), this.lowerLeftCorner.getY(), 0);
		mesh.addPoint(this.lowerLeftCorner.getX() + this.width, this.lowerLeftCorner.getY(), 0);
		mesh.addPoint(this.lowerLeftCorner.getX() + this.width, this.lowerLeftCorner.getY() + this.height, 0);
		mesh.addPoint(this.lowerLeftCorner.getX(), this.lowerLeftCorner.getY() + this.height, 0);
		mesh.addCell(0,1,2,3);
		
	    mesh.setOutlinesColor("black");
		mesh.setOutlinesVisible(true);
		view.addObject3D(mesh);
	}

	public void draw1 ( String color,Viewer view)
	{
		UnstructuredMesh mesh = new UnstructuredMesh();
		mesh.addPoint(this.lowerLeftCorner.getX(), this.lowerLeftCorner.getY(), 0);
		mesh.addPoint(this.lowerLeftCorner.getX() + this.width, this.lowerLeftCorner.getY(), 0);
		mesh.addPoint(this.lowerLeftCorner.getX() + this.width, this.lowerLeftCorner.getY() + this.height, 0);
		mesh.addPoint(this.lowerLeftCorner.getX(), this.lowerLeftCorner.getY() + this.height, 0);
		mesh.addCell(0,1,2,3);
		
	    mesh.setColor(color);
		mesh.setOutlinesColor("black");
		mesh.setOutlinesVisible(true);
		view.addObject3D(mesh);
	}

	
}
