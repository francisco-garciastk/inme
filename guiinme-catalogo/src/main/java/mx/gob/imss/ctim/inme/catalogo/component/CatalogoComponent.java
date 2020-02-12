package mx.gob.imss.ctim.inme.catalogo.component;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mx.gob.imss.ctim.inme.catalogo.model.AreaAdquisicion;
import mx.gob.imss.ctim.inme.catalogo.service.AreaService;

@Component
public class CatalogoComponent {
	
	
	@Autowired
	private AreaService areaService;
	
	
	public List<AreaAdquisicion> getAreas() {
		return areaService.getAreas();
	}

	
}
