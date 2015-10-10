package org.fabric3.samples.node;

import org.fabric3.api.node.*;

/**
 *
 */
public class StartSample {

    public static void main(String... args) throws Exception {
        Fabric fabric = Bootstrap.initialize();
        fabric.addProfile("file");
        fabric.addProfile("rs");
        fabric.start();

        Domain domain = fabric.getDomain();
        //        domain.deploy("Foo", new FooServiceImpl());
        //
        //        FooService service = domain.getService(FooService.class);
        //
        //        System.out.println(service.hello());

        fabric.stop();

    }
}
