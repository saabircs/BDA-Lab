

import java.sql.*;


public class lab1 {


	public static void main(String[] args)
	{

		Connection con = null;
		PreparedStatement ps = null;

		con = connection.connectDB();


		try {

			String sql = "insert into empdetails values('Tim Cook','TC','timcook@apple.com','CEO','3215260151',10)";

			ps = con.prepareStatement(sql);

			ps.execute();
		}


		catch (Exception e) {

			System.out.println(e);
		}
	}
}
