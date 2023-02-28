package Service;

import java.sql.SQLException;
import java.util.List;
import Entity.Hosp;
import Persistance.Implement1;
public class ServiceHosp 
{
	public List<Hosp> showDetails() throws ClassNotFoundException, SQLException
	{
		return new Implement1().show();
	}
	public int insertDetails(Hosp h1) throws ClassNotFoundException, SQLException
	{
		return new Implement1().insertDetails(h1);
	}
	public Hosp getHosp(int hid) throws ClassNotFoundException, SQLException
	{
		return new Implement1().getHosp(hid);
	}
	public int updateDetails(Hosp h1) throws ClassNotFoundException, SQLException
	{
		return new Implement1().updateDetails(h1);
	}
	public int deleteDetails(Hosp h1) throws ClassNotFoundException, SQLException
	{
		return new Implement1().deleteDetails(h1);
	}
}
