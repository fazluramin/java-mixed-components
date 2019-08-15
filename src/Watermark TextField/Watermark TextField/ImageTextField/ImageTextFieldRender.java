package ImageTextField;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.TexturePaint;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JTextField;
import java.awt.Rectangle;

@SuppressWarnings("serial")
public class ImageTextFieldRender extends JTextField
{
	BufferedImage buffer;
	TexturePaint tp;
	
	public ImageTextFieldRender(File file)
	{
		super();
			try 
			{
				buffer = ImageIO.read(file);
				Rectangle rect = new Rectangle(0,0,buffer.getWidth(null),buffer.getHeight(null));
				tp = new TexturePaint(buffer, rect);
				setOpaque(false);
			} 
			catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public void paintComponent(Graphics graph)
	{
		Graphics2D graph2D = (Graphics2D) graph;
		graph2D.setPaint(tp);
		graph.fillRect(0, 0, getWidth(), getHeight());
		super.paintComponent(graph);
	}
}
