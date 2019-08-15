package marginTable;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.UIManager;


@SuppressWarnings("serial")
public class frameMarginTable extends JFrame
{

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTable table;
	String header[] = {"Nama","Alamat","Email","Jenkel"};
	String record[][] = {{"Resa","Yogya","resa@gmail.com","Pria"},{"Candra","Jakarta","candra@gmail.com","Pria"},{"Dian","Surabaya","dian@yahoo.com","Pria"},{"Ayu","Jakarta","dita@yahoo.com","Wanita"},{"Dita","Jakarta","dita@gmail.com","Wanita"}};
	DefaultTableModel tabelModel;
	Dimension dimensi = new Dimension(30,2);
	private JLabel lblIcon;
	private JLabel lblWall;
	/**
	 * Create the frame.
	 */
	public frameMarginTable()
	{
		super("Margin JTable");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 725, 270);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 28, 505, 153);
		contentPane.add(scrollPane);
		
		tabelModel = new DefaultTableModel(record,header);
		table = new JTable();
		table.setShowGrid(true);
		table.setShowVerticalLines(true);
		table.setGridColor(Color.ORANGE);
		table.setIntercellSpacing(new Dimension(dimensi));
		table.setModel(tabelModel);
		scrollPane.setViewportView(table);
		setLocationRelativeTo(null);
		
		setHighRow(table);
		
		lblIcon = new JLabel("");
		lblIcon.setIcon(new ImageIcon("/home/resa/resa/Aplikasi Java/SwingComponents/src/Gambar/MarginTableImg/icon.png"));
		lblIcon.setBounds(551, 33, 161, 137);
		contentPane.add(lblIcon);
		
		lblWall = new JLabel("");
		lblWall.setIcon(new ImageIcon("/home/resa/resa/Aplikasi Java/SwingComponents/src/Gambar/MarginTableImg/wall.png"));
		lblWall.setBounds(0, -13, 758, 266);
		contentPane.add(lblWall);
	}
	
	public void setHighRow(JTable table)
	{
		int tinggi = table.getRowHeight();
		table.setRowHeight(tinggi + 15);
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run()
			{
				try 
				{
					//UIManager.setLookAndFeel("com.seaglasslookandfeel.SeaGlassLookAndFeel");
					frameMarginTable frameTable = new frameMarginTable();
					frameTable.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
