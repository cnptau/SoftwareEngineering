package uml.hotel.model;

import java.util.List;

import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Reservation entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see uml.hotel.model.Reservation
  * @author MyEclipse Persistence Tools 
 */

public class ReservationDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(ReservationDAO.class);
		//property constants
	public static final String BOOKING_ID = "bookingId";
	public static final String NAME = "name";
	public static final String CALL_NUMBER = "callNumber";
	public static final String CUSTOMER_ID = "customerId";
	public static final String ROOM_ID = "roomId";
	public static final String BOOKING_TIME = "bookingTime";
	public static final String START_TIME = "startTime";
	public static final String END_TIME = "endTime";
	public static final String STAY_TIME = "stayTime";



    
    public void save(Reservation transientInstance) {
        log.debug("saving Reservation instance");
        Transaction tran =	getSession().beginTransaction();//
        try {
            getSession().save(transientInstance);
            tran.commit();//
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Reservation persistentInstance) {
        log.debug("deleting Reservation instance");
        Transaction tran =	getSession().beginTransaction();//
        try {
            getSession().delete(persistentInstance);
            tran.commit();//
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Reservation findById( java.lang.Integer id) {
        log.debug("getting Reservation instance with id: " + id);
        try {
            Reservation instance = (Reservation) getSession()
                    .get("uml.hotel.model.Reservation", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Reservation instance) {
        log.debug("finding Reservation instance by example");
        try {
            List results = getSession()
                    .createCriteria("uml.hotel.model.Reservation")
                    .add(Example.create(instance))
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    
    public List findByProperty(String propertyName, Object value) {
      log.debug("finding Reservation instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Reservation as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByBookingId(Object bookingId
	) {
		return findByProperty(BOOKING_ID, bookingId
		);
	}
	
	public List findByName(Object name
	) {
		return findByProperty(NAME, name
		);
	}
	
	public List findByCallNumber(Object callNumber
	) {
		return findByProperty(CALL_NUMBER, callNumber
		);
	}
	
	public List findByCustomerId(Object customerId
	) {
		return findByProperty(CUSTOMER_ID, customerId
		);
	}
	
	public List findByRoomId(Object roomId
	) {
		return findByProperty(ROOM_ID, roomId
		);
	}
	
	public List findByBookingTime(Object bookingTime
	) {
		return findByProperty(BOOKING_TIME, bookingTime
		);
	}
	
	public List findByStartTime(Object startTime
	) {
		return findByProperty(START_TIME, startTime
		);
	}
	
	public List findByEndTime(Object endTime
	) {
		return findByProperty(END_TIME, endTime
		);
	}
	
	public List findByStayTime(Object stayTime
	) {
		return findByProperty(STAY_TIME, stayTime
		);
	}
	

	public List findAll() {
		log.debug("finding all Reservation instances");
		try {
			String queryString = "from Reservation";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Reservation merge(Reservation detachedInstance) {
        log.debug("merging Reservation instance");
        try {
            Reservation result = (Reservation) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Reservation instance) {
        log.debug("attaching dirty Reservation instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Reservation instance) {
        log.debug("attaching clean Reservation instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}