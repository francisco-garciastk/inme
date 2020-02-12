package mx.gob.imss.ctim.inme.investigacion.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.gob.imss.ctim.inme.investigacion.component.InvestigacionComponent;
import mx.gob.imss.ctim.inme.investigacion.model.Investigacion;

@RestController
@CrossOrigin
@RequestMapping("/api-front-mercados/investigaciones")
public class InvestigacionController {
	@Autowired
	InvestigacionComponent investigacionComponent;
	
	
	@RequestMapping("/{id}")
	public Investigacion getDetalleInvestigacion(@PathVariable("id") Integer id){
		return investigacionComponent.getDetalleInvestigacion(id);
	}	
}