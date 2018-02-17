package com.example.demo;

import com.example.demo.service.ShipperRepo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {DemoApplication.class, })
@Slf4j
@PropertySource("classpath*:test.properties")
@ActiveProfiles("test")
public class DemoApplicationTests {
    @Autowired
    DataSource myDataSource;

    @Autowired
    Environment environment;

    @Autowired
    ShipperRepo repo;

	@Test
	public void contextLoads() throws Exception {
	    log.info("From test");
	    log.info("Datasource: [{}]", myDataSource.getConnection().getClientInfo());

        log.info("Profiles: {}", Arrays.toString(environment.getActiveProfiles()));


        repo.findAll().forEach(System.out::println);

	}

}
