package colorItemComboBox;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;


@SuppressWarnings({ "rawtypes", "serial" })
public class comboRenderer extends JPanel implements ListCellRenderer
{
    private Color[] colors;
    private String[] strings;

    JPanel textPanel;
    JLabel text;

    public comboRenderer(JComboBox combo) {

        textPanel = new JPanel();
        textPanel.add(this);
        text = new JLabel();
        text.setOpaque(true);
        text.setFont(combo.getFont());
        textPanel.add(text);
    }

    public void setColors(Color[] col)
    {
        colors = col;
    }

    public void setStrings(String[] str)
    {
        strings = str;
    }

    public Color[] getColors()
    {
        return colors;
    }

    public String[] getStrings()
    {
        return strings;
    }

    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {

        if (isSelected)
        {
            setBackground(list.getSelectionBackground());
        }
        else
        {
            setBackground(Color.WHITE);
        }

        if (colors.length != strings.length)
        {
            return this;
        }
        else if (colors == null)
        {
            return this;
        }
        else if (strings == null)
        {
            return this;
        }

        text.setBackground(getBackground());

        text.setText(value.toString());
        if (index>-1) 
        {
            text.setForeground(colors[index]);
        }
        return text;
    }
}