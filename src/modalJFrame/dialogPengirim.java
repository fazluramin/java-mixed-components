package modalJFrame;

import java.awt.BorderLayout;
import java.awt.Dialog;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

@SuppressWarnings("serial")
public class dialogPengirim extends JDialog
{

	private final JPanel contentPanel = new JPanel();
	private JTextField txtNama;
	private JTextArea textAlamat;
	private JLabel lblEmail;
	private JTextField txtEmail;
	private JButton btnSimpan;
	private JButton btnBatal;
	private JLabel lblWall;

	/**
	 * Create the dialog.
	 */
	public dialogPengirim() 
	{
		setTitle("Menu Pengirim");
		setResizable(false);
		setBounds(100, 100, 510, 331);
		setLocationRelativeTo(null);
		setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
		
		JLabel lblNama = new JLabel("Nama : ");
		lblNama.setFont(new Font("DejaVu Sans", Font.BOLD, 12));
		lblNama.setForeground(new Color(153, 255, 153));
		lblNama.setBounds(12, 16, 70, 15);
		contentPanel.add(lblNama);
		
		txtNama = new JTextField();
		txtNama.setBounds(78, 10, 215, 27);
		contentPanel.add(txtNama);
		txtNama.setColumns(10);
		
		JLabel lblAlamat = new JLabel("Alamat : ");
		lblAlamat.setFont(new Font("DejaVu Sans", Font.BOLD, 12));
		lblAlamat.setForeground(new Color(153, 255, 153));
		lblAlamat.setBounds(12, 60, 70, 15);
		contentPanel.add(lblAlamat);
		
		textAlamat = new JTextArea();
		textAlamat.setBounds(78, 54, 220, 93);
		contentPanel.add(textAlamat);
		
		lblEmail = new JLabel(" Email : ");
		lblEmail.setFont(new Font("DejaVu Sans", Font.BOLD, 12));
		lblEmail.setForeground(new Color(153, 255, 153));
		lblEmail.setBounds(12, 170, 60, 15);
		contentPanel.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(78, 159, 278, 27);
		contentPanel.add(txtEmail);
		txtEmail.setColumns(10);
		
		btnSimpan = new JButton("Simpan");
		btnSimpan.setIcon(new ImageIcon("modalJFrame/Simpan.png"));
		btnSimpan.setBounds(78, 232, 127, 40);
		contentPanel.add(btnSimpan);
		
		btnBatal = new JButton("Batal");
		btnBatal.setIcon(new ImageIcon("modalJFrame/batal.png"));
		btnBatal.setBounds(230, 232, 127, 40);
		contentPanel.add(btnBatal);
		
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblWall = new JLabel("");
		lblWall.setIcon(new ImageIcon("modalJFrame/batik2.jpg"));
		lblWall.setBounds(0, 0, 508, 302);
		contentPanel.add(lblWall);
		
	}
}
