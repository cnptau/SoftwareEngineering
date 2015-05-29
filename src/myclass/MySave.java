package myclass;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import uml.hotel.model.*;
import uml.hotel.templement.*;
public class MySave {
		private SessionFactory sessionFactory = HibernateSessionFactory.getSessionFactory();
		private Session session = sessionFactory.openSession();
	    private Transaction tx = session.beginTransaction();
	    
	    
		public void updateOrSave(WalkIn walkin){    
		    session.merge(walkin);                   //����͸���ͬ��ʵ��?
		    tx.commit();
		}
		public void updateOrSave(Reservation res){    
		    session.merge(res);
		    tx.commit();
		}
		public void updateOrSave(CheckIn che){    
		    session.merge(che);
		    tx.commit();
		}
	
}