


import ImageTextField.ImageTextFieldRender;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class frameTextField extends JFrame 
{

	private JPanel contentPane;
	private JTextField txtNama;
	@SuppressWarnings("rawtypes")
	private JComboBox cbKd;
	private JLabel lblNama;
	private JTextField txtBerangkat;
	private JTextField txtTiba;
	private JTextField txtJurusan;
	private JLabel lblIcon;
	private JLabel lblIcon_2;
	/**
	 * Create the frame.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public frameTextField() 
	{
		super("TextField Watermark");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 584, 344);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		txtNama = new ImageTextFieldRender(new File("C:\\Users\\Nayraa-Rahman\\Documents\\NetBeansProjects\\Belajar_Java_Papas\\src\\Watermark TextField\\Watermark TextField\\Gambar\\Watermark\\biru.png"));
		txtNama.setForeground(new Color(0, 0, 0));
		txtNama.setBounds(133, 64, 199, 29);
		contentPane.add(txtNama);
		txtNama.setColumns(10);
		
		JLabel lblKdKereta = new JLabel("Kd Kereta : ");
		lblKdKereta.setForeground(new Color(255, 255, 255));
		lblKdKereta.setBounds(12, 12, 102, 15);
		contentPane.add(lblKdKereta);
		
		cbKd = new JComboBox();
		cbKd.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent act)
			{
				if(cbKd.getSelectedIndex() == 1)
				{
					txtNama.setText("Progo");
					txtJurusan.setText("Ps.Senen - Lempuyangan");
					txtBerangkat.setText("20:40");
					txtTiba.setText("07:25");
				}
				else if(cbKd.getSelectedIndex() == 2)
				{
					txtNama.setText("Bogowonto");
					txtJurusan.setText("Ps.Senen - Tugu Yogya");
					txtBerangkat.setText("18:40");
					txtTiba.setText("04:30");
				}
				else if(cbKd.getSelectedIndex() == 3)
				{
					txtNama.setText("Fajar Utama Solo");
					txtJurusan.setText("Jatinegara - Solo");
					txtBerangkat.setText("08:00");
					txtTiba.setText("16:05");
				}
				else if(cbKd.getSelectedIndex() == 4)
				{
					txtNama.setText("Argo Dwipangga");
					txtJurusan.setText("Gambir - Surabaya");
					txtBerangkat.setText("10.00");
					txtTiba.setText("23:30");
				}
				else if(cbKd.getSelectedIndex() == 0)
				{
					txtNama.setText("");
					txtJurusan.setText("");
					txtBerangkat.setText("");
					txtTiba.setText("");
				}
			}
		});
		cbKd.setModel(new DefaultComboBoxModel(new String[] {"------", "KA 001", "KA 002", "KA 003", "KA 004"}));
		cbKd.setBounds(133, 7, 165, 24);
		contentPane.add(cbKd);
		
		lblNama = new JLabel("Nama : ");
		lblNama.setForeground(new Color(255, 255, 255));
		lblNama.setBounds(12, 71, 70, 15);
		contentPane.add(lblNama);
		
		JLabel lblJurusan = new JLabel("Jurusan : ");
		lblJurusan.setForeground(new Color(255, 255, 255));
		lblJurusan.setBounds(12, 122, 70, 15);
		contentPane.add(lblJurusan);
		
		JLabel lblJamBerangkat = new JLabel("Jam Berangkat : ");
		lblJamBerangkat.setForeground(new Color(255, 255, 255));
		lblJamBerangkat.setBounds(12, 179, 116, 15);
		contentPane.add(lblJamBerangkat);
		
		txtBerangkat = new ImageTextFieldRender(new File("C:\\Users\\Nayraa-Rahman\\Documents\\NetBeansProjects\\Belajar_Java_Papas\\src\\Watermark TextField\\Watermark TextField\\Gambar\\Watermark\\hijau.jpeg"));
		txtBerangkat.setForeground(new Color(255, 255, 255));
		txtBerangkat.setBounds(133, 171, 127, 31);
		contentPane.add(txtBerangkat);
		txtBerangkat.setColumns(10);
		
		JLabel lblJamTiba = new JLabel("Jam Tiba : ");
		lblJamTiba.setForeground(new Color(255, 255, 255));
		lblJamTiba.setBounds(12, 221, 102, 15);
		contentPane.add(lblJamTiba);
		
		txtTiba = new ImageTextFieldRender(new File("C:\\Users\\Nayraa-Rahman\\Documents\\NetBeansProjects\\Belajar_Java_Papas\\src\\Watermark TextField\\Watermark TextField\\Gambar\\Watermark\\hijau.jpeg"));
		txtTiba.setForeground(new Color(255, 255, 255));
		txtTiba.setBounds(133, 214, 127, 29);
		contentPane.add(txtTiba);
		txtTiba.setColumns(10);
		
		txtJurusan = new ImageTextFieldRender(new File("C:\\Users\\Nayraa-Rahman\\Documents\\NetBeansProjects\\Belajar_Java_Papas\\src\\Watermark TextField\\Watermark TextField\\Gambar\\Watermark\\biru.png"));
		txtJurusan.setForeground(new Color(0, 0, 0));
		txtJurusan.setBounds(133, 120, 222, 29);
		contentPane.add(txtJurusan);
		txtJurusan.setColumns(10);
		
		lblIcon = new JLabel("");
		lblIcon.setIcon(new ImageIcon("C:\\Users\\Nayraa-Rahman\\Documents\\NetBeansProjects\\Belajar_Java_Papas\\src\\Watermark TextField\\Watermark TextField\\Gambar\\kereta.png"));
		lblIcon.setBounds(402, 14, 148, 123);
		contentPane.add(lblIcon);
		
		lblIcon_2 = new JLabel("");
		lblIcon_2.setIcon(new ImageIcon("C:\\Users\\Nayraa-Rahman\\Documents\\NetBeansProjects\\Belajar_Java_Papas\\src\\Watermark TextField\\Watermark TextField\\Gambar\\Watermark\\KAI.png"));
		lblIcon_2.setBounds(278, 199, 199, 106);
		contentPane.add(lblIcon_2);
		
		JLabel lblBg = new JLabel("");
		lblBg.setIcon(new ImageIcon("C:\\Users\\Nayraa-Rahman\\Documents\\NetBeansProjects\\Belajar_Java_Papas\\src\\Watermark TextField\\Watermark TextField\\Gambar\\Watermark\\Background.jpg"));
		lblBg.setBounds(0, 0, 582, 317);
		contentPane.add(lblBg);
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
					//com.jtattoo.plaf.bernstein.BernsteinLookAndFeel.setTheme("Large-Font", "Java Swing", "");
		            //UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
					frameTextField frame = new frameTextField();
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
