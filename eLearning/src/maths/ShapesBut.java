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
import java.awt.event.*;
import java.applet.*;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.lang.*;
import java.text.*;
import maths.Rectangle;
import maths.Circle;
//Yvonne Kwarteng

public class ShapesBut extends Applet implements ActionListener,ItemListener
{

	int shape=0;
	int sizeC=0, sizeR=0;
	
	String userShapes[]= new String[30]; //User display shapes
	int countShape=0; //To count the amount of times the user has play the game
	String generated_Numbers[] =new String[30]; //Store all the generate numbers
	String user_Answer[] =new String[30];//to display levels of games
	

	String rep, are, are2; 
	String name[]=new String[30];//to display name of user
	String classnum[]=new String[30];//to display class number of user
	String care;
	int ans1, ans2, per, ar, ar2; 
	double cir, car; //for calculated answer for circle
	double cir2, car2; //for circle

	int Len, Hei, rad;
	int right;
	int wrong;
	

	Button butNewGame;
	Button butRectangle, butCircle;

	Button butSummary, butHelp, butAnswer, butEnter;

	CheckboxGroup radio= new CheckboxGroup();
	Checkbox radioBeginners=new Checkbox("Beginners", radio, true);
	Checkbox radioIntermediate=new Checkbox("Intermediate", radio, true);
	Checkbox radioAdvance=new Checkbox("Advance", radio, true);


	Label lblDisplay= new Label("TEST YOURSELF");
	Label lblDis1= new Label(" "); // to fill up a panel
	Label lblDis2= new Label(" ");
	Label lblDis3= new Label(" ");
	Label lblDis4= new Label(" ");
	Label lblDis5= new Label(" ");
	Label lblDis6= new Label(" ");
	Label lblDis7= new Label(" ");
	Label lblLength= new Label("   ");
	Label lblHeight= new Label("   ");
	TextField txtLength=new TextField(15);
	Label lblArea= new Label(" ");
	TextField txtArea=new TextField(15);
	Label lblAns2= new Label(" ");
	TextField txtAns2=new TextField(15);
	Label lblAns1= new Label("   ");
	TextField txtAns1=new TextField(15);
	TextField txtHeight= new TextField(15);
	Label lblCorrect= new Label("Correct Score");
	TextField txtRad= new TextField(15);
	Label lblRad= new Label(" ");
	Label lblIncorrect= new Label("Incorrect Score");
	TextField txtCorrect=new TextField(15);
	TextField txtIncorrect= new TextField(15);
	Label lblName= new Label("Enter your name");
	Label lblClassnum= new Label("Enter class number");
	TextField txtName=new TextField("");
	TextField txtClassnum= new TextField("");

	Panel results,input, exit;

	MyCanvas drawarea;


	Rectangle r2=new Rectangle();//calling classes
	Circle c2=new Circle();

	public void init()
	{

	for(int y=0; y<generated_Numbers.length;y++)
		generated_Numbers[y]=new String();

	setLayout(new BorderLayout());
	drawarea= new MyCanvas();
	input = new Panel (new GridLayout(5,2,6,5));
	results= new Panel (new GridLayout(9,1,6,6));
	exit= new Panel (new GridLayout(1,1,4,4));

	Color brown=new Color(255,200,0);
	Color darkbrown=new Color(150,70,0);

	results.setBackground(Color.orange);
	input.setBackground(Color.orange);
	exit.setBackground(brown);
	drawarea.setBackground(brown);

	butNewGame = new Button("Start");
	butNewGame.addActionListener(this);
	butNewGame.setBackground(darkbrown);
	butRectangle= new Button("Rectangle");
	butRectangle.addActionListener(this);
	butRectangle.setBackground(darkbrown);
	butCircle= new Button("Circle");
	butCircle.setBackground(darkbrown);
	butCircle.addActionListener(this);
	radioBeginners.addItemListener(this);
	radioIntermediate.addItemListener(this);
	radioAdvance.addItemListener(this);
	butHelp=new Button("Help");
	butHelp.setBackground(darkbrown);
	butHelp.addActionListener(this);
	butAnswer=new Button("Check entry");
	butAnswer.setBackground(darkbrown);
	butAnswer.addActionListener(this);
	butEnter=new Button("Enter");
	butEnter.setBackground(darkbrown);
	butEnter.addActionListener(this);
	txtArea.addActionListener(this);
	txtAns2.addActionListener(this);
	txtAns1.addActionListener(this);
	txtName.addActionListener(this);
	txtClassnum.addActionListener(this);

	input.add(lblDis1);
	lblDis1.setVisible(false);
	input.add(lblDisplay);
	lblDisplay.setFont(new Font("SanSerif",Font.BOLD,18));
	input.add(lblDis4);
	lblDis4.setVisible(false);
	input.add(lblDis5);
	lblDis5.setVisible(false);
	input.add(lblName);
	input.add(txtName);
	input.add(lblClassnum);
	input.add(txtClassnum);
	input.add(butNewGame);
	input.add(butRectangle);
	butRectangle.setEnabled(false);
	input.add(butCircle);
	butCircle.setEnabled(false);
	butCircle.setBackground(darkbrown);
	input.add(lblDis6);
	lblDis6.setVisible(false);
	input.add(radioBeginners);
	radioBeginners.setEnabled(false);
	input.add(radioIntermediate);
	radioIntermediate.setEnabled(false);
	input.add(radioAdvance);
	radioAdvance.setEnabled(false);
	input.add(lblDis3);
	lblDis3.setVisible(false);
	results.add(lblLength);
	lblLength.setVisible(false); // hide when loading application
	results.add(txtLength);
	txtLength.setVisible(false);
	results.add(lblHeight);
	lblHeight.setVisible(false);
	results.add(txtHeight);
	txtHeight.setVisible(false); // hide when loading application
	results.add(lblRad);
	lblRad.setVisible(false);
	results.add(txtRad);
	txtRad.setVisible(false);
	results.add(lblArea);
	lblArea.setVisible(false);
	results.add(txtArea);
	txtArea.setVisible(false);
	results.add(lblAns2);
	lblAns2.setVisible(false);
	results.add(txtAns2);
	txtAns2.setVisible(false);
	results.add(lblAns1);
	lblAns1.setVisible(false);
	results.add(txtAns1);
	txtAns1.setVisible(false);
	results.add(butEnter);
	butEnter.setEnabled(false);//disabled button
	results.add(butAnswer);
	butAnswer.setEnabled(false);
	results.add(butHelp);
	txtLength.addActionListener(this);
	txtHeight.addActionListener(this);
	txtRad.addActionListener(this);

	exit.add(lblCorrect);
	exit.add(txtCorrect);
	txtIncorrect.addActionListener(this);
	exit.add(lblIncorrect);
	exit.add(txtIncorrect);
	txtIncorrect.addActionListener(this);

	butSummary = new Button("Summary");
	butSummary.addActionListener(this);
	butSummary.setBackground(darkbrown);
	exit.add(butSummary);
	butSummary.setEnabled(false);

	add(drawarea, "Center");
	add(input, "North");
	add(results, "West");
	add(exit, "South");

	JOptionPane.showMessageDialog(null,"Welcome to the program." +
	"\n" + "Please, click the start button at the applet to begin " +
	" the quiz." + "\n" +" Click OK to get to the applet.", 
	"Welcome message",JOptionPane.INFORMATION_MESSAGE);

	}

	public void eliminate()
	{
		remove(drawarea);
	}


	public void actionPerformed(ActionEvent s)
	//for action events in the program
	{

		if(s.getSource()==butNewGame)

		{	butNewGame.setLabel("New Game"); // changing the label
			butNewGame.setEnabled(true);
			butRectangle.setEnabled(true);
			butCircle.setEnabled(true);
			radioBeginners.setEnabled(false);
			radioIntermediate.setEnabled(false);
			radioAdvance.setEnabled(false);

			if(shape==0 || shape==1)
			{
			txtRad.setEditable(true); //require for new entry
			txtArea.setEditable(true);
			txtAns2.setEditable(true);
			txtAns1.setEditable(true);
			txtLength.setEditable(true);
			txtHeight.setEditable(true);

			txtRad.setText("");  //clearing text for new entry
			txtArea.setText("");
			txtAns1.setText("");
			txtAns2.setText("");
			txtLength.setText("");
			txtHeight.setText("");
			}

		}

		if(s.getSource()==butAnswer)
		//for rechecking ansers

		{	butNewGame.setEnabled(true);
			butRectangle.setEnabled(false);
			butCircle.setEnabled(false);
			radioBeginners.setEnabled(false);
			radioIntermediate.setEnabled(false);
			radioAdvance.setEnabled(false);

		if(shape==0)
		{

		JOptionPane.showMessageDialog(null, Len + " is length " +
		Hei + " is height " + "\n" + " You entered " + rep +
		" for perimeter and " + are + " for area of rectangle." +
		"\n" + "Answer for area is " + ar +  " and " + per +
		" for perimeter. Click OK to continue.",
		"Checking entry", JOptionPane.INFORMATION_MESSAGE);
		}

		else if(shape==1)
		{

		DecimalFormat twoDigits = new DecimalFormat("0.00");

		JOptionPane.showMessageDialog(null, rad + " is radius " +
		 "\n" + " You entered " + care +
		" for area and " + are2 + " for Circumference of the circle."+
		"\n" + "Answer for area is " + twoDigits.format(cir) +  " and " +
		twoDigits.format(car)  + " for circumference. Click OK to continue.",
		"Checking entry", JOptionPane.INFORMATION_MESSAGE);

		}

	}//closing if butAnswer

		else if(s.getSource()==butCircle)
		//for the Circle button
		{
				shape=1;//refers to circle
			butAnswer.setVisible(true);
			butNewGame.setEnabled(false);
			butRectangle.setEnabled(false);
			butCircle.setEnabled(false);
			radioBeginners.setVisible(true);
			radioBeginners.setEnabled(true);
			radioIntermediate.setVisible(true); //show when needed
			radioIntermediate.setEnabled(true);
			radioAdvance.setVisible(true);
			radioAdvance.setEnabled(true);
			txtAns1.setVisible(true);
			lblAns1.setVisible(true);
			lblAns1.setText("Answer for Circumference ");
			txtArea.setVisible(true);
			lblArea.setVisible(true);
			lblArea.setText("Enter Circumference");
			lblAns2.setVisible(true);
			lblAns2.setText("Answer for area");
			txtAns2.setVisible(true);
			lblRad.setVisible(true);
			lblRad.setText("Enter area here");
			txtRad.setVisible(true);
			lblLength.setVisible(true);
			lblLength.setText("Radius of a Circle");
			txtLength.setVisible(true);
			lblHeight.setVisible(false);
			txtHeight.setVisible(false);
			butEnter.setEnabled(false);


		drawarea.repaint();
		}

		else if(s.getSource()==butSummary)
		//displays questions played in the game
		{
			
		String summaryDisplay="";
		
		for(int x=0;x<countShape;x++)
		{	summaryDisplay+="Name: "+name[x]+ "\n";
			summaryDisplay+="Class Number: "+classnum[x]+"\n";
			summaryDisplay+="Game"+(x+1)+": " + userShapes[x]+"  ";
			summaryDisplay+=generated_Numbers[x];
			summaryDisplay+="  "+ user_Answer[x]+"\n";

		}
		summaryDisplay+="Total Correct= "+right+ "   Total Incorrect= " +wrong;

		JOptionPane.showMessageDialog(null, summaryDisplay,
		 "Summary", JOptionPane.INFORMATION_MESSAGE);

		}
		else if(s.getSource()==butRectangle)
		//for the buttons Rectangle
		{
			shape=0;//refers to Rectangle

			butAnswer.setVisible(true);
			butNewGame.setEnabled(false);
			butRectangle.setEnabled(false);
			butCircle.setEnabled(false);
			radioBeginners.setVisible(true); //show when needed
			radioBeginners.setEnabled(true);
			radioIntermediate.setVisible(true);
			radioIntermediate.setEnabled(true);
			radioAdvance.setVisible(true);
			radioAdvance.setEnabled(true);
			txtRad.setVisible(true);
			lblRad.setVisible(true);
			lblRad.setText("Enter area here");//reuse when needed
			txtAns1.setVisible(true);
			lblAns1.setVisible(true);
			lblAns1.setText("Answer for perimeter");
			lblLength.setVisible(true);
			lblLength.setText("Length of Rectangle");
			txtLength.setVisible(true);
			lblHeight.setVisible(true);
			lblHeight.setText("Height of Rectangle");
			txtHeight.setVisible(true);
			lblAns2.setVisible(true);
			lblAns2.setText("Answer for area "); //
			txtAns2.setVisible(true);
			lblArea.setVisible(true);
			txtArea.setVisible(true);
			butEnter.setEnabled(false);
			lblArea.setText("Enter Perimeter here");

			drawarea.repaint();

		}
		else if(s.getSource()==butHelp)
		//provide help to user

		{
			butNewGame.setEnabled(true);
			butRectangle.setEnabled(false);
			butCircle.setEnabled(false);
			radioBeginners.setEnabled(false);
			radioIntermediate.setEnabled(false);
			radioAdvance.setEnabled(false);


		JOptionPane.showMessageDialog(null, ".Enter your name and class "+
		"\n"+"number in the textfield provideds." +"\n"+
		".Click on the start button to begin."+
		"\n" + ".Click to test Rectangle or Circle button." +
		"\n" + ".Sellect your level by clicking on a checkbox." +
		"\n" + ".Numbers are generated in the appropraite textfields."+
		"\n" + ".Please check these numbers."+
		"\n" + ".Workout your answers."+
		"\n" + ".Enter your answers in the textfieds provided"+
		"\n" + ".Click the enter button to continue",
		"Help",JOptionPane.INFORMATION_MESSAGE);

		}

		else if(s.getSource()==butEnter)
		//returns calculations to the program
		{
			try //character checking
			{
			if (shape==0) //testing rectangle
			{
			userShapes[countShape]= new String();
			userShapes[countShape]="Rectangle ";
			r2.setLength(Len);
			r2.setHeight(Hei);
			r2.calArea();
			r2.calPerimeter();
			per=r2.calPerimeter(); //call for calculation
			ar=r2.calArea();

			are=txtArea.getText(); //storing perimeter entered
			rep=txtRad.getText(); // storing area entered
			ans1=Integer.parseInt(rep); //converting area
			ans2=Integer.parseInt(are); //converting perimeter


			txtAns2.setText("" + ar);
			txtAns1.setText("" + per);

			r2.calArea();
			r2.calPerimeter();

			per=r2.calPerimeter(); //call for calculation
			ar=r2.calArea();

			if(ans2==r2.calPerimeter())
			{
				user_Answer[countShape]="Perimeter Correct";
				right++;
				txtCorrect.setText(Integer.toString(right));
			}
			else if(ans2!=r2.calPerimeter())
			{
				user_Answer[countShape]="Perimeter Incorrect";
				wrong++;
			txtIncorrect.setText(Integer.toString(wrong));
			}

			if(ans1==r2.calArea())
			{
				user_Answer[countShape]+="  Area Correct";
				right++;
			txtCorrect.setText(Integer.toString(right));
			}
			else if(ans1!=r2.calArea())
			{
				user_Answer[countShape]+="  Area Incorrect";
				wrong++;
			txtIncorrect.setText(Integer.toString(wrong));
			}


		} //closing if shape==0

			if(shape==1) //testing circle
			{
				userShapes[countShape]= new String();
				userShapes[countShape]="Circle ";

			c2.setRadius(rad);
			txtLength.setText("" + rad);
			cir=c2.Area(); // call for calculation for area of circle
			car=c2.Circumfer();

			DecimalFormat twoDigits = new DecimalFormat("0.00");


			care=txtRad.getText();
			are2=txtArea.getText(); //storing circumference entered
			cir2=Double.parseDouble(care); // converting area
			car2=Double.parseDouble(are2); //converting circumference


			twoDigits.format(cir2);
			twoDigits.format(car2);

			c2.Area();
			c2.Circumfer();

			cir=c2.Area(); // call for calculation for area of circle
			car=c2.Circumfer();
			
			txtAns2.setText("" + twoDigits.format(cir));
			txtAns1.setText("" + twoDigits.format(car));

			if(cir2== c2.Area())
			{
				user_Answer[countShape]="Area Correct";
				right++;
			txtCorrect.setText(Integer.toString(right));
			}
			else if(cir2!= c2.Area())
			{
				user_Answer[countShape]="Area Incorrect";
				wrong++;
			txtIncorrect.setText(Integer.toString(wrong));
			}

			if(car2== c2.Circumfer())
			{
				user_Answer[countShape]+="  Circumference Correct";
				right++;
			txtCorrect.setText(Integer.toString(right));
			}
			else if(car2!= c2.Circumfer())
			{
				user_Answer[countShape]+="  Circumference Incorrect";
				wrong++;
			txtIncorrect.setText(Integer.toString(wrong));

			}


		}//closing if shape==1

		name[countShape]=txtName.getText();
		classnum[countShape]=txtClassnum.getText();

		txtRad.setEditable(false);
		txtArea.setEditable(false);
		txtAns2.setEditable(false);
		txtAns1.setEditable(false);
		txtLength.setEditable(false);
		txtCorrect.setEditable(false);
		txtIncorrect.setEditable(false);
		txtHeight.setEditable(false);
		butSummary.setEnabled(true);
		butNewGame.setEnabled(true);
		butRectangle.setEnabled(false);
		butCircle.setEnabled(false);
		radioBeginners.setEnabled(false);
		radioIntermediate.setEnabled(false);
		radioAdvance.setEnabled(false);
		butEnter.setEnabled(false);
		butAnswer.setEnabled(true);

		countShape++;//increment variable
	}
	catch (Exception eg)//display error message if charater(s) is entered
	{
		JOptionPane.showMessageDialog(null, "Enter numbers only. No characters","Error",
		JOptionPane.ERROR_MESSAGE);
	 }


	}//closing else ifs.getSource==butEnter


}//closing medthod actionperformed

//Used for getting random for levels
	public void itemStateChanged(ItemEvent ie)
	{
		
		if (ie.getSource() instanceof Checkbox)
		{
			if(shape==0)  //testing Rectangle button
		    	{

			if(radioBeginners.getState()==true)
			{
				generated_Numbers[countShape]="Beginner";
				
			//get randoms according to levels
				sizeR=0;
				Len=(int)(java.lang.Math.random()*4)+6;

				Hei=(int)(java.lang.Math.random()*4)+6;
				drawarea.repaint();

			}

			else if(radioIntermediate.getState()==true)
			{
				generated_Numbers[countShape]="Intermediate";
				sizeR=1;
				Len=(int)(java.lang.Math.random()*4)+16;

				Hei=(int)(java.lang.Math.random()*4)+16;

			drawarea.repaint();

			}

			else if(radioAdvance.getState()==true)
			{
				generated_Numbers[countShape]="Advance";
				sizeR=2;
				Len=(int)(java.lang.Math.random()*4)+27;
				Hei=(int)(java.lang.Math.random()*4)+27;

				drawarea.repaint();//updates drawarea
			}

			r2.setLength(Len);
			txtLength.setText("" + Len);
			r2.setHeight(Hei);
			txtHeight.setText("" + Hei);

			generated_Numbers[countShape]+="  "+"Length= "+Len+"  "+"Height= "+Hei;


		}//closing if shape==0


		   else if (shape==1) // testing Circle button
		    {
			if(radioBeginners.getState()==true)
			{
				generated_Numbers[countShape]="Beginner";
				sizeC=0;
			rad=(int)(java.lang.Math.random()*6)+1;
			drawarea.repaint();
			}

			else if(radioIntermediate.getState()==true)
			{
				generated_Numbers[countShape]="Intermediate";
				sizeC=1;
			rad=(int)(java.lang.Math.random()*6)+5;
			drawarea.repaint();
			}
			else if(radioAdvance.getState()==true)
			{
				generated_Numbers[countShape]="Advance";
				sizeC=2;
			rad=(int)(java.lang.Math.random()*6)+10;

			drawarea.repaint();

			}
			c2.setRadius(rad);
			txtLength.setText("" + rad);

			generated_Numbers[countShape]+=" "+"Radius= "+rad;
		}//closing else if shape==1

			radioBeginners.setEnabled(false);
			radioIntermediate.setEnabled(false);
			radioAdvance.setEnabled(false);
			butNewGame.setEnabled(false);
			butEnter.setEnabled(true);


	}//closing instance of checkbox

		drawarea.repaint();


}//closing method itemstate


	class MyCanvas extends Canvas
	{

	public MyCanvas()
	{
	}
	public void paint(Graphics g)
	{
		int Len2=Len;
		int Hei2=Hei;
		int rad2=rad;

	if (shape==0) // refer to rectangle button
	{
		if(sizeR==0) // small size rectangle
		{

			g.setColor(Color.red);
			g.fillRect(100,50,100,50);
			g.setColor(Color.black);
			g.drawLine(100,110,200,110); // draw line for length
			g.drawString("Length " + Len2,130,130);
			g.drawLine(90,100,90,50); // draw line for height
			g.drawString("Height " + Hei2,40,80);

		}

		else if(sizeR==1) // medium size rectangle
		{

			g.setColor(Color.green);
			g.fillRect(100,50,150,100);
			g.setColor(Color.black);
			g.drawLine(100,160,250,160); // draw line for length
			g.drawString("Length " + Len2,180,180);
			g.drawLine(90,50,90,160); // draw line for height
			g.drawString("Height " + Hei2,30,110);
		}

		else if(sizeR==2) // large size rectangle
		{

			g.setColor(Color.blue);
			g.fillRect(100,50,200,150);
			g.setColor(Color.black);
			g.drawLine(100,210,300,210); // draw line for length
			g.drawString("Length " + Len2,225,225);
			g.drawLine(90,50,90,200); // draw line for height
			g.drawString("Height " + Hei2,30,110);

		}
		}//closing if shape==0

		else if(shape==1) //refer to Circle button
		{
			if(sizeC==0) //small size circle
			{

			g.setColor(Color.red);
			g.fillOval(100,50,100,50);
			g.setFont(new Font("SanSerif",Font.BOLD,18));
			g.setColor(Color.black);
			g.drawLine(150,80,199,80); // draw line for radius
			g.drawLine(150,81,199,81); // second line for thickness
			g.drawString("Radius " + rad2,110,110);

			}
			else if(sizeC==1) // medium size circle
			{
			g.setColor(Color.green);
			g.fillOval(100,50,150,100);
			g.setFont(new Font("SanSerif",Font.BOLD,18));
			g.setColor(Color.black);
			g.drawLine(180,100,250,100); // draw line for radius
			g.drawLine(180,101,250,101); // second line for thickness
			g.drawString("Radius " + rad2,120,120);
			}

			else if(sizeC==2) // large size circle
			{
			g.setColor(new Color (255,200,200));
			g.fillOval(100,50,200,150);
			g.setFont(new Font("SanSerif",Font.BOLD,18));
			g.setColor(Color.black);
			g.drawLine(300,115,200,115); // draw line for radius
			g.drawLine(300,116,200,116); // second line to thicken the line
			g.drawString("Radius " + rad2,150,150);
			}

		}

	}//closes void paint

	}//closes class MyCancas
}

