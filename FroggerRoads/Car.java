import pkg.*;

public class Car 
{
	
	private Text label;
	private Rectangle boundary;
	private Rectangle hull;
	private Rectangle hullR;
	private Rectangle windowL;
	private Rectangle windowR;
	private Ellipse wheelL;
	private Ellipse wheelR;
	private Ellipse headlight;
	private Ellipse tireL;
	private Ellipse tireR;
	private Rectangle handle;
	private int step;
	private double v;
	private double w;
	
	
public Car (double x, double y, String name)
{
	
	step = 1;
	hull = new Rectangle (x,y,110,70);
	hullR = new Rectangle (x+110,y+35,35,35);
	windowL = new Rectangle (x+8,y+10,40,30);
	windowR = new Rectangle(x+59,y+10,40,30);
	tireL = new Ellipse(x+15,y+55,30,30);
	tireR = new Ellipse(x+72,y+55,30,30);
	headlight = new Ellipse(x+130,y+42,13,13);
	handle = new Rectangle(x+55,y+42,17,5);
	label = new Text(x+windowL.getWidth()/2,y+windowR.getHeight()/2,name);
	
	v = x;
	w = y;
	
	boundary = new Rectangle (v,w,(hull.getWidth()+hullR.getWidth()), hull.getHeight()+tireR.getHeight()/2);

	Color choice = new Color(Canvas.rand(256),Canvas.rand(256),Canvas.rand(256));
	
	Color hullColor = new Color (80,15,163);
	Color windowColor = new Color(86,236,252);
	Color handleColor = new Color(139,138,158);
	
	hull.setColor(choice);
	hullR.setColor(hullColor);
	windowL.setColor(windowColor);
	windowR.setColor(windowColor);
	handle.setColor(handleColor);
	headlight.setColor(Color.YELLOW);
	
}

public Rectangle getBoundBox()
{
	Rectangle test = boundary;
	return test;
}

public Color chooseColor(int a, int b, int c)
{
	Color choice = new Color (a,b,c);
	hull.setColor(choice);
	hull.fill();
	return choice;
	
}

public void draw()
{
	hull.fill();
	hullR.fill();
	windowL.fill();
	windowR.fill();
	tireL.fill();
	tireR.fill();
	headlight.fill();
	handle.fill();
	label.draw();
	boundary.draw();
}

public int getStep()
{
	return step;
}

public void setStep(int st)
{
	step = st;
}


public void translate(double a, double b)
{
	hull.translate(a,b);
	hullR.translate(a,b);
	windowL.translate(a,b);
	windowR.translate(a,b);
	tireL.translate(a,b);
	tireR.translate(a,b);
	headlight.translate(a,b);
	boundary.translate(a,b);
	handle.translate(a,b);
	label.translate(a,b);
}

public int getX()
{
	return hull.getX();
}

public int getY()
{
	return hull.getY();
}
public int getWidth()
{
	return boundary.getWidth();
}

public int getHeight()
{
	return boundary.getHeight();
}

public void driveRandom()
{
	hull.translate(getStep(),0);
	hullR.translate(getStep(),0);
	windowL.translate(getStep(),0);
	windowR.translate(getStep(),0);
	tireL.translate(getStep(),0);
	tireR.translate(getStep(),0);
	headlight.translate(getStep(),0);
	boundary.translate(getStep(),0);
	label.translate(getStep(),0);
	handle.translate(getStep(),0);
	int f = windowL.getY(); 
	
	if(hull.getX()>=1500)
	{
	int e = Canvas.rand(7)+1; 
	
	if(e == 1 || e ==3 || e ==5 || e ==8)
	{
		e+=1;
	}
	
	hull.translate(-1500,e*100);
	hullR.translate(-1500,e*100);
	windowL.translate(-1500,e*100);
	windowR.translate(-1500,e*100);
	tireL.translate(-1500,e*100);
	tireR.translate(-1500,e*100);
	headlight.translate(-1500,e*100);
	boundary.translate(-1500,e*100);
	label.translate(-1500,e*100);
	handle.translate(-1500,e*100);
	}
	
	if (hull.getY()>=1500 || hull.getY()<=0)
	{
		int h = 0-hull.getY();;
		
		hull.translate(0,h);
		hullR.translate(0,h);
		windowL.translate(0,h);
		windowR.translate(0,h);
		tireL.translate(0,h);
		tireR.translate(0,h);
		headlight.translate(0,h);
		boundary.translate(0,h);
		label.translate(0,h);
		handle.translate(0,h);
	}	
}

public void drive()
{
	
	hull.translate(10,0);
	hullR.translate(10,0);
	windowL.translate(10,0);
	windowR.translate(10,0);
	tireL.translate(10,0);
	tireR.translate(10,0);
	headlight.translate(10,0);
	boundary.translate(10,0);
	label.translate(10,0);
	handle.translate(10,0);


	
	if(hull.getX()>=500)
	{
	hull.translate(-500,+100);
	hullR.translate(-500,+100);
	windowL.translate(-500,+100);
	windowR.translate(-500,+100);
	tireL.translate(-500,+100);
	tireR.translate(-500,+100);
	headlight.translate(-500,+100);
	boundary.translate(-500,+100);
	label.translate(-500,+100);
	handle.translate(-500,+100);
	
	
	
	if (hull.getY()>=800)
	{
		hull.translate(0,-800);
		hullR.translate(0,-800);
		windowL.translate(0,-800);
		windowR.translate(0,-800);
		tireL.translate(0,-800);
		tireR.translate(0,-800);
		headlight.translate(0,-800);
		boundary.translate(0,-800);
		label.translate(0,-800);
		handle.translate(0,-800);
		System.out.print(hull.getX() + " " + hull.getY());
	}
	
	}
	
}

}

