package balloonTooltip;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import net.java.balloontip.BalloonTip;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class frameBalloonTooltip extends JFrame
{

	private JPanel contentPane;
	private JButton btnInstall;
	private JButton btnRemove;
	private JLabel lblSoftware;
	private JTextArea txtrOpenOfficeAdalah;
	private JLabel lblRating;
	private JLabel label;
	private JLabel lblGood;
	private JLabel lblWall;
	
	/**
	 * Create the frame.
	 */
	public frameBalloonTooltip()
	{
		setTitle("Java Software Center");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 598, 415);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnInstall = new JButton("Install");
		btnInstall.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent me)
			{
				@SuppressWarnings("unused")
				BalloonTip btInstall = new BalloonTip(btnInstall, "Klik untuk menginstall aplikasi");
			}
		});
		btnInstall.setIcon(new ImageIcon(frameBalloonTooltip.class.getResource("/balloonTooltip/install.png")));
		btnInstall.setBounds(345, 63, 105, 44);
		contentPane.add(btnInstall);
		
		btnRemove = new JButton("Remove");
		btnRemove.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent me) 
			{
				@SuppressWarnings("unused")
				BalloonTip btHapus = new BalloonTip(btnRemove, "Klik untuk menghapus aplikasi");
			}
		});

		btnRemove.setIcon(new ImageIcon(frameBalloonTooltip.class.getResource("/balloonTooltip/hapus.png")));
		btnRemove.setBounds(479, 63, 103, 44);
		contentPane.add(btnRemove);
		
		lblSoftware = new JLabel("");
		lblSoftware.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblSoftware.setIcon(new ImageIcon(frameBalloonTooltip.class.getResource("/balloonTooltip/openOffice.png")));
		lblSoftware.setBounds(12, 12, 296, 256);
		contentPane.add(lblSoftware);
		
		txtrOpenOfficeAdalah = new JTextArea();
		txtrOpenOfficeAdalah.setText("Open Office adalah aplikasi perkantoran yang didalamnya terdapat Writer, Presentation, Spreadsheet, Draw. ");
		txtrOpenOfficeAdalah.setWrapStyleWord(true);
		txtrOpenOfficeAdalah.setLineWrap(true);
		txtrOpenOfficeAdalah.setBounds(22, 275, 428, 99);
		contentPane.add(txtrOpenOfficeAdalah);
		
		lblRating = new JLabel("Rating");
		lblRating.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblRating.setBounds(502, 270, 60, 15);
		contentPane.add(lblRating);
		
		label = new JLabel("5");
		label.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		label.setBounds(512, 297, 24, 15);
		contentPane.add(label);
		
		lblGood = new JLabel("Good");
		lblGood.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblGood.setBounds(502, 324, 60, 15);
		contentPane.add(lblGood);
		
		lblWall = new JLabel("");
		lblWall.setIcon(new ImageIcon(frameBalloonTooltip.class.getResource("/balloonTooltip/wall.jpg")));
		lblWall.setBounds(0, -11, 596, 403);
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
					frameBalloonTooltip frame = new frameBalloonTooltip();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
