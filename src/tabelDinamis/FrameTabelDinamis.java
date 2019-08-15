package tabelDinamis;

import java.awt.Component;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
//import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.DefaultTableColumnModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

@SuppressWarnings("serial")
public class FrameTabelDinamis extends JFrame
{

	private JPanel contentPane;
	private JTextField txtId;
	private JLabel lblIdBuku;
	private JLabel lblJudul;
	private JTextField txtJudul;
	private JLabel lblJenis;
	@SuppressWarnings("rawtypes")
	private JComboBox cbJenis;
	private JButton btnTampil;
	private JTable tabel;
	DefaultTableModel tabelModel;
	String header[] = {"ID Buku","Judul","Jenis"};
	private JButton btnRefresh;
	private JLabel lblBg;
	private JLabel lblIcon;

	/**
	 * Create the frame.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public FrameTabelDinamis() 
	{
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 749, 448);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblIdBuku = new JLabel("ID Buku : ");
		lblIdBuku.setForeground(new Color(255, 255, 255));
		lblIdBuku.setBounds(12, 12, 70, 15);
		contentPane.add(lblIdBuku);
		
		txtId = new JTextField();
		txtId.setBounds(123, 10, 174, 19);
		contentPane.add(txtId);
		txtId.setColumns(10);
		
		lblJudul = new JLabel("Judul : ");
		lblJudul.setForeground(new Color(255, 255, 255));
		lblJudul.setBounds(12, 39, 70, 15);
		contentPane.add(lblJudul);
		
		txtJudul = new JTextField();
		txtJudul.setBounds(123, 41, 430, 26);
		contentPane.add(txtJudul);
		txtJudul.setColumns(10);
		
		lblJenis = new JLabel("Jenis : ");
		lblJenis.setForeground(new Color(255, 255, 255));
		lblJenis.setBounds(12, 86, 70, 15);
		contentPane.add(lblJenis);
		
		cbJenis = new JComboBox();
		cbJenis.setModel(new DefaultComboBoxModel(new String[] {"---------", "Agama", "Computer", "Bola"}));
		cbJenis.setBounds(123, 79, 146, 29);
		contentPane.add(cbJenis);
		
		btnTampil = new JButton("Tampil ke Tabel");
		btnTampil.setIcon(new ImageIcon("/home/resa/Aplikasi Java/SwingComponents/src/Gambar/Save.png"));
		btnTampil.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent act)
			{
				int id = Integer.parseInt(txtId.getText());
				String judul = txtJudul.getText();
				String jenis = " ";
				if(cbJenis.getSelectedIndex() == 1)
				{
					jenis = "Agama";
				}
				else if(cbJenis.getSelectedIndex() == 2)
				{
					jenis = "Computer";
				}
				else if(cbJenis.getSelectedIndex() == 3)
				{
					jenis = "Bola";
				}
				
				Object obj[] = new Object[3];
				obj[0] = id;
				obj[1] = judul;
				obj[2] = jenis;
				tabelModel.addRow(obj);
				setLebarKolom(); //Memanggil method setLebarKolom()
			}
		});
		btnTampil.setBounds(123, 153, 174, 38);
		contentPane.add(btnTampil);
		
		btnRefresh = new JButton("Refresh");
		btnRefresh.setIcon(new ImageIcon("/home/resa/Aplikasi Java/SwingComponents/src/Gambar/Refresh.png"));
		btnRefresh.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent act)
			{
				txtId.setText("");
				txtJudul.setText("");
				cbJenis.setSelectedIndex(0);
				txtId.requestFocus();
			}
		});
		btnRefresh.setBounds(325, 153, 117, 38);
		contentPane.add(btnRefresh);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(123, 217, 319, 142);
		contentPane.add(scrollPane);
		
		tabelModel = new DefaultTableModel(null,header);
		tabel = new JTable();
		tabel.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); //mendisable AutoResize untuk membuat kolom tabel dinamis
		tabel.setModel(tabelModel);
		scrollPane.setViewportView(tabel);
		
		lblIcon = new JLabel("");
		lblIcon.setIcon(new ImageIcon("/home/resa/Aplikasi Java/SwingComponents/src/Gambar/Laptop2.png"));
		lblIcon.setBounds(460, 127, 256, 170);
		contentPane.add(lblIcon);
		
		lblBg = new JLabel("");
		lblBg.setIcon(new ImageIcon("/home/resa/Aplikasi Java/SwingComponents/src/Gambar/hijauBlur.jpg"));
		lblBg.setBounds(-8, 0, 755, 423);
		contentPane.add(lblBg);
		setLocationRelativeTo(null);
	}
	
	public void setColumnWidth(int kolom)
	{
		DefaultTableColumnModel modelKolom = (DefaultTableColumnModel) tabel.getColumnModel();
		TableColumn kolomTabel = modelKolom.getColumn(kolom);
		int lebar = 0;
		int margin = 10;
		int a;
		
		TableCellRenderer renderer = kolomTabel.getHeaderRenderer();
		if(renderer == null)
		{
			renderer = tabel.getTableHeader().getDefaultRenderer();
		}
		Component komponen = renderer.getTableCellRendererComponent(tabel, kolomTabel.getHeaderValue(), false, false, 0, 0);
		lebar = komponen.getPreferredSize().width;
			for(a=0;a<tabel.getRowCount();a++)
			{
				renderer = tabel.getCellRenderer(a, kolom);
				komponen = renderer.getTableCellRendererComponent(tabel, tabel.getValueAt(a, kolom), false, false, a, kolom);
				int lebarKolom = komponen.getPreferredSize().width;
				lebar = Math.max(lebar, lebarKolom);
				
			}
			lebar  = lebar + margin;
			kolomTabel.setPreferredWidth(lebar);
	}
	
	public void setLebarKolom()
	{
		int a;
		for(a=0;a<tabel.getColumnCount();a++)
		{
			setColumnWidth(a);
		}
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				/*
				try 
				{
					UIManager.setLookAndFeel("com.easynth.lookandfeel.EaSynthLookAndFeel");
					FrameTabelDinamis frame = new FrameTabelDinamis();
					frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}*/
				
				try 
				{
					FrameTabelDinamis frame = new FrameTabelDinamis();
					frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}
}
