package com.techelevator;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.dao.CustomerDao;
import com.techelevator.dao.model.Customer;

@Controller
public class CustomerSearchController {

    @Autowired
    private CustomerDao customerDao;
    
    @RequestMapping("/customerList")
    public String showCustomerListForum() {
    	return "customerList";
    }
    
    @RequestMapping("/customerSearch")
    public String searchCustomer(@RequestParam String name,
    							@RequestParam String sort,
    							ModelMap map) {
    	List <Customer> customerSearchList = customerDao.searchAndSortCustomers(name, sort);
    	map.put("customers", customerSearchList);
    	return "customerList";
    }

}