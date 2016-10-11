import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.util.ArrayList;

/**
 * A class that composes a GUI for RectangleComposer
 *
 */
public class ShapePainterFrame extends JFrame
{
	   private JTextField numberField;
	   private ShapePainter rectangle;
	   private ShapePainter ellipse;
	   private ShapePainter line;
	   private static final int FRAME_WIDTH = 1000;
	   private static final int FRAME_HEIGHT = 700;
	   private static final int number = 1;
	   private static ArrayList<ShapePainter> shapes = null;
	   
	/**
	 * Composes panel with text, labels, fields and buttons
	 */
	public ShapePainterFrame() 
	{
		 rectangle = new ShapePainter();
		 ellipse = new ShapePainter();
		 line = new ShapePainter();
	     rectangle.setPreferredSize(new Dimension(200, 175));
	     ellipse.setPreferredSize(new Dimension(200, 175));
	     line.setPreferredSize(new Dimension (200, 175));
	     
	     JPanel panel = new JPanel();

	     panel.add(createDrawRectangleButton());
	     panel.add(createDrawEllipseButton());
	     panel.add(createDrawLineButton());
	     panel.add(rectangle);
	     panel.add(ellipse);
	     panel.add(line);

	     setSize(FRAME_WIDTH, FRAME_HEIGHT);
	     add(panel);
	}

	
	/**
	 * Creates draw rectangle button 
	 * @return drawButton
	 */
	private JButton createDrawRectangleButton()
	{
		JButton drawButton = new JButton("Draw Rectangle");
		
		class DrawButtonListener implements ActionListener
	    {
			public void actionPerformed(ActionEvent event)
			{
	         
	            rectangle.setRectangleNumberAndPosition(number);

	         }
	      }

	      ActionListener listener = new DrawButtonListener();
	      drawButton.addActionListener(listener);      

	      return drawButton;
	 }
	
	/**
	 * Creates draw ellipse button 
	 * @return drawButton
	 */
	private JButton createDrawEllipseButton()
	{
		JButton drawButton = new JButton("Draw Ellipse");
		
		class DrawButtonListener implements ActionListener
	    {
			public void actionPerformed(ActionEvent event)
			{
	         
	            ellipse.setEllipseNumberAndPosition(number);

	         }
	      }

	      ActionListener listener = new DrawButtonListener();
	      drawButton.addActionListener(listener);      

	      return drawButton;
	 }
	
	/**
	 * Creates draw line button
	 * @return drawButton
	 */
	private JButton createDrawLineButton()
	{
		JButton drawButton = new JButton("Draw Line");
		
		class DrawButtonListener implements ActionListener
	    {
			public void actionPerformed(ActionEvent event)
			{
	         
	            line.setLineNumberAndPosition(number);

	         }
	      }

	      ActionListener listener = new DrawButtonListener();
	      drawButton.addActionListener(listener);      

	      return drawButton;
	 }

}


