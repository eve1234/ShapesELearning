/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maths;

/**
 *
 * @author Yvonne Kwarteng
 */
public class Circle {
    
    private int radius=1;
	

	public Circle()//Contructor with no parameters
	{
		setRadius(1);
	}
	public Circle(int radius) //Contructor with one parameter
	{
		setRadius(radius);
	}

	//returning radius
	public int getRadius()
	{
		return radius;
	}
	
	//validates radius is between 1 and 15
	public void setRadius(int r)
	{
		if (r >0 && r<15)
		radius=r;
		else radius=1;
	}

	//calculating area
	public double Area()
	{
		
		return (Math.PI * radius * radius);
		
	}

	//calculating circumference
	public double Circumfer()
	{
		
		return (2 * Math.PI * radius);
		
	}
	
    
    
}
