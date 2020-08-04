package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DonorDao;
import model.Donor;

/**
 * Servlet implementation class signupServlet
 */
@WebServlet("/signup")
public class signupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public signupServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/signupView.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String dfname=request.getParameter("fname");
		String dlname=request.getParameter("lname");
		String demail=request.getParameter("email");
		int dage=Integer.parseInt(request.getParameter("age"));
		int dweight=Integer.parseInt(request.getParameter("weight"));
		String dbloodgroup=request.getParameter("bloodgroup");
		String dpassword=request.getParameter("password");
		String dphoneno=request.getParameter("phoneno");
		String dcity=request.getParameter("city");
		String davailability=request.getParameter("availability");
		
		Donor donor= new Donor();
		donor.setDfname(dfname);
		donor.setDlname(dlname);
		donor.setDemail(demail);
		donor.setDage(dage);
		donor.setDweight(dweight);
		donor.setDbloodgroup(dbloodgroup);
		donor.setDpassword(dpassword);
		donor.setDphoneno(dphoneno);
		donor.setDcity(dcity);
		donor.setDavailability(davailability);
		int checkUser=0;
		DonorDao donordao=new DonorDao();
		checkUser=donordao.signup(donor);
		if(checkUser!=0)
		{
			request.setAttribute("message", "Registration successful");
			RequestDispatcher rd =this.getServletContext().getRequestDispatcher("/WEB-INF/views/signupView.jsp");
			rd.forward(request, response);
		}
		else
		{
			request.setAttribute("message", "Check Your Credentials");
			RequestDispatcher rd =this.getServletContext().getRequestDispatcher("/WEB-INF/views/signupView.jsp");
			rd.forward(request, response);
		}
	}

}
