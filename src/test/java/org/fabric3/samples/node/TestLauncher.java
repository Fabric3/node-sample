package org.fabric3.samples.node;

import org.fabric3.api.node.*;
import org.junit.*;

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
