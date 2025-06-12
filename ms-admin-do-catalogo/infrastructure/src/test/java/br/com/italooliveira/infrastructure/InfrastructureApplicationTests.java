package br.com.italooliveira.infrastructure;

import com.sun.tools.javac.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class InfrastructureApplicationTests {

    @Test
    void testInfrastructureApplication() throws Exception {
        Assertions.assertNotNull(new InfrastructureApplication());
        Main.main(new String[] {});
    }

}
