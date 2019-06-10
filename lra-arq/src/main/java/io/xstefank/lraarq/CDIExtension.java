package io.xstefank.lraarq;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.enterprise.inject.spi.AfterBeanDiscovery;
import javax.enterprise.inject.spi.BeanManager;
import javax.enterprise.inject.spi.Extension;

public class CDIExtension implements Extension {

    public void observeABD(@Observes AfterBeanDiscovery afterBeanDiscovery, BeanManager beanManager) {
        System.out.println("AAAAAAAAAAAAAA " + afterBeanDiscovery);

        afterBeanDiscovery.addBean()
            .read(beanManager.createAnnotatedType(TestBean.class))
            .beanClass(TestBean.class)
            .scope(ApplicationScoped.class)
            .name("testBean")
            .createWith(creationalContext -> new TestBean("custom value"));
    }
}
