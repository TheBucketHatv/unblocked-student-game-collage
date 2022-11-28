import pkg.*;

public class happyFace 
{
	private Ellipse face;
	private Ellipse eyeL;
	private Ellipse eyeR;
	private Ellipse pupilL;
	private Ellipse pupilR;
	private Ellipse mouth;
	private Ellipse mouthCover;
	private double w; 
	private double z;
	private double step; 
	
public happyFace()
{
	step = 1;
	face = new Ellipse (700,790,40,40);
	eyeL = new Ellipse (708,801,10,10);
	eyeR = new Ellipse (723,801,10,10);
	pupilL = new Ellipse (711,803,7,7);
	pupilR = new Ellipse (726,803,7,7);
	mouth = new Ellipse (714,812,13,13);
	mouthCover = new Ellipse (714,809,13,13);
	
}
	
public void fill()
{
	Color faceC = new Color (255,248,56);
	face.setColor(faceC);
	
	Color mouthC = new Color(28,20,20);
	mouth.setColor(mouthC);
	
	mouthCover.setColor(faceC);
	Color eyeC = new Color (255,255,255);
	
	eyeL.setColor(eyeC);
	eyeR.setColor(eyeC);
	
	face.fill();
	eyeL.fill();
	eyeR.fill();
	pupilL.fill();
	pupilR.fill();
	mouth.fill();
	mouthCover.fill();
}
	
public void translate(double x, double y)
{
	w = x;
	z = y;
	
	face.translate(x,y);
	eyeL.translate(x,y);
	eyeR.translate(x,y);
	pupilL.translate(x,y);
	pupilR.translate(x,y);
	mouth.translate(x,y);
	mouthCover.translate(x,y);
	
}
/*
public void pupilTranslate()
{
	if(w>=0)
	{
		pupilL.translate(2,0);
		pupilR.translate(2,0);
	}
	
	else if (w<=0)
	{
		pupilL.translate(-2,0);
		pupilR.translate(-2,0);
	} 
	
	else if (z<=0)
	{
		pupilL.translate(0,-2);
		pupilR.translate(0,-2);
	}
	
	else if (z>=0)
	{
		pupilL.translate(0,2);
		pupilR.translate(0,2);
	}
	
}
*/

public void setStep(double st)
{
	step = st;
}

public double getStep()
{
	return step;
}
public int getX()
{
	return face.getX();
}

public int getY()
{
	return face.getY();
}

public int getWidth()
{
	return face.getWidth();
}

public int getHeight()
{
	return face.getHeight();
}

public boolean crash (Car c)
{
	
	
	boolean frog; 
	Rectangle boundary = c.getBoundBox();
	
	if(face.contains(boundary))
	{
		frog = true;
		Text fail = new Text (200,200,"You crashed!");
		Text oof = new Text (500,500,"oof");
		fail.grow(200,100);
		fail.draw();
		oof.draw();
	}
	
	else{
		frog = false;
		
	}
	
	return frog; 
}
	
}