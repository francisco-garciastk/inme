package mx.gob.imss.ctim.inme.investigacion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mx.gob.imss.ctim.inme.investigacion.component.InvestigacionComponent;
import mx.gob.imss.ctim.inme.investigacion.entity.Investigacion;

@RestController
@CrossOrigin
@RequestMapping("/api-back-invetigaciones")
public class InvestigacionController {

	@Autowired
	InvestigacionComponent investigacionComponent;
	
	@GetMapping
	public List<Investigacion> index(@RequestParam Integer area, @RequestParam Integer offSet
			, @RequestParam Integer limit) {
		
		return investigacionComponent.findByArea(area, offSet, limit);
	}
	
}
