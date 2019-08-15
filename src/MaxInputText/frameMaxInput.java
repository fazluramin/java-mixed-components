package maxInputText;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;

@SuppressWarnings("serial")
public class frameMaxInput extends JFrame 
{

	private JPanel contentPane;
	private JTextField txtNama;
	private JTextField txtAlamat;
	private JTextField txtTelp;
	private JButton btnHapus;
	private JButton btnUbah;
	private JButton btnSimpan;
	private JLabel lblWall;
	
	/**
	 * Create the frame.
	 */
	public frameMaxInput()
	{
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 538, 353);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNama = new JLabel("Nama : ");
		lblNama.setForeground(new Color(255, 255, 255));
		lblNama.setBounds(17, 12, 60, 15);
		contentPane.add(lblNama);
		
		txtNama = new JTextField();
		txtNama.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) 
			{
				String nama = txtNama.getText();
				if(nama.length()>15)
				{
					JOptionPane.showMessageDialog(null, "Karakter yang anda input terlalu panjang","Pesan",JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		txtNama.setBounds(111, 6, 186, 27);
		contentPane.add(txtNama);
		txtNama.setColumns(10);
		
		JLabel lblAlamat = new JLabel("Alamat : ");
		lblAlamat.setForeground(new Color(255, 255, 255));
		lblAlamat.setBounds(17, 51, 60, 15);
		contentPane.add(lblAlamat);
		
		txtAlamat = new JTextField();
		txtAlamat.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyReleased(KeyEvent e)
			{
				String alamat = txtAlamat.getText();
				if(alamat.length()>25)
				{
					JOptionPane.showMessageDialog(null, "Karakter yang anda input terlalu panjang","Pesan",JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		txtAlamat.setBounds(111, 45, 345, 27);
		contentPane.add(txtAlamat);
		txtAlamat.setColumns(10);
		
		JLabel lblTelp = new JLabel("Telp : ");
		lblTelp.setForeground(new Color(255, 255, 255));
		lblTelp.setBounds(17, 97, 60, 15);
		contentPane.add(lblTelp);
		
		txtTelp = new JTextField();
		txtTelp.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e)
			{
				String telp = txtTelp.getText();
				if(telp.length()>14)
				{
					JOptionPane.showMessageDialog(null, "Karakter yang anda input terlalu panjang","Pesan",JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		txtTelp.setBounds(111, 91, 255, 27);
		contentPane.add(txtTelp);
		txtTelp.setColumns(10);
		
		btnSimpan = new JButton("Simpan");
		btnSimpan.setIcon(new ImageIcon("/home/resa/resa/Aplikasi Java/SwingComponents/src/Gambar/maxTextField/Simpan.png"));
		btnSimpan.setBounds(111, 217, 124, 41);
		contentPane.add(btnSimpan);
		
		btnUbah = new JButton("Ubah");
		btnUbah.setIcon(new ImageIcon("/home/resa/resa/Aplikasi Java/SwingComponents/src/Gambar/maxTextField/Ubah.png"));
		btnUbah.setBounds(247, 217, 119, 41);
		contentPane.add(btnUbah);
		
		btnHapus = new JButton("Hapus");
		btnHapus.setIcon(new ImageIcon("/home/resa/resa/Aplikasi Java/SwingComponents/src/Gambar/maxTextField/Hapus.png"));
		btnHapus.setBounds(396, 217, 119, 41);
		contentPane.add(btnHapus);
		
		lblWall = new JLabel("");
		lblWall.setIcon(new ImageIcon("/home/resa/resa/Aplikasi Java/SwingComponents/src/Gambar/maxTextField/Gnome3.jpg"));
		lblWall.setBounds(0, -11, 536, 337);
		contentPane.add(lblWall);
		setLocationRelativeTo(null);
	}
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try 
				{
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
					frameMaxInput frame = new frameMaxInput();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
