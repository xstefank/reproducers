package io.xstefank;

import org.jboss.logging.Logger;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ResourceInfo;
import javax.ws.rs.core.Context;
import javax.ws.rs.ext.Provider;
import java.io.IOException;

@Provider
@RequestScoped
public class CdiJaxRsProvider implements ContainerRequestFilter {

    private Logger LOG = Logger.getLogger(CdiJaxRsProvider.class);

    @Context
    protected ResourceInfo resourceInfo;

    @Inject
    private TestBean testBean;

    public void filter(ContainerRequestContext containerRequestContext) throws IOException {
        LOG.error("=======================");

        LOG.error(resourceInfo.getResourceClass());

        LOG.error(testBean.getFoo());

        LOG.error("=======================");

    }
}
