package buttonOptionPane;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class frameButtonOptionPane extends JFrame
{

	private JPanel contentPane;
	private JLabel lblWall;
	private JLabel lblBuku1;
	private JLabel lblBuku2;
	private JLabel lblBuku4;
	private JLabel lblBuku5;

	/**
	 * Create the frame.
	 */
	public frameButtonOptionPane()
	{
		setTitle("Button JOptionPane");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 737, 542);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblBuku1 = new JLabel("");
		lblBuku1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent me) {
				JOptionPane.showOptionDialog(null, 
				        "Apakah anda ingin meminjam buku ini ? ", 
				        "Pesan", 
				        JOptionPane.OK_CANCEL_OPTION, 
				        JOptionPane.INFORMATION_MESSAGE, 
				        null, 
				        new String[]{"Cari buku lain", "Pinjam"}, 
				        "default");
			}
		});
		lblBuku1.setIcon(new ImageIcon(frameButtonOptionPane.class.getResource("/buttonOptionPane/buku1.png")));
		lblBuku1.setBounds(83, 29, 105, 88);
		contentPane.add(lblBuku1);
		
		lblBuku2 = new JLabel("");
		lblBuku2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent me) {
				JOptionPane.showOptionDialog(null, 
				        "Apakah anda ingin meminjam buku ini ? ", 
				        "Pesan", 
				        JOptionPane.OK_CANCEL_OPTION, 
				        JOptionPane.INFORMATION_MESSAGE, 
				        null, 
				        new String[]{"Cari buku lain", "Pinjam"}, 
				        "default");
			}
		});
		lblBuku2.setIcon(new ImageIcon(frameButtonOptionPane.class.getResource("/buttonOptionPane/buku2.png")));
		lblBuku2.setBounds(459, 29, 105, 88);
		contentPane.add(lblBuku2);
		
		JLabel lblBuku3 = new JLabel("");
		lblBuku3.setIcon(new ImageIcon(frameButtonOptionPane.class.getResource("/buttonOptionPane/buku3.png")));
		lblBuku3.setBounds(368, 126, 119, 88);
		contentPane.add(lblBuku3);
		
		lblBuku4 = new JLabel("");
		lblBuku4.setIcon(new ImageIcon(frameButtonOptionPane.class.getResource("/buttonOptionPane/buku4.png")));
		lblBuku4.setBounds(75, 221, 105, 88);
		contentPane.add(lblBuku4);
		
		lblBuku5 = new JLabel("");
		lblBuku5.setIcon(new ImageIcon(frameButtonOptionPane.class.getResource("/buttonOptionPane/buku5.png")));
		lblBuku5.setBounds(558, 323, 105, 88);
		contentPane.add(lblBuku5);
		
		lblWall = new JLabel("");
		lblWall.setIcon(new ImageIcon(frameButtonOptionPane.class.getResource("/buttonOptionPane/rakBuku.png")));
		lblWall.setBounds(0, 0, 735, 519);
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
					frameButtonOptionPane frame = new frameButtonOptionPane();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
