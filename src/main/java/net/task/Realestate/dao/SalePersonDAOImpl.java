package net.task.Realestate.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
//import org.springframework.stereotype.Service;

import net.task.Realestate.entity.SalePerson;

@Repository
public class SalePersonDAOImpl implements SalePersonDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public List < SalePerson > getSalePersons() {
        Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery < SalePerson > cq = cb.createQuery(SalePerson.class);
        Root < SalePerson > root = cq.from(SalePerson.class);
        cq.select(root);
        Query query = session.createQuery(cq);
        return query.getResultList();
    }

    public void deleteSalePerson(int id) {
        Session session = sessionFactory.getCurrentSession();
        SalePerson book = session.byId(SalePerson.class).load(id);
        session.delete(book);
    }

    public void saveSalePerson(SalePerson theSalePerson) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(theSalePerson);
    }

    public SalePerson getSalePerson(int theId) {
        Session currentSession = sessionFactory.getCurrentSession();
        SalePerson theSalePerson = currentSession.get(SalePerson.class, theId);
        return theSalePerson;
    }
	
}
