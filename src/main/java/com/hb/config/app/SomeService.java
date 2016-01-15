package com.hb.config.app;

import com.hb.core.model.AuthUser;
import com.hb.core.model.dao.AuthUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class SomeService {
    public void doSomething() {
        System.out.println("I did something");
    }

    @Autowired
    private AuthUserDao authUserDao;

    @Transactional
    public void someBadMethod() {
        authUserDao.save(new AuthUser("harish-" + System.currentTimeMillis(), "pass", true));
    }
}
