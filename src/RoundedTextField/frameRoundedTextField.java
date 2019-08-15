package RoundedTextField;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
/**
 *
 * @author Aegis
 */
public class frameRoundedTextField extends JFrame{
        
        private JPanel contentPane;
	private JTextField txt;
	private JPanel panel;
	private JLabel lblApplications;
	private JPanel panel_1;
	private JPanel panel_2;
	private JLabel lblWall;
	private JButton btnDownloads;
	private JLabel lblClose;
	private ClButtonTransparan clbtntrnsprnCapsLockOn;
	private JLabel lblAccessoris;
	private JLabel lblInternet;
	private JLabel lblGraphics;
	private JLabel lblProgramming;
	private JLabel lblOffice;
	private JLabel lblIcon;
	private JLabel lblTextEditor;
	private JLabel lblArchiveManager;
	private JLabel lblSensor;
	private JPanel panel_3;
	private JLabel lblPlank;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;

	/**
	 * Create the frame.
	 */
	public frameRoundedTextField() {
		setTitle("Rounded Border TextField");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 782, 563);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblClose = new JLabel("");
		lblClose.setIcon(new ImageIcon(frameRoundedTextField
                        .class.getResource("/RoundedTextField/package-remove.png")));
		lblClose.setBounds(734, 33, 16, 27);
		contentPane.add(lblClose);

		btnDownloads = new ClButtonTransparan("Download Complete");
		btnDownloads.setHorizontalAlignment(SwingConstants.LEFT);
		btnDownloads.setIcon(new ImageIcon(frameRoundedTextField
                        .class.getResource("/RoundedTextField/midori.png")));
		btnDownloads.setBounds(531, 46, 214, 41);
		contentPane.add(btnDownloads);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(frameRoundedTextField
                        .class.getResource("/RoundedTextField/package-remove.png")));
		label.setBounds(734, 89, 16, 27);
		contentPane.add(label);

		clbtntrnsprnCapsLockOn = new ClButtonTransparan("Download Complete");
		clbtntrnsprnCapsLockOn.setHorizontalAlignment(SwingConstants.LEFT);
		clbtntrnsprnCapsLockOn.setIcon(new ImageIcon(frameRoundedTextField
                        .class.getResource("/RoundedTextField/package-upgrade.png")));
		clbtntrnsprnCapsLockOn.setText("Caps Lock ON");
		clbtntrnsprnCapsLockOn.setBounds(531, 102, 214, 41);
		contentPane.add(clbtntrnsprnCapsLockOn);

		panel = new ClPanelTransparan();
		panel.setBounds(0, 0, 780, 27);
		contentPane.add(panel);
		panel.setLayout(null);

		lblApplications = new JLabel("Applications");
		lblApplications.setForeground(new Color(255, 255, 255));
		lblApplications.setBounds(0, 0, 97, 27);
		panel.add(lblApplications);

		panel_1 = new ClPanelTransparan();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(0, 27, 93, 357);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		lblAccessoris = new JLabel("Accessoris");
		lblAccessoris.setHorizontalAlignment(SwingConstants.LEFT);
		lblAccessoris.setForeground(new Color(255, 255, 255));
		lblAccessoris.setFont(new Font("Dialog", Font.BOLD, 10));
		lblAccessoris.setBounds(0, 12, 93, 15);
		panel_1.add(lblAccessoris);

		lblInternet = new JLabel("Internet");
		lblInternet.setHorizontalAlignment(SwingConstants.LEFT);
		lblInternet.setForeground(Color.WHITE);
		lblInternet.setFont(new Font("Dialog", Font.BOLD, 10));
		lblInternet.setBounds(0, 40, 93, 15);
		panel_1.add(lblInternet);

		lblGraphics = new JLabel("Graphics");
		lblGraphics.setHorizontalAlignment(SwingConstants.LEFT);
		lblGraphics.setForeground(Color.WHITE);
		lblGraphics.setFont(new Font("Dialog", Font.BOLD, 10));
		lblGraphics.setBounds(0, 67, 93, 15);
		panel_1.add(lblGraphics);

		lblProgramming = new JLabel("Programming");
		lblProgramming.setHorizontalAlignment(SwingConstants.LEFT);
		lblProgramming.setForeground(Color.WHITE);
		lblProgramming.setFont(new Font("Dialog", Font.BOLD, 10));
		lblProgramming.setBounds(0, 96, 93, 15);
		panel_1.add(lblProgramming);

		lblOffice = new JLabel("Office");
		lblOffice.setHorizontalAlignment(SwingConstants.LEFT);
		lblOffice.setForeground(Color.WHITE);
		lblOffice.setFont(new Font("Dialog", Font.BOLD, 10));
		lblOffice.setBounds(0, 126, 93, 15);
		panel_1.add(lblOffice);

		panel_2 = new ClPanelTransparan();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(91, 27, 397, 357);
		contentPane.add(panel_2);
		panel_2.setLayout(null);

		txt = new JTextField();
		txt.setFont(new Font("Dialog", Font.ITALIC, 12));
		txt.setText("Search");
		txt.setBounds(145, 12, 240, 27);
		panel_2.add(txt);
		txt.setBorder(new ClRoundedTextField());
		txt.setColumns(10);

		lblIcon = new JLabel("Calculator");
		lblIcon.setHorizontalTextPosition(SwingConstants.CENTER);
		lblIcon.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblIcon.setIcon(new ImageIcon(frameRoundedTextField
                        .class.getResource("/RoundedTextField/accessories-calculator.png")));
		lblIcon.setBounds(12, 51, 138, 131);
		panel_2.add(lblIcon);

		lblTextEditor = new JLabel("Text Editor");
		lblTextEditor.setIcon(new ImageIcon(frameRoundedTextField
                        .class.getResource("/RoundedTextField/accessories-text-editor.png")));
		lblTextEditor.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblTextEditor.setHorizontalTextPosition(SwingConstants.CENTER);
		lblTextEditor.setHorizontalAlignment(SwingConstants.CENTER);
		lblTextEditor.setBounds(189, 51, 138, 131);
		panel_2.add(lblTextEditor);

		lblArchiveManager = new JLabel("Archive Manager");
		lblArchiveManager.setIcon(new ImageIcon(frameRoundedTextField
                        .class.getResource("/RoundedTextField/file-roller.png")));
		lblArchiveManager.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblArchiveManager.setHorizontalTextPosition(SwingConstants.CENTER);
		lblArchiveManager.setHorizontalAlignment(SwingConstants.CENTER);
		lblArchiveManager.setBounds(12, 202, 138, 131);
		panel_2.add(lblArchiveManager);

		lblSensor = new JLabel("Sensor");
		lblSensor.setIcon(new ImageIcon(frameRoundedTextField
                        .class.getResource("/RoundedTextField/psensor.png")));
		lblSensor.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblSensor.setHorizontalTextPosition(SwingConstants.CENTER);
		lblSensor.setHorizontalAlignment(SwingConstants.CENTER);
		lblSensor.setBounds(189, 202, 138, 131);
		panel_2.add(lblSensor);

		lblPlank = new JLabel("");
		lblPlank.setIcon(new ImageIcon(frameRoundedTextField.class
				.getResource("/RoundedTextField/plank.png")));
		lblPlank.setBounds(187, 487, 48, 41);
		contentPane.add(lblPlank);

		label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(frameRoundedTextField.class
				.getResource("/RoundedTextField/system-file-manager.png")));
		label_1.setBounds(245, 487, 48, 41);
		contentPane.add(label_1);

		label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(frameRoundedTextField.class
				.getResource("/RoundedTextField/libreoffice-writer.png")));
		label_2.setBounds(302, 487, 48, 41);
		contentPane.add(label_2);

		label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(frameRoundedTextField.class
				.getResource("/RoundedTextField/libreoffice-impress.png")));
		label_3.setBounds(361, 487, 48, 41);
		contentPane.add(label_3);

		label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(
				frameRoundedTextField.class
						.getResource("/RoundedTextField/distributor-logo-elementary.png")));
		label_4.setBounds(416, 487, 48, 41);
		contentPane.add(label_4);

		label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon(frameRoundedTextField.class
				.getResource("/RoundedTextField/brasero.png")));
		label_5.setBounds(473, 487, 48, 41);
		contentPane.add(label_5);

		label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon(frameRoundedTextField.class
				.getResource("/RoundedTextField/cheese.png")));
		label_6.setBounds(531, 487, 48, 41);
		contentPane.add(label_6);

		panel_3 = new ClPanelTransparan();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_3.setBounds(174, 520, 420, 20);
		contentPane.add(panel_3);
		panel_3.setLayout(null);

		lblWall = new JLabel("");
		lblWall.setIcon(new ImageIcon(frameRoundedTextField.class
				.getResource("/RoundedTextField/wall.png")));
		lblWall.setBounds(0, 0, 780, 540);
		contentPane.add(lblWall);
		setLocationRelativeTo(null);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
            @Override
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager
							.getSystemLookAndFeelClassName());
					frameRoundedTextField frame = new frameRoundedTextField();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
