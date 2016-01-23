package com.hb.config.app;

import javax.transaction.Transactional;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hb.core.model.AuthUser;
import com.hb.core.model.UserProperties;
import com.hb.core.model.dao.AuthUserDao;
import com.hb.core.model.dao.UserPropertiesDao;

@Service
public class SomeService {

	@Autowired
	private AuthUserDao authUserDao;

	@Autowired
	private UserPropertiesDao userPropertiesDao;

	@Autowired
	RabbitTemplate rabbitTemplate;

	@Transactional
	public void doSomething() {
		// AuthUser user = new AuthUser("harish-", "pass", true);
		// authUserDao.save(user);
	}

	@Transactional
	public void someBadMethod() {
		// rabbitTemplate.convertAndSend("spring-boot", "Hello from RabbitMQ! "
		// + 0);
		// rabbitTemplate.send();

		// AuthUser user = authUserDao.find(1);
		AuthUser user = new AuthUser("harish-" + System.currentTimeMillis(), "pass", true);
		UserProperties userProperties = new UserProperties("GR", 100);

		userProperties.user = user;
		user.userProperties = userProperties;

		//userPropertiesDao.save(userProperties);
		authUserDao.save(user);
	}
}
