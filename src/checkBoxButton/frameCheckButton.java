package checkBoxButton;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class frameCheckButton extends JFrame 
{

	private JPanel contentPane;
	private JButton btnSimpan;
	private JCheckBox checkSimpan;
	private JTextField txtNo;
	private JLabel lblNoKirim;
	private JTextField txtNama;
	private JLabel lblPaket;
	@SuppressWarnings("rawtypes")
	private JComboBox cbPaket;
	private JButton btnUbah;
	private JCheckBox checkUbah;
	private JPanel panelUtama;
	private JLabel lblWall;
	private JLabel lblIcon;

	/**
	 * Create the frame.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public frameCheckButton()
	{
		setTitle("CheckBox Button");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 628, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		checkSimpan = new JCheckBox("");
		checkSimpan.setOpaque(false);
		checkSimpan.setFocusPainted(false);
		checkSimpan.setBounds(161, 85, 115, 18);
		contentPane.add(checkSimpan);
		
		lblNoKirim = new JLabel("No. Kirim : ");
		lblNoKirim.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblNoKirim.setForeground(new Color(255, 255, 255));
		lblNoKirim.setBounds(6, 108, 81, 15);
		contentPane.add(lblNoKirim);
		
		txtNo = new JTextField();
		txtNo.setBounds(99, 102, 247, 27);
		contentPane.add(txtNo);
		txtNo.setColumns(10);
		
		JLabel lblNama = new JLabel("Nama : ");
		lblNama.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblNama.setForeground(new Color(255, 255, 255));
		lblNama.setBounds(6, 150, 60, 15);
		contentPane.add(lblNama);
		
		txtNama = new JTextField();
		txtNama.setBounds(99, 144, 363, 27);
		contentPane.add(txtNama);
		txtNama.setColumns(10);
		
		lblPaket = new JLabel("Paket : ");
		lblPaket.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblPaket.setForeground(new Color(255, 255, 255));
		lblPaket.setBounds(6, 201, 60, 15);
		contentPane.add(lblPaket);
		
		cbPaket = new JComboBox();
		cbPaket.setModel(new DefaultComboBoxModel(new String[] {"== PIlih Paket =="}));
		cbPaket.setBounds(99, 192, 161, 33);
		contentPane.add(cbPaket);
		
		checkUbah = new JCheckBox("");
		checkUbah.setOpaque(false);
		checkUbah.setFocusPainted(false);
		checkUbah.setBounds(358, 85, 115, 18);
		contentPane.add(checkUbah);
		
		panelUtama = new ClPanelTransparant();
		panelUtama.setBounds(43, 0, 496, 54);
		contentPane.add(panelUtama);
		panelUtama.setLayout(null);
		
		btnSimpan = new JButton("Simpan");
		btnSimpan.setFont(new Font("DejaVu Sans", Font.BOLD, 12));
		btnSimpan.setForeground(new Color(102, 153, 255));
		btnSimpan.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnSimpan.setHorizontalTextPosition(SwingConstants.CENTER);
		btnSimpan.setVerticalAlignment(SwingConstants.BOTTOM);
		btnSimpan.setIcon(new ImageIcon("C:/Users/Aegis/Documents/NetBeansProjects/Belajar_Java_Papas/src/checkBoxButton/simpan.png"));
		btnSimpan.setBounds(53, 0, 155, 48);
		panelUtama.add(btnSimpan);
		
		btnUbah = new JButton("Ubah");
		btnUbah.setFont(new Font("DejaVu Sans", Font.BOLD, 12));
		btnUbah.setForeground(new Color(51, 153, 255));
		btnUbah.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnUbah.setHorizontalTextPosition(SwingConstants.CENTER);
		btnUbah.setVerticalAlignment(SwingConstants.BOTTOM);
		btnUbah.setIcon(new ImageIcon("C:/Users/Aegis/Documents/NetBeansProjects/Belajar_Java_Papas/src/checkBoxButton/ubah.png"));
		btnUbah.setBounds(259, 0, 155, 48);
		panelUtama.add(btnUbah);
		
		lblIcon = new JLabel("");
		lblIcon.setIcon(new ImageIcon("C:/Users/Aegis/Documents/NetBeansProjects/Belajar_Java_Papas/src/checkBoxButton/paket_icon.png"));
		lblIcon.setBounds(432, 232, 147, 120);
		contentPane.add(lblIcon);
		
		lblWall = new JLabel("");
		lblWall.setIcon(new ImageIcon("C:/Users/Aegis/Documents/NetBeansProjects/Belajar_Java_Papas/src/checkBoxButton/wall.jpg"));
		lblWall.setBounds(0, 0, 633, 387);
		contentPane.add(lblWall);
		
		btnSimpan.add(checkSimpan);
		btnUbah.add(checkUbah);
		setLocationRelativeTo(null);
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
					frameCheckButton frame = new frameCheckButton();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
