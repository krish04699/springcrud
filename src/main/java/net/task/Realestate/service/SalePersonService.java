package net.task.Realestate.service;

import java.util.List;

import net.task.Realestate.entity.SalePerson;

public interface SalePersonService {

	public List < SalePerson > getSalePersons();

    public void saveSalePerson(SalePerson theSalePerson);

    public SalePerson getSalePerson(int theId);

    public void deleteSalePerson(int theId);

}
