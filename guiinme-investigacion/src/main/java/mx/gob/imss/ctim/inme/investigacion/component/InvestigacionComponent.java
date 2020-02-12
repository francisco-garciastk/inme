package mx.gob.imss.ctim.inme.investigacion.component;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mx.gob.imss.ctim.inme.investigacion.model.Investigacion;
import mx.gob.imss.ctim.inme.investigacion.service.InvestigacionService;

@Component
public class InvestigacionComponent {
	
	
	@Autowired
	private InvestigacionService investigacionService;
	
	public Investigacion getDetalleInvestigacion(Integer id) {
		return investigacionService.getDetalleInvestigacion(id);
	}

	
}
