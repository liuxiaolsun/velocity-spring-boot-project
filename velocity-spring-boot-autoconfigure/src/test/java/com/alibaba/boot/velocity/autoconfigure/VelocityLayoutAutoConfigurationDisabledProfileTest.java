package com.alibaba.boot.velocity.autoconfigure;

import com.alibaba.boot.velocity.AbstractSpringBootTest;
import com.alibaba.boot.velocity.VelocityLayoutProperties;
import com.alibaba.boot.velocity.web.servlet.view.EmbeddedVelocityLayoutViewResolver;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;

/**
 * {@link VelocityLayoutAutoConfiguration} Test
 *
 * @author <a href="mailto:mercyblitz@gmail.com">Mercy<a/>
 * @version 1.0.0
 * @see VelocityLayoutAutoConfiguration
 * @since 1.0.0 2016-07-18
 */
@ActiveProfiles("disabled")
public class VelocityLayoutAutoConfigurationDisabledProfileTest extends AbstractSpringBootTest {

    @Autowired
    private org.springframework.boot.autoconfigure.velocity.VelocityAutoConfiguration velocityAutoConfiguration;

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void testAssert() {
        Assert.assertNotNull(velocityAutoConfiguration);
        Assert.assertNotNull(applicationContext);
        Assert.assertTrue(applicationContext.getBeansOfType(VelocityLayoutProperties.class).isEmpty());
        Assert.assertTrue(applicationContext.getBeansOfType(EmbeddedVelocityLayoutViewResolver.class).isEmpty());
        Assert.assertTrue(applicationContext.getBeansOfType(VelocityLayoutAutoConfiguration.class).isEmpty());
        Assert.assertTrue(applicationContext.getBeansOfType(VelocityLayoutAutoConfiguration.VelocityLayoutWebConfiguration.class).isEmpty());
        Assert.assertTrue(applicationContext.getBeansOfType(VelocityLayoutAutoConfiguration.VelocityLayoutWebMvcConfigurer.class).isEmpty());
    }

}
