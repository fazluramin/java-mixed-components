package colorMenuItem;

import java.awt.geom.*;
import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class roundButton extends JButton {
	
	public roundButton(String lbl)
	{
		super(lbl);
		Dimension dim = getPreferredSize();
		dim.width = dim.height = Math.max(dim.width, dim.height);
		setPreferredSize(dim);
		setContentAreaFilled(false);
	}
	
	protected void paintComponent(Graphics graph)
	{
		if(getModel().isArmed())
		{
			graph.setColor(Color.lightGray);
		}
		else
		{
			graph.setColor(getBackground());
		}
		graph.fillOval(0, 0, getSize().width-1, getSize().height-1);
		super.paintComponent(graph);
	}
	
	protected void paintBorder(Graphics graph)
	{
		graph.setColor(getForeground());
		graph.drawOval(0, 0, getSize().width-1, getSize().height-1);
	}
	
	Shape s;
	public boolean contains(int x, int y)
	{
		if(s == null || !s.getBounds().equals(getBounds()))
		{
			s = new Ellipse2D.Float(0, 0, getWidth(), getHeight());
		}
		return s.contains(x, y);
	}
}
