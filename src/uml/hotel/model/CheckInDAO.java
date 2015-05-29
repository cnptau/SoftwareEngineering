package uml.hotel.model;

import java.util.List;

import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for CheckIn entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see uml.hotel.model.CheckIn
  * @author MyEclipse Persistence Tools 
 */

public class CheckInDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(CheckInDAO.class);
		//property constants
	public static final String BOOKING_ID = "bookingId";
	public static final String NAME = "name";
	public static final String CUSTOMER_ID = "customerId";
	public static final String ROOM_ID = "roomId";
	public static final String START_TIME = "startTime";
	public static final String END_TIME = "endTime";
	public static final String LIVE_DATE = "liveDate";



    
    public void save(CheckIn transientInstance) {
        log.debug("saving CheckIn instance");
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
    
	public void delete(CheckIn persistentInstance) {
        log.debug("deleting CheckIn instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public CheckIn findById( java.lang.Integer id) {
        log.debug("getting CheckIn instance with id: " + id);
        try {
            CheckIn instance = (CheckIn) getSession()
                    .get("uml.hotel.model.CheckIn", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(CheckIn instance) {
        log.debug("finding CheckIn instance by example");
        try {
            List results = getSession()
                    .createCriteria("uml.hotel.model.CheckIn")
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
      log.debug("finding CheckIn instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from CheckIn as model where model." 
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
	
	public List findByLiveDate(Object liveDate
	) {
		return findByProperty(LIVE_DATE, liveDate
		);
	}
	

	public List findAll() {
		log.debug("finding all CheckIn instances");
		try {
			String queryString = "from CheckIn";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public CheckIn merge(CheckIn detachedInstance) {
        log.debug("merging CheckIn instance");
        try {
            CheckIn result = (CheckIn) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(CheckIn instance) {
        log.debug("attaching dirty CheckIn instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(CheckIn instance) {
        log.debug("attaching clean CheckIn instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}