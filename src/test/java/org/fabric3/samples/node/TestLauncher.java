package org.fabric3.samples.node;

import org.fabric3.api.node.Bootstrap;
import org.fabric3.api.node.Domain;
import org.fabric3.api.node.Fabric;
import org.junit.Test;

/**
 *
 */

public class TestLauncher {

    @Test
    public void testLaunch() throws Exception {
        Fabric fabric = Bootstrap.initialize();
        fabric.addProfile("file");
        fabric.start();

        Domain domain = fabric.getDomain();
        domain.deploy("Foo", new FooServiceImpl());

        FooService service = domain.getService(FooService.class);

        System.out.println(service.hello());

        fabric.stop();
    }

}
