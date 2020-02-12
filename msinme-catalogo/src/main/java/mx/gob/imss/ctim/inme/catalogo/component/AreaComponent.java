package mx.gob.imss.ctim.inme.catalogo.component;

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

		 List<AreaAdquisicionEntity> areas= (List<AreaAdquisicionEntity>) areaAdquisicionRepository.findAll();

		 return areas;
	}

	
}
