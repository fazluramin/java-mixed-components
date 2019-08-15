package colorMenuItem;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import java.awt.Font;

@SuppressWarnings("serial")
public class frameColorMenuItem extends JFrame 
{

	private JPanel contentPane;
	private JLabel lblWall;
	private JPanel panel;
	private JButton btnPeminjam;
	private roundButton btnBuku;
	private roundButton btnPinjam;
	private roundButton btnKembali;
	private JMenuBar menuBar;
	private JMenu mnMaster;
	private JMenuItem mntmBuku;
	private JMenuItem mntmPeminjam;
	private JMenu mnTranskasi;
	private JMenuItem mntmPengembalian;
	private JMenuItem mntmPeminjaman;
	private JPanel panelDesktop;
	private JLabel lblLock;
	private JLabel lblUnlock;

	/**
	 * Create the frame.
	 */
	public frameColorMenuItem()
	{
		setTitle("Color MenuItem");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 765, 541);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnMaster = new JMenu("Master");
		menuBar.add(mnMaster);
		
		mntmBuku = new JMenuItem("Buku");
		mnMaster.add(mntmBuku);
		mntmBuku.setOpaque(true);
		mntmBuku.setBackground(Color.CYAN);
		
		mntmPeminjam = new JMenuItem("Peminjam");
		mntmPeminjam.setOpaque(true);
		mntmPeminjam.setBackground(Color.CYAN);
		mnMaster.add(mntmPeminjam);
		
		mnTranskasi = new JMenu("Transkasi");
		menuBar.add(mnTranskasi);
		
		mntmPeminjaman = new JMenuItem("Peminjaman");
		mntmPeminjaman.setOpaque(true);
		mntmPeminjaman.setBackground(Color.ORANGE);
		mnTranskasi.add(mntmPeminjaman);
		
		mntmPengembalian = new JMenuItem("Pengembalian");
		mntmPengembalian.setOpaque(true);
		mntmPengembalian.setBackground(Color.ORANGE);
		mnTranskasi.add(mntmPengembalian);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new ClPanelTransparant();
		panel.setBounds(143, 403, 478, 85);
		contentPane.add(panel);
		panel.setLayout(null);
		
		btnPeminjam = new roundButton("");
		btnPeminjam.setIcon(new ImageIcon(frameColorMenuItem.class.getResource("/colorMenuItem/buku.png")));
		btnPeminjam.setBackground(new Color(153, 204, 255));
		btnPeminjam.setBounds(41, 12, 77, 61);
		panel.add(btnPeminjam);
		
		btnBuku = new roundButton("");
		btnBuku.setIcon(new ImageIcon(frameColorMenuItem.class.getResource("/colorMenuItem/peminjam.png")));
		btnBuku.setBackground(new Color(153, 204, 255));
		btnBuku.setBounds(145, 12, 77, 61);
		panel.add(btnBuku);
		
		btnPinjam = new roundButton("");
		btnPinjam.setIcon(new ImageIcon(frameColorMenuItem.class.getResource("/colorMenuItem/peminjaman.png")));
		btnPinjam.setBackground(new Color(153, 204, 255));
		btnPinjam.setBounds(251, 12, 77, 61);
		panel.add(btnPinjam);
		
		btnKembali = new roundButton("");
		btnKembali.setIcon(new ImageIcon(frameColorMenuItem.class.getResource("/colorMenuItem/pengembalian.png")));
		btnKembali.setBackground(new Color(153, 204, 255));
		btnKembali.setBounds(359, 12, 77, 61);
		panel.add(btnKembali);
		
		panelDesktop = new ClPanelTransparant();
		panelDesktop.setBounds(143, 114, 468, 171);
		contentPane.add(panelDesktop);
		panelDesktop.setLayout(null);
		
		lblLock = new JLabel("Lock");
		lblLock.setForeground(new Color(255, 255, 255));
		lblLock.setFont(new Font("Dialog", Font.BOLD, 14));
		lblLock.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblLock.setHorizontalTextPosition(SwingConstants.CENTER);
		lblLock.setHorizontalAlignment(SwingConstants.CENTER);
		lblLock.setIcon(new ImageIcon(frameColorMenuItem.class.getResource("/colorMenuItem/lock.png")));
		lblLock.setBounds(65, 22, 89, 111);
		panelDesktop.add(lblLock);
		
		lblUnlock = new JLabel("Unlock");
		lblUnlock.setForeground(new Color(255, 255, 255));
		lblUnlock.setFont(new Font("Dialog", Font.BOLD, 14));
		lblUnlock.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblUnlock.setHorizontalTextPosition(SwingConstants.CENTER);
		lblUnlock.setHorizontalAlignment(SwingConstants.CENTER);
		lblUnlock.setIcon(new ImageIcon(frameColorMenuItem.class.getResource("/colorMenuItem/unlock.png")));
		lblUnlock.setBounds(353, 22, 82, 111);
		panelDesktop.add(lblUnlock);
		
		JLabel lblPanah = new JLabel("");
		lblPanah.setIcon(new ImageIcon(frameColorMenuItem.class.getResource("/colorMenuItem/panah.png")));
		lblPanah.setBounds(219, 52, 82, 81);
		panelDesktop.add(lblPanah);
		
		lblWall = new JLabel("");
		lblWall.setIcon(new ImageIcon(frameColorMenuItem.class.getResource("/colorMenuItem/wall.png")));
		lblWall.setBounds(0, -11, 763, 520);
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
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					frameColorMenuItem frame = new frameColorMenuItem();
					frame.setVisible(true);
                } catch (ClassNotFoundException ex) {
                } catch (InstantiationException ex) {
                } catch (IllegalAccessException ex) {
                } catch (UnsupportedLookAndFeelException ex) {
                }
			}
		});
	}
}
