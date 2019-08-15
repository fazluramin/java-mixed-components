package modalJFrame;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class frameModal extends JFrame 
{

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnMaster;
	private JMenuItem mntmPengirim;
	private JMenuItem mntmTujuan;
	private JLabel lblWall;

	/**
	 * Create the frame.
	 */
	public frameModal()
	{
		super("Modal JDialog");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 779, 581);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnMaster = new JMenu("Master");
		mnMaster.setIcon(new ImageIcon("modalJFrame/master.png"));
		menuBar.add(mnMaster);
		
		mntmPengirim = new JMenuItem("Pengirim");
		mntmPengirim.setIcon(new ImageIcon("modalJFrame/pengirim.png"));
		mntmPengirim.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				dialogPengirim dialP = new dialogPengirim();
				dialP.setVisible(true);
			}
		});
		mnMaster.add(mntmPengirim);
		
		mntmTujuan = new JMenuItem("Tujuan");
		mntmTujuan.setIcon(new ImageIcon("modalJFrame/barang.png"));
		mnMaster.add(mntmTujuan);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblWall = new JLabel("");
		lblWall.setIcon(new ImageIcon("modalJFrame/batik.jpg"));
		lblWall.setBounds(0, 0, 777, 533);
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
					frameModal frame = new frameModal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
