package colorItemComboBox;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import java.awt.Font;

@SuppressWarnings("serial")
public class frameColorItemComboBox extends JFrame 
{
	private JPanel contentPane;
	private JButton btnSimpan;
	@SuppressWarnings("rawtypes")
	private JComboBox comboBox;
	Color[] warna = {Color.RED, Color.GREEN, Color.BLUE};
    String[] isi = {"Smartphone", "Tablet", "Netbook"};
    private JTextField txtID;
    private JLabel lblMerk;
    private JLabel lblId;
    private JTextField txtMerk;
    private JLabel lblJenis;
    private JButton btnUbah;
    private JButton btnHapus;
    private JPanel panel;
    private JLabel lblWall;
    private JLabel lblIcon;
    
	/**
	 * Create the frame.
	 */
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public frameColorItemComboBox()
	{
		setTitle("Editable ComboBox");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 629, 426);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		btnSimpan = new ClButtonTransparant("Simpan");
		btnSimpan.setIcon(new ImageIcon("C:/Users/Aegis/Documents/NetBeansProjects/Belajar_Java_Papas/src/colorItemComboBox/simpan.png"));
		btnSimpan.setBounds(97, 249, 117, 48);
		contentPane.add(btnSimpan);
		
		btnUbah = new ClButtonTransparant("Ubah");
		btnUbah.setIcon(new ImageIcon("C:/Users/Aegis/Documents/NetBeansProjects/Belajar_Java_Papas/src/colorItemComboBox/ubah.png"));
		btnUbah.setBounds(249, 298, 129, 48);
		contentPane.add(btnUbah);
		
		btnHapus = new ClButtonTransparant("Hapus");
		btnHapus.setIcon(new ImageIcon("C:/Users/Aegis/Documents/NetBeansProjects/Belajar_Java_Papas/src/colorItemComboBox/hapus.png"));
		btnHapus.setBounds(432, 346, 111, 48);
		contentPane.add(btnHapus);
		
		panel = new ClPanelTransparant();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.setBounds(18, 6, 405, 192);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblMerk = new JLabel("Merk : ");
		lblMerk.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblMerk.setForeground(new Color(255, 255, 255));
		lblMerk.setBounds(6, 63, 60, 15);
		panel.add(lblMerk);
		
		txtMerk = new JTextField();
		txtMerk.setBounds(82, 57, 307, 27);
		panel.add(txtMerk);
		txtMerk.setColumns(10);
		
		lblId = new JLabel("ID : ");
		lblId.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblId.setForeground(new Color(255, 255, 255));
		lblId.setBounds(6, 12, 60, 15);
		panel.add(lblId);
		
		txtID = new JTextField();
		txtID.setBounds(82, 6, 122, 27);
		panel.add(txtID);
		txtID.setColumns(10);
		
		lblJenis = new JLabel("Jenis : ");
		lblJenis.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblJenis.setForeground(new Color(255, 255, 255));
		lblJenis.setBounds(6, 136, 60, 15);
		panel.add(lblJenis);
		
		comboBox = new JComboBox(isi);
		comboBox.setBounds(82, 126, 207, 34);
		
        comboRenderer renderer = new comboRenderer(comboBox);

        renderer.setColors(warna);
        renderer.setStrings(isi);

        comboBox.setRenderer(renderer);
		panel.add(comboBox);
		
		lblIcon = new JLabel("");
		lblIcon.setIcon(new ImageIcon("C:/Users/Aegis/Documents/NetBeansProjects/Belajar_Java_Papas/src/colorItemComboBox/icon.png"));
		lblIcon.setBounds(461, 18, 129, 143);
		contentPane.add(lblIcon);
		
		lblWall = new JLabel("");
		lblWall.setIcon(new ImageIcon("C:/Users/Aegis/Documents/NetBeansProjects/Belajar_Java_Papas/src/colorItemComboBox/wall.jpg"));
		lblWall.setBounds(0, -11, 627, 411);
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
					frameColorItemComboBox frame = new frameColorItemComboBox();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
