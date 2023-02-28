package Entity;

public class Hosp
{
	private int hid;
	private String hname;
	private String hadd;
	private String noOfTreat;
	
	public Hosp()
	{
		
	}
	public Hosp(int hid, String hname, String hadd, String noOfTreat) 
	{
		
		this.hid = hid;
		this.hname = hname;
		this.hadd = hadd;
		this.noOfTreat = noOfTreat;
	}
	public int getHid()
	{
		return hid;
	}
	public void setHid(int hid)
	{
		this.hid = hid;
	}
	public String getHname() 
	{
		return hname;
	}
	public void setHname(String hname)
	{
		this.hname = hname;
	}
	public String getHadd() 
	{
		return hadd;
	}
	public void setHadd(String hadd)
	{
		this.hadd = hadd;
	}
	public String getNoOfTreat()
	{
		return noOfTreat;
	}
	public void setNoOfTreat(String noOfTreat)
	{
		this.noOfTreat = noOfTreat;
	}
	@Override
	public String toString()
	{
		return "Hosp [hid=" + hid + ", hname=" + hname + ", hadd=" + hadd + ", noOfTreat=" + noOfTreat + "]";
	}
}
