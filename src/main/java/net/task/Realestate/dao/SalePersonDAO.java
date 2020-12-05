package net.task.Realestate.dao;

import java.util.List;

import net.task.Realestate.entity.SalePerson;

public interface SalePersonDAO {


    public List < SalePerson > getSalePersons();

    public void saveSalePerson(SalePerson theSalePerson);

    public SalePerson getSalePerson(int theId);

    public void deleteSalePerson(int theId);
	
}
