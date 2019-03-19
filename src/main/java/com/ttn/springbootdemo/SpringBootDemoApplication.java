package com.ttn.springbootdemo;

import com.ttn.springbootdemo.entity.DataBase;
import com.ttn.springbootdemo.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EntityScan(basePackages = {"com.ttn.springbootdemo.entity"})
//@EnableJpaRepositories(basePackages = {"com.ttn.springbootdemo.repositories"})
public class SpringBootDemoApplication {

	@Bean
	public User user(){
		return new User("vineet.Chaudhary@tothenew.com","password");
	}

	@Bean
	public DataBase dataBase(){
		return new DataBase();
	}



	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

}
