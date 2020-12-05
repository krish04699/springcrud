package net.task.Realestate.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.task.Realestate.entity.SalePerson;
import net.task.Realestate.service.SalePersonService;

@Controller
@RequestMapping("/")
public class SalePersonController {


    @Autowired
    private SalePersonService SalePersonService;

    @GetMapping("/list")
    public String listSalePersons(Model theModel) {
        List < SalePerson > theSalePersons = SalePersonService.getSalePersons();
        System.out.println(theSalePersons);
        theModel.addAttribute("SalePersons", theSalePersons);
        return "list-SalePersons";
    }
/*
 * @RequestMapping(value = "/", method = RequestMethod.GET) 
public String displayLogin(Model model) { 
    model.addAttribute("login", new Login()); 
    return "login"; 
}
 */
    @GetMapping("/showForm")
    public String showFormForAdd(Model theModel) {
        SalePerson theSalePerson = new SalePerson();
        System.out.println("show");
        theModel.addAttribute("SalePerson", theSalePerson);
        return "SalePerson-form";
    }

    @PostMapping("/saveSalePerson")
    public String saveSalePerson(@Valid SalePerson SalePerson, BindingResult br,Model theModel) {
    	System.out.println(SalePerson);
    	if(br.hasErrors())
    	{
    		theModel.addAttribute("SalePerson", SalePerson);
    		System.out.println("has error");
    		return "SalePerson-form";
    	}
    	else
    	{
        SalePersonService.saveSalePerson(SalePerson);
        return "redirect:/list";
    	}
    }

    @GetMapping("/updateForm")
    public String showFormForUpdate(@RequestParam("SalePersonId") int theId,
        Model theModel) {
        SalePerson theSalePerson = SalePersonService.getSalePerson(theId);
        theModel.addAttribute("SalePerson", theSalePerson);
        System.out.println(theId);
        return "SalePerson-form";
    }

    @GetMapping("/delete")
    public String deleteSalePerson(@RequestParam("SalePersonId") int theId) {
        SalePersonService.deleteSalePerson(theId);
        System.out.println(theId);
        return "redirect:/list";
    }
	
	
}
