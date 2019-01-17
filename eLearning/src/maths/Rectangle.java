/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maths;

/**
 *
 * @author yvonne kwarteng
 */
public class Rectangle {
    
    private int length=1;
	private int height=1;
	

	//Contructor with no parameters
	public Rectangle()
	{
		setLength(1);
		setHeight(1);
	}

	//Contructor with one parameters or one arguement
	public Rectangle(int length)
	{	setHeight(1);
		setLength(length);
	}
	//Contructor with two parameters or two arguement
	public Rectangle(int height, int length)
	{
		setHeight(height);
		setLength(length);
	}
	
	public void setLength(int le)
	//vilidates that data entered for length is integer,
	//greater than 0 and less than 30.
	{
		 if (le>0 && le<30)
		length=le;
		else le=1;
	}

	public void setHeight(int h)
	//vilidates that data entered for height is integer,
	//greater than 0 and less than 30.
	{
		 if (h>0 && h<30)
		height=h;
		else h=1;
	}
	
	public int getLength()
	//returning length entered
	{
		return length;
	}
	
	public int getHeight()
	//returning height entered
	{
		return height;
	}

	//calculate perimeter of rectangle
	public int calPerimeter()
	{	
		return (2 * length + 2 * height);
		 
	}

	//calculating area
	public int calArea()
	{	
		return (length * height);
		
	}
	
	
}
