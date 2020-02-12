package mx.gob.imss.ctim.inme.investigacion;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MsinmeInvestigacionApplication {
	private static final Logger logger = LoggerFactory.getLogger(MsinmeInvestigacionApplication.class);
	
	

	public static void main(String[] args) {
		SpringApplication.run(MsinmeInvestigacionApplication.class, args);	
		
	}
	
	public void run(String... strings) throws Exception {
		logger.info("Entre a run");
		
	}

}
