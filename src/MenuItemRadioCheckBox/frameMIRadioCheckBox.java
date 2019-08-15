package MenuItemRadioCheckBox;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class frameMIRadioCheckBox extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JLabel lblWall;
	private JPanel panel;
	private JLabel lblWaktu;
	private JButton btnPelanggan;
	private JButton btnBarang;
	private JButton btnPesan;
	private JButton btnLaporan;
	private JMenu mnMaster;
	private JMenuItem mntmPelanggan;
	private JCheckBox chckbxCetakLaporan;
	private JRadioButton rdbtnLaporanHariIni;
	private JRadioButton rdbtnLaporanBulanan;
	/**
	 * Create the frame.
	 */
	public frameMIRadioCheckBox()
	{
		setTitle("MenuItem RadioButton dan CheckBox");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 772, 547);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnMaster = new JMenu("Master");
		mnMaster.setIcon(new ImageIcon(frameMIRadioCheckBox.class.getResource("/MenuItemRadioCheckBox/master.png")));
		menuBar.add(mnMaster);
		
		mntmPelanggan = new JMenuItem("Pelanggan");
		mntmPelanggan.setIcon(new ImageIcon(frameMIRadioCheckBox.class.getResource("/MenuItemRadioCheckBox/miPelanggan.png")));
		mnMaster.add(mntmPelanggan);
		
		JMenuItem mntmBarang = new JMenuItem("Barang");
		mntmBarang.setIcon(new ImageIcon(frameMIRadioCheckBox.class.getResource("/MenuItemRadioCheckBox/miBarang.png")));
		mnMaster.add(mntmBarang);
		
		chckbxCetakLaporan = new JCheckBox("Cetak Laporan");
		mnMaster.add(chckbxCetakLaporan);
		
		rdbtnLaporanHariIni = new JRadioButton("Laporan Hari Ini");
		mnMaster.add(rdbtnLaporanHariIni);
		
		rdbtnLaporanBulanan = new JRadioButton("Laporan Bulanan");
		mnMaster.add(rdbtnLaporanBulanan);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new ClPanelTransparan();
		panel.setBounds(140, 119, 465, 287);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblWaktu = new JLabel("");
		lblWaktu.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblWaktu.setHorizontalAlignment(SwingConstants.CENTER);
		lblWaktu.setBounds(72, 103, 327, 60);
		ActionListener listener = new ActionListener()

		 {

		           @Override
		            public void actionPerformed(ActionEvent act)

		           {
		              // TODO Auto-generated method stub

		                String sJam = " ";
		                String sMenit = " ";
		                String sDetik = " ";

		               Date today = new Date();
		               @SuppressWarnings("deprecation")
					int now_Jam = today.getHours(); //Mengambil jam saat ini
		               @SuppressWarnings("deprecation")
					int now_Menit = today.getMinutes(); // Mengambil menit saat ini
		               @SuppressWarnings("deprecation")
					int now_Detik = today.getSeconds(); //Mengambil detik saat ini

		                if(now_Jam <= 9)
		               {
		                   sJam = "0"; //Menambah angka 0 di depan Jam
		               }
		               if(now_Menit <= 9)
		                {
		                   sMenit = "0";  //Menambah angka 0 di depan Menit
		               }
		              if(now_Detik <= 9)
		                {
		                   sDetik = " 0"; //Menambah angka 0 di depan Detik
		                }

		               String Jam = sJam + Integer.toString(now_Jam);  //Merubah type data int now_Jam menjadi String 
		               String Menit = sMenit + Integer.toString(now_Menit); //Merubah type data int now_Menit menjadi String
		               String Detik = sDetik + Integer.toString(now_Detik); //Merubah type data int now_Detik menjadi String

		               lblWaktu.setText(Jam + ":" + Menit + ":" + Detik );

		            }
		 };

		       Timer waktu = new Timer(1000,listener);
		       waktu.start();
		panel.add(lblWaktu);
		
		btnPelanggan = new ClButtonTransparan("");
		btnPelanggan.setIcon(new ImageIcon(frameMIRadioCheckBox.class.getResource("/MenuItemRadioCheckBox/pelanggan.png")));
		btnPelanggan.setBounds(67, 12, 132, 74);
		panel.add(btnPelanggan);
		
		btnBarang = new ClButtonTransparan("");
		btnBarang.setIcon(new ImageIcon(frameMIRadioCheckBox.class.getResource("/MenuItemRadioCheckBox/barang.png")));
		btnBarang.setBounds(253, 12, 146, 74);
		panel.add(btnBarang);
		
		btnPesan = new ClButtonTransparan("");
		btnPesan.setIcon(new ImageIcon(frameMIRadioCheckBox.class.getResource("/MenuItemRadioCheckBox/pesan.png")));
		btnPesan.setBounds(72, 211, 138, 64);
		panel.add(btnPesan);
		
		btnLaporan = new ClButtonTransparan("");
		btnLaporan.setIcon(new ImageIcon(frameMIRadioCheckBox.class.getResource("/MenuItemRadioCheckBox/laporan.png")));
		btnLaporan.setBounds(253, 211, 146, 64);
		panel.add(btnLaporan);
		
		lblWall = new JLabel("");
		lblWall.setIcon(new ImageIcon(frameMIRadioCheckBox.class.getResource("/MenuItemRadioCheckBox/wall.png")));
		lblWall.setBounds(0, -11, 770, 541);
		contentPane.add(lblWall);
		setLocationRelativeTo(null);
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				/*
				//GTK Linux Look and Feel
				for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) 
				{
				    if ("com.sun.java.swing.plaf.gtk.GTKLookAndFeel".equals(info.getClassName())) 
				    {   
				       try 
				       {
						javax.swing.UIManager.setLookAndFeel(info.getClassName());
						frameMIRadioCheckBox frame = new frameMIRadioCheckBox();
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
					frameMIRadioCheckBox frame = new frameMIRadioCheckBox();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
