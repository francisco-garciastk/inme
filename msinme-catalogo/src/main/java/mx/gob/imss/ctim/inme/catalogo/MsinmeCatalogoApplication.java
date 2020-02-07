package mx.gob.imss.ctim.inme.catalogo;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import mx.gob.imss.ctim.inme.catalogo.area.entity.AreaAdquisicionEntity;
import mx.gob.imss.ctim.inme.catalogo.area.repository.AreaAdquisicionRepository;

@SpringBootApplication
public class MsinmeCatalogoApplication {
	private static final Logger logger = LoggerFactory.getLogger(MsinmeCatalogoApplication.class);
	
	@Autowired
	AreaAdquisicionRepository areaAdquisicionRepository;

	public static void main(String[] args) {
		SpringApplication.run(MsinmeCatalogoApplication.class, args);	
		
	}
	
	public void run(String... strings) throws Exception {
		logger.info("Entre a run");
		AreaAdquisicionEntity[] areas = { 
					new AreaAdquisicionEntity(1L,"Bienes"),
					new AreaAdquisicionEntity(2L,"Servicio"),
					new AreaAdquisicionEntity(3L,"Obra")};
		Arrays.asList(areas).forEach(area -> areaAdquisicionRepository.save(area));
	}

}
