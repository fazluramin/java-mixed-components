package ComboPicture;

import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

@SuppressWarnings({ "serial", "rawtypes" })
public class ImageRender extends JLabel implements ListCellRenderer
{
	String daftar[];
	public ImageRender(String gmb[])
	{
		daftar = gmb;
	}
	@Override
	public Component getListCellRendererComponent(JList list, Object value,
			int index, boolean isSelected, boolean cellHasFocus) 
	{
		// TODO Auto-generated method stub
		int idx = ((Integer)value).intValue();
		if(isSelected)
		{
			setBackground(list.getSelectionBackground());
			setForeground(list.getSelectionForeground());
		}
		else
		{
			setBackground(list.getBackground());
			setForeground(list.getForeground());
		}
		ImageIcon img = new ImageIcon("C:\\Users\\Nayraa-Rahman\\Documents\\NetBeansProjects\\Belajar_Java_Papas\\src\\Image ComboBox\\Image ComboBox\\Gambar\\ComboBox\\" + daftar[idx].toLowerCase() + ".png" );
		String var = daftar[idx];
		setIcon(img);
		setText(var);
		setHorizontalAlignment(CENTER);
		return this;
		
	}

}
