package checkPassword;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.event.CaretListener;
import javax.swing.event.CaretEvent;
import javax.swing.JProgressBar;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

@SuppressWarnings("serial")
public class frameCheckPassword extends JFrame 
{

	private JPanel contentPane;
	private JPasswordField pf1;
	private JPanel panel;
	private JLabel lblPassword;
	private JLabel lblKeterangan;
	String password1 = "";
	String password2 = "";
	private JPasswordField pf2;
	private JProgressBar progress;
	private JLabel lblWall;
	private JLabel lblLogin;
	/**
	 * Create the frame.
	 */
	public frameCheckPassword()
	{
		setTitle("Check Password");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 614, 368);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new ClPanelTransparant();
		panel.setBounds(89, 146, 435, 116);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblPassword = new JLabel("Password : ");
		lblPassword.setForeground(new Color(255, 255, 255));
		lblPassword.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblPassword.setBounds(12, 18, 115, 15);
		panel.add(lblPassword);
		
		pf1 = new JPasswordField();
		pf1.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent c)
			{
				password1 = new String(pf1.getPassword());
				progress.setValue(password1.length());
				
				if(!password1.isEmpty())
				{
					if(password1.equals(password2))
					{
						progress.setString("Cocok");
						progress.setStringPainted(true);
					}
					else 
					{
						progress.setString("Tidak Cocok");
					}
				}
			}
		});
		pf1.setBounds(149, 12, 169, 27);
		panel.add(pf1);
		
		JLabel lblRePassword = new JLabel("Re - Password : ");
		lblRePassword.setForeground(new Color(255, 255, 255));
		lblRePassword.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblRePassword.setBounds(12, 47, 100, 15);
		panel.add(lblRePassword);
		
		lblKeterangan = new JLabel("Keterangan : ");
		lblKeterangan.setForeground(new Color(255, 255, 255));
		lblKeterangan.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblKeterangan.setBounds(12, 87, 115, 15);
		panel.add(lblKeterangan);
		
		pf2 = new JPasswordField();
		pf2.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent c) 
			{
				password2 = new String(pf2.getPassword());
				progress.setValue(password2.length());
				
				if(!password2.isEmpty())
				{
					if(password2.equals(password1))
					{
						progress.setString("Cocok");
						progress.setStringPainted(true);
					}
					else 
					{
						progress.setString("Tidak Cocok");
					}
				}
			}
		});
		pf2.setBounds(149, 41, 169, 27);
		panel.add(pf2);
		
		progress = new JProgressBar();
		progress.setMaximum(15);
		progress.setBounds(149, 75, 169, 27);
		panel.add(progress);
		
		lblLogin = new JLabel("");
		lblLogin.setIcon(new ImageIcon("C:/Users/Aegis/Documents/NetBeansProjects/Belajar_Java_Papas/src/checkPassword/login.png"));
		lblLogin.setBounds(228, 6, 129, 141);
		contentPane.add(lblLogin);
		
		lblWall = new JLabel("");
		lblWall.setIcon(new ImageIcon("C:/Users/Aegis/Documents/NetBeansProjects/Belajar_Java_Papas/src/checkPassword/wall.jpg"));
		lblWall.setBounds(0, -11, 612, 361);
		contentPane.add(lblWall);
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
					frameCheckPassword frame = new frameCheckPassword();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
