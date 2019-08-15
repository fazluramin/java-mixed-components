
import ComboPicture.ImageRender;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class FrameCombo extends JFrame 
{

	private JPanel contentPane;
	@SuppressWarnings("rawtypes")
	private JComboBox cbComp;
	String data[] = {"Laptop","PC","Smartphone","Tablet"};
	int a;
	private JTextField txtId;
	private JTextField txtNama;
	private JButton btnTampil;
	String id;
	String nama ; 
	String jenis;
	private JLabel lblIcon;
	private JLabel lblIcon_2;
	
	/**
	 * Create the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public FrameCombo() 
	{
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 583, 393);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Integer[] idx = new Integer[data.length];
		for(a=0;a<data.length;a++)
		{
			idx[a] = new Integer(a);
		}
		
		cbComp = new JComboBox(idx);
		cbComp.setRenderer(new ImageRender(data));
		cbComp.setBounds(111, 101, 209, 65);
		contentPane.add(cbComp);
		
		JLabel lblId = new JLabel("Id.Barang : ");
		lblId.setForeground(new Color(255, 255, 255));
		lblId.setBounds(12, 12, 111, 15);
		contentPane.add(lblId);
		
		txtId = new JTextField();
		txtId.setBounds(111, 10, 133, 34);
		contentPane.add(txtId);
		txtId.setColumns(10);
		
		JLabel lblNama = new JLabel("Nama : ");
		lblNama.setForeground(new Color(255, 255, 255));
		lblNama.setBounds(12, 58, 70, 15);
		contentPane.add(lblNama);
		
		txtNama = new JTextField();
		txtNama.setBounds(110, 56, 288, 33);
		contentPane.add(txtNama);
		txtNama.setColumns(10);
		
		JLabel lblJenis = new JLabel("Jenis : ");
		lblJenis.setForeground(new Color(255, 255, 255));
		lblJenis.setBounds(12, 113, 70, 15);
		contentPane.add(lblJenis);
		
		btnTampil = new JButton("Tampilkan Data ");
		btnTampil.setIcon(new ImageIcon("C:\\Users\\Nayraa-Rahman\\Documents\\NetBeansProjects\\Belajar_Java_Papas\\src\\Image ComboBox\\Image ComboBox\\Gambar\\tampilData.png"));
		btnTampil.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent act)
			{
				id = txtId.getText();
			    nama = txtNama.getText();
				jenis = "";
				if(cbComp.getSelectedIndex() == 0)
				{
					jenis = "Laptop";
				}
				else if(cbComp.getSelectedIndex() == 1)
				{
					jenis = "PC";
				}
				else if(cbComp.getSelectedIndex() == 2)
				{
					jenis = "Smartphone";
				}
				else if(cbComp.getSelectedIndex() == 3)
				{
					jenis = "Tablet";
				}
				JOptionPane.showMessageDialog(null,"ID : " + id + "\n" + "Nama Barang : " + nama + "\n" + "Jenis : " + jenis,"Pesan",JOptionPane.INFORMATION_MESSAGE,new ImageIcon("src/Gambar/success.png"));
			}
		});
		btnTampil.setBounds(203, 244, 195, 46);
		contentPane.add(btnTampil);
		
		lblIcon = new JLabel("");
		lblIcon.setIcon(new ImageIcon("C:\\Users\\Nayraa-Rahman\\Documents\\NetBeansProjects\\Belajar_Java_Papas\\src\\Image ComboBox\\Image ComboBox\\Gambar\\Comp.png"));
		lblIcon.setBounds(416, 58, 145, 129);
		contentPane.add(lblIcon);
		
		lblIcon_2 = new JLabel("");
		lblIcon_2.setIcon(new ImageIcon("C:\\Users\\Nayraa-Rahman\\Documents\\NetBeansProjects\\Belajar_Java_Papas\\src\\Image ComboBox\\Image ComboBox\\Gambar\\IconFirefox.png"));
		lblIcon_2.setBounds(12, 239, 157, 115);
		contentPane.add(lblIcon_2);
		
		JLabel lblBg = new JLabel("");
		lblBg.setIcon(new ImageIcon("C:\\Users\\Nayraa-Rahman\\Documents\\NetBeansProjects\\Belajar_Java_Papas\\src\\Image ComboBox\\Image ComboBox\\Gambar\\hijauBg.png"));
		lblBg.setBounds(0, 0, 581, 366);
		contentPane.add(lblBg);
		setLocationRelativeTo(null);
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
				try 
				{
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
					FrameCombo frame = new FrameCombo();
					frame.setVisible(true);
				} 
				catch (UnsupportedLookAndFeelException e) {
				} 
				catch (ClassNotFoundException e){
				} 
				catch (InstantiationException e) {
				} 
				catch (IllegalAccessException e) {
				}
			}
		});
	}
}
