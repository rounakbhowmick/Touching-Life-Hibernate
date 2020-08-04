package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DonorDao;
import model.Donor;

/**
 * Servlet implementation class DonorViewServlet
 */
@WebServlet("/DonorView")
public class DonorViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DonorViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/donorview.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Donor> list = new ArrayList<Donor>();
		DonorDao donordao=new DonorDao();
		
		// TODO Auto-generated method stub
		String email = (String) request.getAttribute("email");
		list=donordao.view(email);
		for (Donor donor : list) {
			System.out.println(donor.getDfname()+" "+donor.getDcity());
			request.setAttribute("donorname", donor.getDfname()+" "+donor.getDlname());
			request.setAttribute("age", donor.getDage());
			request.setAttribute("weight", donor.getDweight());
			request.setAttribute("bloodgroup", donor.getDbloodgroup());
			request.setAttribute("phonenumber", donor.getDphoneno());
			request.setAttribute("city", donor.getDcity());
			request.setAttribute("available", donor.getDavailability());
		}
		doGet(request, response);
	}
}
