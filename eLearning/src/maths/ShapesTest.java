/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maths;

/**
 *
 * @author yvonne Kwarteng
 */
import java.awt.*;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import maths.Rectangle;
import maths.Circle;
public class ShapesTest
{
	public static void main(String args[])throws java.io.IOException
	{


	Welcome();
	String choice;
	boolean run_Again=true;

	char respond=0;

	while (run_Again)//To get user to run program again
	{
		int cho;

	try
	{
	choice=JOptionPane.showInputDialog("Please enter the number for your choice " +
	" of quitz from this menu" +
	"\n" + "1. Rectangle   " + "\n" +
	"2. Circle ");

	cho=Integer.parseInt(choice);

	switch(cho)
	{
	case 1: JOptionPane.showMessageDialog(null, " You've chosen Rectangle. Click Ok to continue ",
		" Rectangle entry", JOptionPane.INFORMATION_MESSAGE);
		Rect();

	break;

	case 2: JOptionPane.showMessageDialog(null, " You've chosen Circle. Click Ok to continue " ,
		" Circle entry ", JOptionPane.INFORMATION_MESSAGE );
		Cir();

	break;
	default :JOptionPane.showMessageDialog(null, "invalid option entered." +
	" Please try again.  Click Ok to continue", " Main Menu invalid entry ", JOptionPane.INFORMATION_MESSAGE);
	
	}//closing the switch

	System.out.print("Would you want like to return to main menu?  ");
	System.out.flush();
	respond=(char)System.in.read();
	System.in.skip(2);

	if (respond== 'Y' || respond == 'y')
		run_Again=true; //run the program again
	else
	{
		run_Again=false; //else don't run the program, exit
		System.exit(0);
	}

}//closing try
catch (Exception eg)//if characters are entered, display this error message
   {
 	  JOptionPane.showMessageDialog(null, "Enter numbers only. No characters","Error",
 		JOptionPane.ERROR_MESSAGE);
  }//closing catch
}

}//closing main

	public static void Rect() //method for calling rectangle method
	{


	String opRect;
	int opt1=0;

	Rectangle r, r1, r2; //calling rectangle class
	String output;
	r=new Rectangle();
	
	String sr1=new String();
	String sr2=new String();
	String sr3=new String();
	int re1=0, re2=0, re3=0;

	boolean states=false;
	//three conditions for checking running of program
	boolean isComplete_1=false,isComplete_2=false,isComplete_3=false;

	while (!states)
	{
	try	//For checking if character(s) are entered
	{

		if (!isComplete_1)
		{
		opRect=JOptionPane.showInputDialog(" Please enter 0 for no parameters" +
		"\n" + "1 for one parameters or 2 for two parameters " +
		"\n\n" + "0. No Parameters" + "\n" +
		"1. One parameter" + "\n" + "2. Two parameters ");

		opt1=Integer.parseInt(opRect);
		 if (opt1>-1 && opt1<3)
			isComplete_1=true;//Check if it has run before
		 else
		 	isComplete_1=false;

		}

	switch(opt1)
	{
	case 0:
		if (isComplete_1)
		{
		JOptionPane.showMessageDialog(null, " You've chosen 0 " +
		" for no parameters. " + "\n" + " Please click Ok to continue",
		" Rectangle - Zero parameters ", JOptionPane.INFORMATION_MESSAGE);


	output=" You've chosen zero parameters. For zero parameters," 
	+"\n" + "height is  " + r.getHeight() +
	"\n" + " length is " + r.getLength()
	+ "\n" + " Perimeter for this rectangle is  " + r.calPerimeter() +
	"\n" + " Area is " + r.calArea() +  "\n" + " Click OK to end " ;
	JOptionPane.showMessageDialog(null, output, " Rectangle - Zero parameters ", JOptionPane.INFORMATION_MESSAGE);
	};
	break;

	case 1:
	if (!isComplete_2 && isComplete_1)
	{
	sr1=JOptionPane.showInputDialog(null, " You've chosen 1 " +
	" for one parameters. Height is 1." +"\n\n" + " Enter length "+
	"between 1 and 30");

	re1=Integer.parseInt(sr1);
	r1=new Rectangle(re1);
	
	if(re1<1 || re1>30)
	{
	output=" You've entered " +
	re1 + " for length " + " and height is " + r1.getHeight() +
	"\n" + " Perimeter is " + r1.calPerimeter() +
	"\n" + " and area is " + r1.calArea();

	JOptionPane.showMessageDialog(null, "The number you've entered is " +"\n"+
	 " less than 1 or greater than 30. This is unacceptable." + "\n" +
	"Height and Length is set to default of 1." +"\n" +output +"\n" +
	" Click OK to continue." ,"Error",JOptionPane.ERROR_MESSAGE);

	}
	else
	{
	output=" You've entered " +
	re1 + " for length " + " and height is " + r1.getHeight()+

	"\n" + " Perimeter is " + r1.calPerimeter() +
	"\n" + " and area is " + r1.calArea() + "\n" + "Click Ok to return to menu";
	JOptionPane.showMessageDialog(null, output, " Rectangle - One parameters ", JOptionPane.INFORMATION_MESSAGE);
	isComplete_2=true;

	}//closes else
	}//closes if (!isComplete_2 && isComplete_1)

	break;

	case 2:
	if (!isComplete_3 && isComplete_1)
	{
	sr2=JOptionPane.showInputDialog(null, " You've chosen 2 " +
	" for two parameters. " +"\n\n" + " Enter length between 1 and 30 "
	+ "\n" + " and click Ok to continue ");
	
	re2=Integer.parseInt(sr2); //converting to integers

	sr3=JOptionPane.showInputDialog(null, " You've entered " +
	re2 + " for length. " +"\n\n" + " Enter height between 1 and 30 " +
	"\n" +" and click Ok to continue ");

	re2=Integer.parseInt(sr2); //converting to integers
	re3=Integer.parseInt(sr3);
	r2=new Rectangle(re2, re3);

	if(re2<1 || re2>30 && re3<1 || re3>30)
	{
	
	output=" You entered " + re2 +" for length" +
	" and " + re3 +" for height "+"\n"+
	"\n" + " Perimeter is " + r2.calPerimeter() + "\n" + " and area of this " +
	" rectangle is " + r2.calArea();
	
	JOptionPane.showMessageDialog(null, "The number you've entered is " +"\n"+
	 " less than 1 or greater than 30. This is unacceptable." + "\n" +
	"Height and Length is set to default of 1." + "\n" + output +"\n"+
	" Click OK to continue." ,"Error",JOptionPane.ERROR_MESSAGE);
	}//closing if
	else{
	output=" You entered " + re2 +" for length" +
	" and " + re3 +" for height " +
	"\n" + " Perimeter is " + r2.calPerimeter() + "\n" + " and area of this " +
	" rectangle is " + r2.calArea()
	+ "\n" + " Click OK to return to the menu";
	JOptionPane.showMessageDialog(null, output, 
	" Rectangle - Two parameters ", JOptionPane.INFORMATION_MESSAGE); //to display label

	isComplete_3=true;

	}//closing else
	}//closing if(iscomplet_3 && iscomplet_1)

	break;

	default : JOptionPane.showMessageDialog(null, " Invalid option entered " +
	 " Please, try again. Click OK for the options again ",
	" Rectangle - invalid parameters entered ", JOptionPane.INFORMATION_MESSAGE);
	
	} //close case

	if(isComplete_1)
	   states=true;
  } //closes try

  catch (Exception eg) // if character(s) is entered display error message
  {
	  JOptionPane.showMessageDialog(null, "Enter numbers only. No characters","Error",
	JOptionPane.ERROR_MESSAGE);
  }//closes catch
 }
}

	public static void Cir() //method for calling Circle class

	{

	Circle c, c1;
	String outp;
	c=new Circle();

	int opt2=0;
	String opCir=new String();

	String sc=new String();
	int cs;
	boolean states=false;
	//three conditions for checking running of program
	boolean isComplete_1=false,isComplete_2=false,isComplete_3=false;
	while (!states)
	{
	try //for checking characters
	{

		if (!isComplete_1)
		{

			opCir=JOptionPane.showInputDialog(" Please enter 0 for no parameters, " +
			" 1 for one parameters " +
			"\n\n" + "0. No Parameters" + "\n" +
			"1. One parameter ");

			opt2=Integer.parseInt(opCir);
			if (opt2>-1 && opt2<2)
				isComplete_1=true;//Check if it has run before
			 else
			 	isComplete_1=false;
		}

	switch(opt2)
	{
	case 0:
	if (!isComplete_2 && isComplete_1)
	{
	JOptionPane.showMessageDialog(null, " You've chosen 0 " +
	" for no parameters." +"\n" + " Please click Ok to continue ",
	" Circle - One parameters ", JOptionPane.INFORMATION_MESSAGE);

	DecimalFormat twoDigits = new DecimalFormat("0.00");

	outp=" You've chosen 0 for no parameters " +"\n"+
	" Radius is set to  " + c.getRadius() + " for default. "
	 + "\n" +" area for this circle is " + twoDigits.format(c.Area())+
	"\n" + " Circumference is " + twoDigits.format(c.Circumfer()) + "\n" + " Click OK to return to menu ";
	JOptionPane.showMessageDialog(null, outp, " Circle- zero parameters ", JOptionPane.INFORMATION_MESSAGE);

     	}//closing if 

	break;
   	case 1:
   	if (!isComplete_3 && isComplete_1)
   	{
	sc=JOptionPane.showInputDialog(null, " You've chosen 1 " +
	" for one parameters." +"\n" + " Enter radius  between 1 and 15 " +"\n"+
	" and click Ok to continue",
	" Circle - One parameters ", JOptionPane.INFORMATION_MESSAGE);

	DecimalFormat TwoDigits = new DecimalFormat("0.00");
	cs=Integer.parseInt(sc);
	c1=new Circle(cs);
	
	if(cs<1 || cs>15)
	{
	outp=" You've entered " + cs + " for radius of one parameters. " + "\n" +
	"\n" + " area for this circle is " + TwoDigits.format(c1.Area()) +
	"\n" + " Circumference of this circle is " + TwoDigits.format(c1.Circumfer()) +
	"\n" + " Click OK to return to menu ";
	
	
	JOptionPane.showMessageDialog(null, "The number you've entered is " +"\n"+
	 " less than 1 or greater than 15. This is unacceptable." + "\n" +
	"radius is set to default of 1." +"\n" + outp + " Click OK to continue.",
	"Error",JOptionPane.ERROR_MESSAGE);
	}//closing if

	else
	{
	outp=" You've entered " + cs + " for radius of one parameters. " + "\n" +
	"\n" + " area for this circle is " + TwoDigits.format(c1.Area()) +
	"\n" + " Circumference of this circle is " + TwoDigits.format(c1.Circumfer()) +
	"\n" + " Click OK to return to menu ";
	JOptionPane.showMessageDialog(null, outp, " Circle- One parameters ", 
	JOptionPane.INFORMATION_MESSAGE);
	}//closing else
	}//closing if

	break;

	default : JOptionPane.showMessageDialog(null," Invalid option entered " +
	  " Please, try again. Click OK to return to options ",
	" Circle invalid parameters entered ", JOptionPane.INFORMATION_MESSAGE);
	
	}//Switch close

		if(isComplete_1)
	   states=true;

	}//Try closing

	catch (Exception eg) //display error message if character is entered
	{
		  JOptionPane.showMessageDialog(null, "Enter numbers only. No characters","Error",
			JOptionPane.ERROR_MESSAGE);
  	}//closing catch

	}//While close

	}//closing method for circle

	public static void Welcome() //for displaying a welcome message
	{
		JOptionPane.showMessageDialog(null, "Welcome to the shape quitz program. "
		+ "Please click Ok to start the program", " Welcome ", JOptionPane.INFORMATION_MESSAGE);
	}

}//closing testing class
