package textBottomButton;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;

@SuppressWarnings("serial")
public class frameButton extends JFrame
{

	private JPanel contentPane;
	private JButton btnSimpan;
	private JButton btnUbah;
	private JButton btnHapus;
	private JLabel lblWall;
	private JTextField txtNama;
	private JLabel lblJurusan;
	private JComboBox cbJurusan;
	private JLabel lblJenkel;
	private JRadioButton rdbtnPria;
	private JRadioButton rdbtnWanita;
	private JLabel lblAlamat;
	private JTextArea textAlamat;
	private JLabel lblIcon;

	/**
	 * Create the frame.
	 */
	public frameButton() 
	{
		setTitle("Text Under Image");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 456);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnSimpan = new JButton("Simpan");
		btnSimpan.setIcon(new ImageIcon("C:\\Users\\Nayraa-Rahman\\Documents\\NetBeansProjects\\Belajar_Java_Papas\\src\\textBottomButton\\Simpan.png"));
		btnSimpan.setHorizontalTextPosition(SwingConstants.CENTER);
		btnSimpan.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnSimpan.setBounds(23, 335, 137, 55);
		contentPane.add(btnSimpan);
		
		btnUbah = new JButton("Ubah");
		btnUbah.setIcon(new ImageIcon("C:\\Users\\Nayraa-Rahman\\Documents\\NetBeansProjects\\Belajar_Java_Papas\\src\\textBottomButton\\Ubah.png"));
		btnUbah.setHorizontalTextPosition(SwingConstants.CENTER);
		btnUbah.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnUbah.setBounds(225, 336, 144, 55);
		contentPane.add(btnUbah);
		
		btnHapus = new JButton("Hapus");
		btnHapus.setIcon(new ImageIcon("C:\\Users\\Nayraa-Rahman\\Documents\\NetBeansProjects\\Belajar_Java_Papas\\src\\textBottomButton\\Hapus.png"));
		btnHapus.setHorizontalTextPosition(SwingConstants.CENTER);
		btnHapus.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnHapus.setBounds(441, 335, 126, 55);
		contentPane.add(btnHapus);
		
		JLabel lblNama = new JLabel("Nama : ");
		lblNama.setFont(new Font("DejaVu Sans", Font.BOLD, 12));
		lblNama.setForeground(new Color(255, 255, 255));
		lblNama.setBounds(23, 20, 78, 15);
		contentPane.add(lblNama);
		
		txtNama = new JTextField();
		txtNama.setBounds(101, 16, 221, 27);
		contentPane.add(txtNama);
		txtNama.setColumns(10);
		
		lblJurusan = new JLabel("Jurusan : ");
		lblJurusan.setFont(new Font("DejaVu Sans", Font.BOLD, 12));
		lblJurusan.setForeground(new Color(255, 255, 255));
		lblJurusan.setBounds(23, 80, 78, 15);
		contentPane.add(lblJurusan);
		
		cbJurusan = new JComboBox();
		cbJurusan.setModel(new DefaultComboBoxModel(new String[] {"TI", "SI", "Ekonomi"}));
		cbJurusan.setBounds(101, 73, 245, 33);
		contentPane.add(cbJurusan);
		
		lblJenkel = new JLabel("JenKel : ");
		lblJenkel.setFont(new Font("DejaVu Sans", Font.BOLD, 12));
		lblJenkel.setForeground(new Color(255, 255, 255));
		lblJenkel.setBounds(23, 137, 60, 15);
		contentPane.add(lblJenkel);
		
		rdbtnPria = new JRadioButton("Pria");
		rdbtnPria.setBounds(101, 137, 116, 18);
		contentPane.add(rdbtnPria);
		
		rdbtnWanita = new JRadioButton("Wanita");
		rdbtnWanita.setBounds(239, 137, 130, 18);
		contentPane.add(rdbtnWanita);
		
		lblAlamat = new JLabel("Alamat : ");
		lblAlamat.setFont(new Font("DejaVu Sans", Font.BOLD, 12));
		lblAlamat.setForeground(new Color(255, 255, 255));
		lblAlamat.setBounds(23, 191, 78, 15);
		contentPane.add(lblAlamat);
		
		textAlamat = new JTextArea();
		textAlamat.setBounds(101, 187, 258, 116);
		contentPane.add(textAlamat);
		
		lblIcon = new JLabel("");
		lblIcon.setIcon(new ImageIcon("/home/resa/Aplikasi Java/SwingComponents/src/textBottomButton/buku.png"));
		lblIcon.setBounds(405, 91, 149, 142);
		contentPane.add(lblIcon);
		
		lblWall = new JLabel("");
		lblWall.setIcon(new ImageIcon("/home/resa/Aplikasi Java/SwingComponents/src/textBottomButton/AirWallpaper.png"));
		lblWall.setBounds(0, -13, 599, 440);
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
					frameButton frame = new frameButton();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
