package com.imooc.gradle;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

/**
 * to do
 *
 * @author Lucifer
 * @date $(DATE)
 */
public class UserRepositoryTest {
    private static Logger logger = LoggerFactory.getLogger(UserRepository.class);
    @Test
    public void create() throws Exception {
        UserRepository repository = new UserRepository();
        User user = repository.create();
        logger.info("哈哈哈");
        //user = null;
        Assert.assertNotNull(user);
    }

}