package com.neusoft.hotel;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.neusoft.oa.ht.mapper.ICustomerMapper;
import com.neusoft.oa.ht.model.CustomerModel;

@SpringBootApplication
public class HotelWebSystemLphApplication {

	public static void main(String[] args) {
		CustomerModel customerModel = new CustomerModel();
		customerModel.setCid(1);
		customerModel.setCidno("1170300602");
		customerModel.setCnameString("lph");
		customerModel.setCpassWord("1170300602");
		customerModel.setCphoneno("18800419131");
		customerModel.setCrealName("lph");
		customerModel.setCsex("m");
		
		
	}

}
