package WebLaF;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import com.alee.laf.WebLookAndFeel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.*;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class frameWebLaF extends JFrame {

	private JPanel contentPane;
	@SuppressWarnings("rawtypes")
	private JComboBox cbDate;
	private JCheckBox chckbxGnome;
	private JCheckBox chckbxUnity;
	private JCheckBox chckbxLxde;
	private JCheckBox chckbxPantheon;
	private JLabel lblDE;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenuItem mntmCetak;
	private JMenuItem mntmBookmark;
	private JMenuItem mntmKeluar;
	private JScrollBar scrollBar;
	private JScrollPane scrollPane;
	private JTable table;
	private DefaultTableModel tabelModel;
	String header[] = { "Peringkat", "Distro Linux", "Pengguna" };
	String isi[][] = { { "1", "Linux Mint", "3700" },
			{ "2", "Ubuntu", "2500" }, { "3", "Debian", "2300" },
			{ "4", "Elementary", "1800" }, { "5", "Zorin", "1700" },
			{ "6", "Ultimate", "1500" }, { "7", "Vector", "1250" },
			{ "8", "Arch", "1100" }, { "9", "OpenSuse", "1050" },
			{ "10", "Fedora", "1025" }, { "11", "Lubuntu", "950" },
			{ "12", "CentOS", "900" } };
	private JLabel lblQuestion;
	private JRadioButton rdbtnYa;
	private JRadioButton rdbtnTidak;
	private JPanel panel;
	private JLabel lblDistroLinux;
	private JLabel lblLainnya;
	private JTextField textField;
	private JTextArea textArea;
	private JLabel lblIcon;
	private JLabel lblWall;
	private JLabel label;

	/**
	 * Create the frame.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public frameWebLaF() {
		setTitle("Web LaF");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 874, 560);

		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		mnFile = new JMenu("File");
		mnFile.setIcon(new ImageIcon(frameWebLaF.class
				.getResource("/WebLaF/folder.png")));
		menuBar.add(mnFile);

		mntmCetak = new JMenuItem("Cetak");
		mntmCetak.setIcon(new ImageIcon(frameWebLaF.class
				.getResource("/WebLaF/folder-download.png")));
		mnFile.add(mntmCetak);

		JSeparator separator = new JSeparator();
		mnFile.add(separator);

		mntmBookmark = new JMenuItem("Bookmark");
		mntmBookmark.setIcon(new ImageIcon(frameWebLaF.class
				.getResource("/WebLaF/user-bookmarks.png")));
		mnFile.add(mntmBookmark);

		JSeparator separator_1 = new JSeparator();
		mnFile.add(separator_1);

		mntmKeluar = new JMenuItem("Keluar");
		mntmKeluar.setIcon(new ImageIcon(frameWebLaF.class
				.getResource("/WebLaF/user-home.png")));
		mnFile.add(mntmKeluar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		cbDate = new JComboBox();
		cbDate.setModel(new DefaultComboBoxModel(new String[] { "== Pilih ==",
				"Minggu", "Bulan ", "Tahun" }));
		cbDate.setBounds(474, 12, 166, 24);
		contentPane.add(cbDate);

		chckbxGnome = new JCheckBox("Gnome");
		chckbxGnome.setForeground(new Color(255, 255, 255));
		chckbxGnome.setBounds(8, 124, 129, 23);
		contentPane.add(chckbxGnome);

		chckbxUnity = new JCheckBox("Unity");
		chckbxUnity.setForeground(new Color(255, 255, 255));
		chckbxUnity.setBounds(8, 156, 129, 23);
		contentPane.add(chckbxUnity);

		chckbxLxde = new JCheckBox("LXDE");
		chckbxLxde.setForeground(new Color(255, 255, 255));
		chckbxLxde.setBounds(8, 190, 129, 23);
		contentPane.add(chckbxLxde);

		chckbxPantheon = new JCheckBox("Pantheon");
		chckbxPantheon.setForeground(new Color(255, 255, 255));
		chckbxPantheon.setBounds(8, 217, 129, 23);
		contentPane.add(chckbxPantheon);

		lblDE = new JLabel("DE yang digunakan : ");
		lblDE.setForeground(new Color(255, 255, 255));
		lblDE.setBounds(12, 104, 157, 15);
		contentPane.add(lblDE);

		scrollBar = new JScrollBar();
		scrollBar.setBounds(855, 0, 17, 516);
		contentPane.add(scrollBar);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(474, 40, 369, 220);
		contentPane.add(scrollPane);

		tabelModel = new DefaultTableModel(isi, header);
		table = new ModifyTable(tabelModel);
		scrollPane.setViewportView(table);

		lblQuestion = new JLabel("Menggunakan Distro Linux : ");
		lblQuestion.setForeground(new Color(255, 255, 255));
		lblQuestion.setBounds(12, 12, 207, 15);
		contentPane.add(lblQuestion);

		rdbtnYa = new JRadioButton("Ya");
		rdbtnYa.setForeground(new Color(255, 255, 255));
		rdbtnYa.setBounds(8, 35, 149, 23);
		contentPane.add(rdbtnYa);

		rdbtnTidak = new JRadioButton("Tidak");
		rdbtnTidak.setForeground(new Color(255, 255, 255));
		rdbtnTidak.setBounds(8, 72, 149, 23);
		contentPane.add(rdbtnTidak);

		panel = new ClPanelTransparan();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.setBounds(36, 342, 786, 152);
		contentPane.add(panel);
		panel.setLayout(null);

		textArea = new JTextArea();
		textArea.setForeground(new Color(255, 255, 255));
		textArea.setText("Elementary OS adalah distro linux turunan Ubuntu. Elementary menggunakan DE Pantheon sebagai defaultnya. Rilis terakhir Elementary OS adalah versi 2 dengan code name Luna. Elementary OS adalah salah satu distro linux yang mempunyai tampilan mirip Mac OS.");
		textArea.setLineWrap(true);
		textArea.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		textArea.setBackground(new Color(0, 0, 0, 0));
		textArea.setBounds(194, 52, 580, 88);
		panel.add(textArea);

		lblIcon = new JLabel("Elementay OS");
		lblIcon.setForeground(new Color(255, 255, 255));
		lblIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblIcon.setHorizontalTextPosition(SwingConstants.CENTER);
		lblIcon.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblIcon.setIcon(new ImageIcon(frameWebLaF.class
				.getResource("/WebLaF/distributor-logo-elementary.png")));
		lblIcon.setBounds(31, 31, 176, 121);
		panel.add(lblIcon);

		lblDistroLinux = new JLabel("Distro Linux : ");
		lblDistroLinux.setForeground(new Color(255, 255, 255));
		lblDistroLinux.setBounds(36, 315, 114, 15);
		contentPane.add(lblDistroLinux);

		lblLainnya = new JLabel("Lainnya :");
		lblLainnya.setForeground(new Color(255, 255, 255));
		lblLainnya.setBounds(12, 245, 70, 15);
		contentPane.add(lblLainnya);

		textField = new JTextField();
		textField.setBounds(92, 241, 254, 24);
		contentPane.add(textField);
		textField.setColumns(10);

		label = new JLabel("");
		label.setIcon(new ImageIcon(frameWebLaF.class
				.getResource("/WebLaF/android.png")));
		label.setBounds(94, 124, 54, 60);
		contentPane.add(label);

		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(frameWebLaF.class
				.getResource("/WebLaF/distributor-logo-archlinux.png")));
		label_1.setBounds(160, 124, 54, 60);
		contentPane.add(label_1);

		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(frameWebLaF.class
				.getResource("/WebLaF/distributor-logo-debian.png")));
		label_2.setBounds(226, 124, 54, 60);
		contentPane.add(label_2);

		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(frameWebLaF.class
				.getResource("/WebLaF/distributor-logo-elementary2.png")));
		label_3.setBounds(292, 124, 54, 60);
		contentPane.add(label_3);

		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(frameWebLaF.class
				.getResource("/WebLaF/distributor-logo-opensuse.png")));
		label_4.setBounds(224, 185, 54, 60);
		contentPane.add(label_4);

		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon(frameWebLaF.class
				.getResource("/WebLaF/distributor-logo-linux-mint.png")));
		label_5.setBounds(158, 185, 54, 60);
		contentPane.add(label_5);

		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon(frameWebLaF.class
				.getResource("/WebLaF/distributor-logo-fedora.png")));
		label_6.setBounds(92, 185, 54, 60);
		contentPane.add(label_6);

		JLabel label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon(frameWebLaF.class
				.getResource("/WebLaF/distributor-logo-ubuntu.png")));
		label_7.setBounds(290, 185, 54, 60);
		contentPane.add(label_7);

		lblWall = new JLabel("");
		lblWall.setIcon(new ImageIcon(frameWebLaF.class
				.getResource("/WebLaF/wall.jpg")));
		lblWall.setBounds(0, 0, 860, 506);
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
                                    WebLookAndFeel.install();
					//UIManager.setLookAndFeel(WebLookAndFeel.class
							//.getCanonicalName());
					frameWebLaF frame = new frameWebLaF();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
