/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package maths;
import javax.swing.*;


/**
 *
 * @author yvonne k
 */
import maths.Rectangle;

public class Cuboid extends Rectangle 
{

    private int length=1;
    private int height=1;
	
	
	//Contructor with no parameters
	public Cuboid()
	{
		setLength(1);
		setHeight(1);
	}

	//Contructor with one parameters
	public Cuboid(int l)
	{
		//setHeight(h);
		setLength(l);
	}
	//Contructor with two parameters
	public Cuboid(int h, int l)
	{
		setHeight(h);
		setLength(l);
	}
	
	public void setLength(int l)
	//vilidates that data entered for length is integer,
	//greater than 0 and less than 30.
	{
		
		//if((height>0 && height<=30) && (length>0 && length<=30))
		 if (length>0 && length<30)
		length=l;
		else length=1;
	}

	public void setHeight(int h)
	//vilidates that data entered for height is integer,
	//greater than 0 and less than 30.
	{
		
		//if((height>0 && height<=30) && (length>0 && length<=30))
		 if (height>0 && height<30)
		height=h;
		else height=1;
		//return h;
	}
	
	public int getLength()
	//returning length entered
	{
		//int length;
		return length;
	}
	
	public int getHeight()
	//returning height entered
	{
		//int height;
		return height;
	}
	//calculate perimeter of rectangle
	public int calPerimeter(int perimeter)
	{	
		//int perimeter;
		perimeter=(2 * length + 2 * height);
		return perimeter;
		//else
			//JOptionPane.showMessageDialog(null,"The value entered" +
			//" is invalid. It must be integer, greater than zero and"
			//" less than 30); 
	}
	public int calArea(int area)
	{	
		//int area;
		area=(length * height);
		return area;
		
	}
	
	//public String displayRectangle()
	//returning calculated perimeter or area
	//{
		//if((length >0 && length <30)&& (height>0 && height<=30))
		 
		 	//return "Perimeter of rectangle is" + perimeter + "cm" +
				//"Area of rectangle is" + area + "cm";
		//else
			
		
	//}

    
}
