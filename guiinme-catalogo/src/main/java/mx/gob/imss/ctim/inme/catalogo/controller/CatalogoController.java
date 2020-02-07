package mx.gob.imss.ctim.inme.catalogo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import mx.gob.imss.ctim.inme.catalogo.component.CatalogoComponent;
import mx.gob.imss.ctim.inme.catalogo.model.AreaAdquisicion;

@RestController
@CrossOrigin
@RequestMapping("/api-front-mercados/catalogos")
public class CatalogoController {
	@Autowired
	CatalogoComponent catalogoComponent;
	
	@RequestMapping("/areas")
	List<AreaAdquisicion> getAreas(){
		return catalogoComponent.getAreas();
	}	
}