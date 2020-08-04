package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityTransaction;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.SystemException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import model.Donor;

import utility.ConnectionManager;
import utility.HibernateConnectionManager;

public class DonorDao implements DonorDaoInterface {
	private SessionFactory sessionFactory = HibernateConnectionManager.getSessionFactory();

//	List<Donor> list = new ArrayList<Donor>();
	@Override
	public int signup(Donor donor) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		if (session.save(donor) != null) {
			transaction.commit();
			session.close();
			return 1;
		} else {
			return 0;
		}

	}

	@Override
	public boolean loginDonor(Donor donor) {
		// TODO Auto-generated method stub

		Session session = this.sessionFactory.openSession();
		Transaction tx = null;

		try {
			tx = (Transaction) session.getTransaction();
			((EntityTransaction) tx).begin();
			Query query = session.createQuery("from Donors where email='" + donor.getDemail() + "'" + "and password ='"
					+ donor.getDpassword() + "'");
			donor = (Donor) query.uniqueResult();
			tx.commit();
		} catch (Exception e) {
			if (tx != null)
				try {
					tx.rollback();
				} catch (IllegalStateException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			e.printStackTrace();
		} finally {
			session.close();
		}
		return true;
	}

	/*************** Displaying donor's personal data ***************/

//	public List<Donor> view(String email) throws ClassNotFoundException, SQLException {
//		Donor donor;
//		String sql = "select firstname,lastname,age,weight,bloodgroup,phonenumber,city,available from donors where email=?";
//		PreparedStatement ps = ConnectionManager.getConnection().prepareStatement(sql);
//		ps.setString(1, email);
//		ResultSet rs = ps.executeQuery();
//		while (rs.next()) {
////			donor = new Donor(rs.getString(1), rs.getString(2),rs.getInt(3),rs.getInt(4), rs.getString(5), rs.getString(6), rs.getString(7),
////					rs.getString(8));
//			donor = new  Donor();
//			list.add(donor);
//		}
//		return list;
//	}	
	@Override

//	public List<Donor> view(String email) {
//		Session session = this.sessionFactory.openSession();
//		CriteriaBuilder builder = session.getCriteriaBuilder();
//		CriteriaQuery<Donor> query = builder.createQuery(Donor.class);
//		Root<Donor> root = query.from(Donor.class);
//		query.select(root);
//		Query<Donor> q = session.createQuery(query);
//		List<Donor> listBlog = q.getResultList();
//		return listBlog;
//	}

	public List<Donor> view(String email) {
		Session session = this.sessionFactory.openSession();
		Transaction transaction = session.getTransaction();
		transaction.begin();
		//String hql = "from donors where demail=:z";
		Query query = session.createQuery("from donors where demail='"+email+"'");
		//Query query = session.createQuery(hql);
		//query.setParameter("z", email);
		List<Donor> listBlog = query.getResultList();
		transaction.commit();
		return listBlog;
	}

}
