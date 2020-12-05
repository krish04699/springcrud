package net.task.Realestate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.task.Realestate.dao.SalePersonDAO;
import net.task.Realestate.entity.SalePerson;
@Service
public class SalePersonServiceImpl implements SalePersonService {

	 @Autowired
	    private SalePersonDAO SalePersonDAO;

	    @Transactional
	    public List < SalePerson > getSalePersons() {
	        return SalePersonDAO.getSalePersons();
	    }

	    @Transactional
	    public void saveSalePerson(SalePerson theSalePerson) {
	        SalePersonDAO.saveSalePerson(theSalePerson);
	    }

	    @Transactional
	    public SalePerson getSalePerson(int theId) {
	    	System.out.println(theId);
	        return SalePersonDAO.getSalePerson(theId);
	    }

	    @Transactional
	    public void deleteSalePerson(int theId) {
	    	System.out.println(theId);
	        SalePersonDAO.deleteSalePerson(theId);
	    }
	
}
