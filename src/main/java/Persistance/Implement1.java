package Persistance;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Entity.Hosp;
public class Implement1 implements Decleration1
{
	public List<Hosp> show() throws ClassNotFoundException, SQLException
	{
		Hosp h1=null;
		ArrayList<Hosp> List = new ArrayList<Hosp>();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","7781");
		PreparedStatement ps = c.prepareStatement("select * from hd");
		ResultSet rs= ps.executeQuery();
		while(rs.next()) 
		{
			h1 = new Hosp();
			h1.setHid(rs.getInt(1));
			h1.setHname(rs.getString(2));
			h1.setHadd(rs.getString(3));
			h1.setNoOfTreat(rs.getString(4));
			List.add(h1);
		}
		return List;
	}
	public int insertDetails(Hosp h1) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","7781");
		PreparedStatement ps=c.prepareStatement("insert into hd(hname,hadd,typesOfTreatments) values(?,?,?)");
		ps.setString(1,h1.getHname());
		ps.setString(2,h1.getHadd());
		ps.setString(3,h1.getNoOfTreat());
		int result = ps.executeUpdate();
	    return result;
	}
	public Hosp getHosp(int hid) throws ClassNotFoundException, SQLException
	{
		Hosp h= null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","7781");
		PreparedStatement ps=c.prepareStatement("select * from hd where hid=?");
		ps.setInt(1,hid);
		ResultSet rs=ps.executeQuery();
		rs.next();
		h= new Hosp();
		h.setHid(rs.getInt(1));
		h.setHname(rs.getString(2));
		h.setHadd(rs.getString(3));
		h.setNoOfTreat(rs.getString(4));
		return h;
	}
	public int updateDetails(Hosp h1) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","7781");
		PreparedStatement ps=c.prepareStatement("update hd set hname=?,hadd=?,typesOfTreatments=? where hid=?");
		ps.setString(1, h1.getHname());
		ps.setString(2, h1.getHadd());
		ps.setString(3, h1.getNoOfTreat());
		ps.setInt(4, h1.getHid());
		int result=ps.executeUpdate();
		return result;
	}
	public int deleteDetails(Hosp h1) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","7781");
		PreparedStatement ps=c.prepareStatement("delete from hd where hid=?");
		ps.setInt(1,h1.getHid());
		int result=ps.executeUpdate();
		return result;
	}
}