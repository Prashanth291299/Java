package Persistance;

import java.sql.SQLException;
import java.util.List;

import Entity.Hosp;

public interface Decleration1 
{
	public List<Hosp> show() throws ClassNotFoundException, SQLException;
	public int insertDetails(Hosp h1) throws ClassNotFoundException, SQLException;
	public Hosp getHosp(int hid) throws ClassNotFoundException, SQLException;
	public int updateDetails(Hosp h1) throws ClassNotFoundException, SQLException;
	public int deleteDetails(Hosp h1) throws ClassNotFoundException, SQLException;

}
