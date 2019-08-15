package AutoCompleteTextField;

import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Koneksi
{
	private static Connection koneksi;
	
	public static Connection getKoneksi()
	{
		if(koneksi == null)
		{
			try
			{
				String url = "jdbc:mysql://localhost:3306/identitas";
				String username = "root";
				String password = "";
				
				Class.forName("com.mysql.jdbc.Driver");
                                koneksi = DriverManager.getConnection(url, username, password);
			}
			catch(Exception ex)
			{
				System.out.println(ex);
			}
		}
		return koneksi;
	}

}
