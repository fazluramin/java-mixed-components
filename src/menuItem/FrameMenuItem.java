package menuItem;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.UIManager;
import javax.swing.JDesktopPane;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Color;

public class FrameMenuItem extends JFrame
{

	/**
	 * Create the frame.
	 */
	public FrameMenuItem() 
	{
		super("Java Swing");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 755, 555);
		setLocationRelativeTo(null);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnApplication = new JMenu("Application");
		mnApplication.setIcon(new ImageIcon("/menuItem/tux.png"));
		menuBar.add(mnApplication);
		
		JMenu mnAccessoris = new JMenu("Accessoris");
		mnAccessoris.setIcon(new ImageIcon("/menuItem/xpaint.png"));
		mnApplication.add(mnAccessoris);
		
		JMenuItem mntmLeafpad = new JMenuItem("Leafpad");
		mntmLeafpad.setIcon(new ImageIcon("/menuItem/notepad.png"));
		mnAccessoris.add(mntmLeafpad);
		
		JMenuItem mntmTerminal = new JMenuItem("Terminal");
		mntmTerminal.setIcon(new ImageIcon("/menuItem/terminator.png"));
		mnAccessoris.add(mntmTerminal);
		
		JMenuItem mntmCalculator = new JMenuItem("Calculator");
		mntmCalculator.setIcon(new ImageIcon("/menuItem/accessories-calculator-3.png"));
		mnAccessoris.add(mntmCalculator);
		
		JMenu mnOffice = new JMenu("Office");
		mnOffice.setIcon(new ImageIcon("/menuItem/openoffice.png"));
		mnApplication.add(mnOffice);
		
		JMenuItem mntmOpenofficeCalc = new JMenuItem("OpenOffice Calc");
		mntmOpenofficeCalc.setIcon(new ImageIcon("/menuItem/openoffice.org-calc-3.png"));
		mnOffice.add(mntmOpenofficeCalc);
		
		JMenuItem mntmOpenofficeWriter = new JMenuItem("OpenOffice Writer");
		mntmOpenofficeWriter.setIcon(new ImageIcon("/menuItem/openoffice.org-3.png"));
		mnOffice.add(mntmOpenofficeWriter);
		
		JMenuItem mntmOpenoffice = new JMenuItem("OpenOffice Impress");
		mntmOpenoffice.setIcon(new ImageIcon("/menuItem/openoffice.org-impress-3.png"));
		mnOffice.add(mntmOpenoffice);
		getContentPane().setLayout(null);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(0, 0, 753, 501);
		getContentPane().add(desktopPane);
		
		JLabel lblHome = new JLabel("");
		lblHome.setIcon(new ImageIcon("/menuItem/computer-4.png"));
		lblHome.setBounds(35, 24, 78, 80);
		desktopPane.add(lblHome);
		
		JLabel lblHome_1 = new JLabel("Home");
		lblHome_1.setForeground(new Color(255, 255, 255));
		lblHome_1.setBounds(55, 102, 46, 15);
		desktopPane.add(lblHome_1);
		
		JLabel lblBrowser = new JLabel("");
		lblBrowser.setIcon(new ImageIcon("/menuItem/firefox-2.png"));
		lblBrowser.setBounds(41, 155, 78, 89);
		desktopPane.add(lblBrowser);
		
		JLabel lblMozillaFirefox = new JLabel("Mozilla Firefox");
		lblMozillaFirefox.setForeground(new Color(255, 255, 255));
		lblMozillaFirefox.setBounds(35, 242, 98, 15);
		desktopPane.add(lblMozillaFirefox);
		
		JLabel lblOffice = new JLabel("");
		lblOffice.setIcon(new ImageIcon("/menuItem/openoffice.org-writer.png"));
		lblOffice.setBounds(36, 294, 83, 129);
		desktopPane.add(lblOffice);
		
		JLabel lblOpenOffice = new JLabel("Open Office");
		lblOpenOffice.setForeground(new Color(255, 255, 255));
		lblOpenOffice.setBounds(35, 399, 98, 15);
		desktopPane.add(lblOpenOffice);
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
					FrameMenuItem frame = new FrameMenuItem();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
