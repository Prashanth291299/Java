package Controller;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Entity.Hosp;
import Persistance.Implement1;
import Service.ServiceHosp;

/**
 * Servlet implementation class Hosp_d
 */
@WebServlet("/Hosp_d")
public class Hosp_d extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hosp_d() 
    {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try 
		{
			List<Hosp> List = new ServiceHosp().showDetails();
			request.setAttribute("hosp", List);
			RequestDispatcher rd = request.getRequestDispatcher("Hosp.jsp");
			rd.forward(request,response);
		} 
		catch (ClassNotFoundException | SQLException e)
		{
			
			e.printStackTrace();
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String RequestType=request.getParameter("request_type");
		if(RequestType.equalsIgnoreCase("Add_Hospital"))
		{
		try 
		{
			String hname=request.getParameter("hname");
			String hadd=request.getParameter("hadd");
			String treat=request.getParameter("treat");
			Hosp h = new Hosp();
			h.setHname(hname);
			h.setHadd(hadd);
			h.setNoOfTreat(treat);
			int result;
			result = new Implement1().insertDetails(h);
			if(result!=0) 
		    {
		    	doGet(request, response);
		    }
			else 
			{
				response.sendRedirect("Add1.html");
			}
		  }
		  catch (ClassNotFoundException | SQLException e) 
		     {
				e.printStackTrace();
		     }
		}
		else if(RequestType.equalsIgnoreCase("updateteam")) 
			{
			try 
			{
				int hid=Integer.parseInt(request.getParameter("id"));
				Hosp h = new Implement1().getHosp(hid);
				request.setAttribute("Hosp",h);
				RequestDispatcher rd=request.getRequestDispatcher("EditHosp.jsp");
				rd.forward(request, response);
			}
		       catch (ClassNotFoundException | SQLException e) 
			{
				
				e.printStackTrace();
			}
			
			}
		else if (RequestType.equalsIgnoreCase("editteam")) 
		{
			try 
			{
			int hid=Integer.parseInt(request.getParameter("hid"));
			String hname=request.getParameter("hname");
			String hadd=request.getParameter("hadd");
			String treat=request.getParameter("treat");
			Hosp h = new Hosp();
			h.setHid(hid);
			h.setHname(hname);
			h.setHadd(hadd);
			h.setNoOfTreat(treat);
			int result = new Implement1().updateDetails(h);
			if(result!=0) 
			
				doGet(request, response);
			
			else 
			
				response.sendRedirect("EditHosp.jsp");
			}
			catch (ClassNotFoundException | SQLException e) 
			{	
				e.printStackTrace();
			}
		}
		else if (RequestType.equalsIgnoreCase("deleteteam"))
		{

			try 
			{
			int id=Integer.parseInt(request.getParameter("id"));
			Hosp h = new Hosp();
			h.setHid(id);
			int result = new Implement1().deleteDetails(h);
			if(result!=0)
				doGet(request, response);
			else
				response.sendRedirect("Hosp.jsp");
			}
			catch (ClassNotFoundException | SQLException e) 
			{
				e.printStackTrace();
			}
			
		}
		
	}
}

