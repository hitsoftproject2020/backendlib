package com.neusoft.oa;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication
@MapperScan(basePackages={"com.neusoft.oa.ht.mapper","com.neusoft.oa.admin.mapper"})
//@MapperScan(basePackages={"com.neusoft.oa.ht.mapper"})
@EnableTransactionManagement  //启用事务Advice
public class HotelWebSystemLphApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelWebSystemLphApplication.class, args);
		
		
	}

}
