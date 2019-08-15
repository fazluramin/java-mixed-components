package warnaMenuBar;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class FrameMenuBar extends JFrame {

	private JPanel contentPane;
	private JMenu mnFile;
	private JMenuItem mntmNew;
	private JMenuItem mntmSave;
	private JMenuBar menuBar;
	private JLabel lblGame;

	/**
	 * Create the frame.
	 */
	public FrameMenuBar()
	{
		super("Background Image JMenuBar");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 482, 361);
		
		menuBar = new JMenuBar()
		{
			public void paintComponent(Graphics graph)
			{
				graph.drawImage(Toolkit.getDefaultToolkit().getImage("C:/Users/Aegis/Documents/NetBeansProjects/Belajar_Java_Papas/src/warnaMenuBar/bg.png"),0,0,this);
			}
		};
		setJMenuBar(menuBar);
		
		mnFile = new JMenu("File");
		mnFile.setIcon(new ImageIcon("C:/Users/Aegis/Documents/NetBeansProjects/Belajar_Java_Papas/src/warnaMenuBar/File.png"));
		menuBar.add(mnFile);
		
		mntmNew = new JMenuItem("New");
		mntmNew.setIcon(new ImageIcon("C:/Users/Aegis/Documents/NetBeansProjects/Belajar_Java_Papas/src/warnaMenuBar/New.png"));
		mnFile.add(mntmNew);
		
		mntmSave = new JMenuItem("Save");
		mntmSave.setIcon(new ImageIcon("C:/Users/Aegis/Documents/NetBeansProjects/Belajar_Java_Papas/src/warnaMenuBar/Save.png"));
		mnFile.add(mntmSave);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblGame = new JLabel("");
		lblGame.setIcon(new ImageIcon("C:/Users/Aegis/Documents/NetBeansProjects/Belajar_Java_Papas/src/warnaMenuBar/game.png"));
		lblGame.setBounds(168, 58, 143, 145);
		contentPane.add(lblGame);
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
					FrameMenuBar frame = new FrameMenuBar();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
