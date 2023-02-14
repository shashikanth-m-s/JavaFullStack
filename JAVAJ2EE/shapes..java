import java.applet.Applet;
import java.awt.*;
public class shapes extends Applet
{
setForeground(Color.red);
setBackground(Color.blue);
//drawing squares
g.drawLine(10,10,1000,10);
g.drawLine(10,10,10,10);
g.drawLine(10,100,100,100);
g.drawLine(100,100,100,10);
//Drawing triangle
g.drawLine(10,120,100,120);
g.drawLine(10,120,50,200);
g.drawLine(50,200,100,120);
//drawing Rectangle
g.drawRect(120,10,220,120);
g.fillRect(120,120,220,120);
//drawing ellipse and circle
g.drawOval(10,220,100,220);
g.setColor(Color.yellow);
g.fillOval(120,250,250,250);
//draw a filled arc
g.fillArc(350,50,400,100,0,90);
//draw a polygon
int[]x;
x = new int[]{400,500,400,500};
int[]y;
y = new int[]{240,240,340,340};
g.drawPolygon(x,y,4);
}
}