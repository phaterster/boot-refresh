package com.example.demo;

import com.example.demo.service.ShipperRepo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
@PropertySource("classpath*:test.properties")
public class DemoApplicationTests {
    @Autowired
    DataSource myDataSource;

    @Autowired
    ShipperRepo repo;

	@Test
	public void contextLoads() throws Exception {
	    log.info("From test");
	    log.info("Datasource: [{}]", myDataSource.getLoginTimeout());
	    repo.findAll().forEach(System.out::println);
	}

}
