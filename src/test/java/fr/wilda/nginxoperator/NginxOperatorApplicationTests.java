package fr.wilda.nginxoperator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import io.javaoperatorsdk.operator.springboot.starter.test.EnableMockOperator;

@SpringBootTest
@EnableMockOperator(crdPaths = "classpath:nginxinstallerresources.fr.wilda-v1.yml")
class NginxOperatorApplicationTests {

	@Test
	void contextLoads() {
	}

}
