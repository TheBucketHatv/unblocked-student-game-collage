import pkg.*;
import java.util.ArrayList;

public class starter implements InputControl, InputKeyControl {
	public static happyFace bob = new happyFace();
	
	public static void main(String args[]) {
		// please leave following line alone, necessary for keyboard/mouse input
		KeyController kC = new KeyController(Canvas.getInstance(),new starter());
		MouseController mC = new MouseController(Canvas.getInstance(),new starter());
	
	//tired - Connor 
	// Maria = ? 

	Rectangle rect = new Rectangle (0,500,1550,100);
	Color myColor = new Color (5,232,73);
	rect.setColor(myColor);
	rect.fill();
	
	Rectangle rect2 = new Rectangle (0,300,1550,100);
	Color myColor2 = new Color (5,232,73);
	rect2.setColor(myColor2);
	rect2.fill();
	
	Rectangle rect3 = new Rectangle (0,100,1550,100);
	Color myColor3 = new Color (5,232,73);
	rect3.setColor(myColor3);
	rect3.fill();

	bob.fill();
	bob.setStep(16);
	
	roads();
	int coorY = Canvas.rand(7)+1;
	
	Car[] traffic = new Car [20];
	
	if(coorY == 1 || coorY ==3 || coorY ==5 || coorY ==8)
	{
		coorY+=1;
	}
	
	traffic[0] = new Car (0,coorY*100 + 5, "numbah one");
	
	traffic[0].draw();
	
	for(int x = 1; x<traffic.length; x++)
	{
		coorY = Canvas.rand(7)+1;
	if(coorY == 1 || coorY ==3 || coorY ==5 || coorY ==7)
	{
		coorY+=1;
	}
		traffic[x] = new Car (traffic[x-1].getX()-Canvas.rand(100)-200,coorY*100+5, "test");
		traffic[x].draw();
	}
	
	while(true)
	{
		for(int y = 0; y<traffic.length; y++)
		{
		traffic[y].driveRandom();
		if(bob.crash(traffic[y]))
		{
			bob.setStep(0);
			for(int c = 0; c<traffic.length; c++)
			{
				traffic[c].setStep(0);
			}
			
		}
		
		if(bob.getY()<=0){
		Text success = new Text (200,200,"Success!");
		Text yay = new Text (500,500,"yay! :D " );
		success.grow(200,100);
		success.draw();
		yay.draw();
		traffic[y].setStep(0);
		bob.setStep(0);
		}
		
		}
		
	}
	
	}
	
	public static void roads()
	{
	
	Line line2 = new Line (0,200,1550,200);
	Line line3 = new Line (0,300,1550,300);
	Line line4 = new Line (0,400,1550,400);
	Line line5 = new Line (0,500,1550,500);
	Line line6 = new Line (0,600,1550,600);
	Line line7 = new Line (0,700,1550,700);
	Line line8 = new Line (0,800,1550,800);
	Line line9 = new Line (0,900,1550,900);
	Line line10 = new Line (500,0,1550,800);
	
	
	line2.draw();
	line3.draw();
	line4.draw();
	line5.draw();
	line6.draw();
	line7.draw();
	line8.draw();
	line9.draw();

	}

	public void onMouseClick(double x, double y) {

	}

	public void keyPress(String s) {
		
		if(s.equals("a"))
		{
			bob.translate(-(bob.getStep()),0);
		}
		
		else if(s.equals("s"))
		{
			bob.translate(0,bob.getStep());
		}
		
		else if(s.equals("w"))
		{
			bob.translate(0,-(bob.getStep()));
		}
		
		else if(s.equals("d"))
		{
			bob.translate(bob.getStep(),0);
		}

	}
}
