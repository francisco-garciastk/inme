package mx.gob.imss.ctim.inme.catalogo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@EnableAutoConfiguration
public class MsinmeCatalogoApplication {
	private static final Logger logger = LoggerFactory.getLogger(MsinmeCatalogoApplication.class);
	
	

	public static void main(String[] args) {
		SpringApplication.run(MsinmeCatalogoApplication.class, args);	
		
	}
	
	public void run(String... strings) throws Exception {
		logger.info("Entre a run");
	}

}
