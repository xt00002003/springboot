package com.dark;

import com.dark.dao.DriversDao;
import com.dark.entity.Drivers;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	private static final Log LOG = LogFactory.getLog(DemoApplicationTests.class);

	@Autowired
	private DriversDao driversDao;

	@Test
	public void selectCount() {
		Drivers drivers=new Drivers();
		Long count=driversDao.selectCount(drivers);
		LOG.info("this result is :"+count);
		Assert.assertNotNull(count);
	}

}
