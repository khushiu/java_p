import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
public class Hello1 extends Applet
{
	public void init(){
		resize(500,500);
		setBackground(Color.YELLOW);
	}
public void paint(Graphics g)
{
g.drawString("The window will be resized",150,150);
}
}