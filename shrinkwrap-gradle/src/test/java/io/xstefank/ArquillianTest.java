package io.xstefank;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit5.ArquillianExtension;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.gradle.archive.importer.embedded.EmbeddedGradleImporter;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(ArquillianExtension.class)
class ArquillianTest {

    @Deployment
    public static WebArchive createDeployment() {
        System.err.println("Creating deployment");
        return ShrinkWrap.create(EmbeddedGradleImporter.class)
            .forThisProjectDirectory()
            .importBuildOutput()
            .as(WebArchive.class);
    }

    @Test
    void test() {
        Assertions.assertNotNull(new Object());
    }

}