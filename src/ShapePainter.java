import javax.swing.JComponent;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.lang.Math;
import java.util.ArrayList;

/**
   A class which draws rectangles in random positions.
*/
public class ShapePainter extends JComponent {
	private Rectangle2D.Double rectangle;
	private Ellipse2D.Double ellipse;
	private Line2D.Double line;
	private ArrayList<ShapePainter> shapes;
	private int x;
	private int y;
	private int width;
	private int height;
	private static ArrayList<Rectangle2D.Double> rectList = new ArrayList<Rectangle2D.Double>();
	private ArrayList<Ellipse2D.Double> ellipseList = new ArrayList<Ellipse2D.Double>();
	private ArrayList<Line2D.Double> lineList = new ArrayList<Line2D.Double>();
	
	/**
	 * Constructs null shape
	 */
    public ShapePainter()
    {  
    	x = 0;
    	y = 0;
    	width = 45;
    	height = 60;
    	rectangle = null;
    	ellipse = null;
    	line = null;
    	ArrayList<ShapePainter> shapes = null;
    }
    
    public static ArrayList<Rectangle2D.Double> getRectList() {
    	return rectList;
    }
    
    public ArrayList<Ellipse2D.Double> getEllipseList() {
    	return ellipseList;
    }
    
    public ArrayList<Line2D.Double> getLineList() {
    	return lineList;
    }
    
    /**
     * Sets attributes and number of rectangles to be drawn
     * @param number number of rectangles to be drawn
     */
    public void setRectangleNumberAndPosition(int number)
    {
    	for (int i = number; i > 0; i--) {
    		rectangle = new Rectangle2D.Double(Math.random()*100, Math.random()*100, width, height);
    		rectList.add(rectangle);
    	}
    	repaint();
    }
    
    /**
     * Sets attributes and number of ellipses to be drawn
     * @param number number of ellipses to be drawn
     */
    public void setEllipseNumberAndPosition(int number)
    {
    	for (int i = number; i > 0; i--) {
    		ellipse = new Ellipse2D.Double(Math.random()*100, Math.random()*100, width, height);
    		ellipseList.add(ellipse);
    	}
    	repaint();
    }
    
    /**
     * Sets attributes and number of lines to be drawn
     * @param number number of lines to be drawn
     */
    public void setLineNumberAndPosition(int number)
    {
    	for (int i = number; i > 0; i--) {
    		line = new Line2D.Double(Math.random()*100, Math.random()*100, width, height);
    		lineList.add(line);
    	}
    	repaint();
    }
    
    /**
     * Method that draws a shape
     * @param g graphics component
     */
    public void paintComponent(Graphics g)
    {	
    	Graphics2D g2 = (Graphics2D) g; 
    	for (Rectangle2D.Double rect : rectList) {
    		g2.fill(rect);
    		g2.setColor(Color.MAGENTA);

    	}
    	
    	for (Ellipse2D.Double ellipse : ellipseList) {
    		g2.fill(ellipse);
    		g2.setColor(Color.pink);
    	}
    	
    	for (Line2D.Double line : lineList) {
    		g2.draw(line);
    		g2.setColor(Color.blue);
    	}
   }
    
    
    
    
}

