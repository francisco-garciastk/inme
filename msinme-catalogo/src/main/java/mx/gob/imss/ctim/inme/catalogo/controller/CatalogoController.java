package mx.gob.imss.ctim.inme.catalogo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.gob.imss.ctim.inme.catalogo.area.entity.AreaAdquisicionEntity;
import mx.gob.imss.ctim.inme.catalogo.component.AreaComponent;

@RestController
@CrossOrigin
@RequestMapping("/api-back-mercados/catalogos")
public class CatalogoController {
	
	@Autowired
	AreaComponent areaComponent;
	

	@RequestMapping("/areas")
	List<AreaAdquisicionEntity> getAreas(){
		return areaComponent.getAreas();
	}	
}