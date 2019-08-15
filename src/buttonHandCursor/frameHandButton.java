package buttonHandCursor;

import java.awt.Cursor;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import java.awt.Color;

@SuppressWarnings("serial")
public class frameHandButton extends JFrame
{

	private JPanel contentPane;
	private JTextField txtNama;
	private JTextField txtAlamat;
	private JTextField txtJabatan;
	private JButton btnSimpan;
	private JButton btnUbah;
	private JButton btnHapus;
	private JLabel lblWall;
	private JLabel lblIcon;

	/**
	 * Create the frame.
	 */
	public frameHandButton() 
	{
		super("HandCursor JButton");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 620, 328);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNamaPegawai = new JLabel("Nama Pegawai : ");
		lblNamaPegawai.setForeground(new Color(255, 255, 255));
		lblNamaPegawai.setBounds(19, 11, 121, 17);
		contentPane.add(lblNamaPegawai);
		
		txtNama = new JTextField();
		txtNama.setBounds(129, 6, 175, 27);
		contentPane.add(txtNama);
		txtNama.setColumns(10);
		
		JLabel lblAlamat = new JLabel("Alamat : ");
		lblAlamat.setForeground(new Color(255, 255, 255));
		lblAlamat.setBounds(19, 52, 60, 15);
		contentPane.add(lblAlamat);
		
		txtAlamat = new JTextField();
		txtAlamat.setBounds(129, 46, 273, 27);
		contentPane.add(txtAlamat);
		txtAlamat.setColumns(10);
		
		JLabel lblJabatan = new JLabel("Jabatan : ");
		lblJabatan.setForeground(new Color(255, 255, 255));
		lblJabatan.setBounds(19, 96, 60, 15);
		contentPane.add(lblJabatan);
		
		txtJabatan = new JTextField();
		txtJabatan.setBounds(129, 90, 202, 27);
		contentPane.add(txtJabatan);
		txtJabatan.setColumns(10);
		
		btnSimpan = new JButton("Simpan");
		btnSimpan.setIcon(new ImageIcon("C:/Users/Aegis/Documents/NetBeansProjects/Belajar_Java_Papas/src/buttonHandCursor/Simpan.png"));
		btnSimpan.setBounds(129, 214, 124, 57);
		contentPane.add(btnSimpan);
		btnSimpan.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		btnUbah = new JButton("Ubah");
		btnUbah.setIcon(new ImageIcon("C:/Users/Aegis/Documents/NetBeansProjects/Belajar_Java_Papas/src/buttonHandCursor/Ubah.png"));
		btnUbah.setBounds(265, 214, 111, 57);
		contentPane.add(btnUbah);
		btnUbah.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		btnHapus = new JButton("Hapus");
		btnHapus.setIcon(new ImageIcon("C:/Users/Aegis/Documents/NetBeansProjects/Belajar_Java_Papas/src/buttonHandCursor/Hapus.png"));
		btnHapus.setBounds(388, 214, 111, 57);
		contentPane.add(btnHapus);
		btnHapus.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		lblIcon = new JLabel("");
		lblIcon.setIcon(new ImageIcon("C:/Users/Aegis/Documents/NetBeansProjects/Belajar_Java_Papas/src/buttonHandCursor/g1.png"));
		lblIcon.setBounds(408, 24, 169, 143);
		contentPane.add(lblIcon);
		
		lblWall = new JLabel("");
		lblWall.setIcon(new ImageIcon("C:/Users/Aegis/Documents/NetBeansProjects/Belajar_Java_Papas/src/buttonHandCursor/putihBlur.png"));
		lblWall.setBounds(0, 0, 618, 305);
		contentPane.add(lblWall);
		
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
					frameHandButton frame = new frameHandButton();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
