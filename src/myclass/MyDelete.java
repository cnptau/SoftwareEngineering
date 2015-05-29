package myclass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import uml.hotel.model.*;
import uml.hotel.templement.*;

public class MyDelete {
	SessionFactory sessionFactory = HibernateSessionFactory.getSessionFactory();
	Session session = sessionFactory.openSession();
    Transaction tx = session.beginTransaction();
	public void Delete(WalkIn walkin){
		
		session.delete(walkin);
		tx.commit();
	}
	public void Delete(Reservation res){
		
		session.delete(res);
		tx.commit();
	}
	
}
