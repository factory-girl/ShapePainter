import javax.swing.JFrame;

/**
 * A class that composes a ShapePainterFrame
 */
public class ShapePainterViewer {
	public static void main(String[] args) {
		JFrame frame = new ShapePainterFrame();
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setTitle("Shape Painter");
	    frame.setVisible(true);
	    
	 }

}