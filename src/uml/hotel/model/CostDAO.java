package uml.hotel.model;

import java.util.List;

import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for Cost
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see uml.hotel.model.Cost
 * @author MyEclipse Persistence Tools
 */

public class CostDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(CostDAO.class);
	// property constants
	public static final String ROOM_ID = "roomId";
	public static final String SERVICE_NAME = "serviceName";
	public static final String SERVICE_PRICE = "servicePrice";
	public static final String NUMB = "numb";
	public static final String COST = "cost";

	public void save(Cost transientInstance) {
		log.debug("saving Cost instance");
		Transaction tran = getSession().beginTransaction();//
		try {
			getSession().save(transientInstance);
			tran.commit();//
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Cost persistentInstance) {
		log.debug("deleting Cost instance");
		Transaction tran = getSession().beginTransaction();//
		try {
			getSession().delete(persistentInstance);
			tran.commit();//
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Cost findById(java.lang.Integer id) {
		log.debug("getting Cost instance with id: " + id);
		try {
			Cost instance = (Cost) getSession().get("uml.hotel.model.Cost", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Cost instance) {
		log.debug("finding Cost instance by example");
		try {
			List results = getSession().createCriteria("uml.hotel.model.Cost")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Cost instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Cost as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByRoomId(Object roomId) {
		return findByProperty(ROOM_ID, roomId);
	}

	public List findByServiceName(Object serviceName) {
		return findByProperty(SERVICE_NAME, serviceName);
	}

	public List findByServicePrice(Object servicePrice) {
		return findByProperty(SERVICE_PRICE, servicePrice);
	}

	public List findByNumb(Object numb) {
		return findByProperty(NUMB, numb);
	}

	public List findByCost(Object cost) {
		return findByProperty(COST, cost);
	}

	public List findAll() {
		log.debug("finding all Cost instances");
		try {
			String queryString = "from Cost";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Cost merge(Cost detachedInstance) {
		log.debug("merging Cost instance");
		try {
			Cost result = (Cost) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Cost instance) {
		log.debug("attaching dirty Cost instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Cost instance) {
		log.debug("attaching clean Cost instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}