package mx.gob.imss.ctim.inme.catalogo.component;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mx.gob.imss.ctim.inme.catalogo.area.entity.AreaAdquisicionEntity;
import mx.gob.imss.ctim.inme.catalogo.area.repository.AreaAdquisicionRepository;

@Component
public class AreaComponent {
		
	@Autowired
	AreaAdquisicionRepository areaAdquisicionRepository;
	
	public List<AreaAdquisicionEntity> getAreas() {
		AreaAdquisicionEntity[] areasArray = { 
				new AreaAdquisicionEntity(1L,"Bienes"),
				new AreaAdquisicionEntity(2L,"Servicio"),
				new AreaAdquisicionEntity(3L,"Obra")};
		 List<AreaAdquisicionEntity> areas = Arrays.asList(areasArray);
//		 List<AreaAdquisicionEntity> areas= areaAdquisicionRepository.findAll();

		 return areas;
	}

	
}
