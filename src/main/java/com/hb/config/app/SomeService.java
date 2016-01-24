package com.hb.config.app;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.hb.core.model.AuthUser;
import com.hb.core.model.Harish;
import com.hb.core.model.Plan;
import com.hb.core.model.dao.AuthUserDao;
import com.hb.core.model.dao.PlanDao;
import com.hb.core.model.dao.UserPropertiesDao;

@Service
public class SomeService {

	@Autowired
	private AuthUserDao authUserDao;

	@Autowired
	private UserPropertiesDao userPropertiesDao;

	@Autowired
	private PlanDao planDao;

	@Autowired
	RabbitTemplate rabbitTemplate;
	
	public SomeService() {
	}
	
	public SomeService(Harish harish) {
	}
	
	@Transactional
	public void doSomething() {
		AuthUser user = new AuthUser("harish", "pass", true);
		authUserDao.save(user);
		savePlans(user);
	}

	@Transactional()
	public void savePlans(AuthUser user) {
		for (int i = 0; i < 3; i++) {
			Plan p = new Plan("Plan: " + i);
			user.addPlan(p);
			planDao.save(p);
		}
	}

	@Transactional()
	public void someBadMethod() {
		if (true) return;
		AuthUser user = authUserDao.find(1);
		user.plans.forEach((x) -> {
			planDao.remove(x);
		});
	}
}
