package layoutMenuItem;

import java.awt.EventQueue;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.UIManager;
//import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class frameMenuLayout extends JFrame {

	private JPanel contentPane;
	private JMenu mnFile;
	private JLabel lblWall;

	/**
	 * Create the frame.
	 */
	public frameMenuLayout()
	{
		setTitle("Layout MenuItem");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 673, 465);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnFile = new JMenu("File");
		mnFile.setIcon(new ImageIcon(frameMenuLayout.class.getResource("/layoutMenuItem/new File.png")));
		mnFile.getPopupMenu().setLayout(new GridLayout(0,3));
		for(int a = 0;a<15;a++)
		{
			mnFile.add(new JMenuItem("File Baru " + (a+1)));
		}
		
		menuBar.add(mnFile);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblWall = new JLabel("");
		lblWall.setIcon(new ImageIcon(frameMenuLayout.class.getResource("/layoutMenuItem/wall.png")));
		lblWall.setBounds(0, 0, 671, 406);
		contentPane.add(lblWall);
		setLocationRelativeTo(null);
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() 
			{
				/* GTK Look and Feel for Linux
				for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) 
				{
				    if ("com.sun.java.swing.plaf.gtk.GTKLookAndFeel".equals(info.getClassName())) 
				    {   
				       try 
				       {
						javax.swing.UIManager.setLookAndFeel(info.getClassName());
						frameMenuLayout frame = new frameMenuLayout();
						frame.setVisible(true);
				       } 
				       catch (ClassNotFoundException e) 
				       {
						// TODO Auto-generated catch block
						e.printStackTrace();
				       } 
				       catch (InstantiationException e) 
				       {
						// TODO Auto-generated catch block
						e.printStackTrace();
				       } 
				       catch (IllegalAccessException e) 
				       {
						// TODO Auto-generated catch block
						e.printStackTrace();
				       } 
				       catch (UnsupportedLookAndFeelException e)
				       {
						// TODO Auto-generated catch block
						e.printStackTrace();
				       }
				       break;
				     } 
				}*/
				try {
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
					frameMenuLayout frame = new frameMenuLayout();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
