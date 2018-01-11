package com.tma;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SaleProjectApplicationTests {

	@Test
	public void contextLoads() {
	}
	@Test
    public void test()
    {
		SaleProjectApplication.main(new String[]{
                "--spring.main.web-environment=false",
                "--spring.autoconfigure.exclude=false"
        });
    }

}
