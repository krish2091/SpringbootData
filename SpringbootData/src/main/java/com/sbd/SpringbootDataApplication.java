package com.sbd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sbd.entities.PersonDetails;

import com.sbd.repositories.PersonDetailsRepository;

@SpringBootApplication
public class SpringbootDataApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctrx=SpringApplication.run(SpringbootDataApplication.class, args);
		PersonDetailsRepository prsnDtls=  ctrx.getBean(PersonDetailsRepository.class);
		
		PersonDetails prsn =new PersonDetails();
		prsn.setPerson_name("rk");
		prsn.setPerson_age(29);
		prsn.setPerson_gender('M');
		prsn.setPerson_state("Telangana");
		prsn.setPerson_country("India");
		
		prsnDtls.save(prsn);
	}

}
