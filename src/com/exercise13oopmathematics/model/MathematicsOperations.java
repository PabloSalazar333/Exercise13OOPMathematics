package com.exercise13oopmathematics.model;

public class MathematicsOperations 
{
	
	final double PI =3.1416;
	
	public double areaTriangle(double base, double height)
	{
		return (base*height)/2;
	}
	public double areaSquare(double side)
	{
		return side*side;
	}
	public double areaCircule(double radio)
	{
		return this.PI*(radio*radio);
	}
}
