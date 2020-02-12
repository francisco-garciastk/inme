package mx.gob.imss.ctim.inme.investigacion.component;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import mx.gob.imss.ctim.inme.investigacion.entity.Investigacion;
import mx.gob.imss.ctim.inme.investigacion.repository.InvestigacionRepository;
import mx.gob.imss.ctim.inme.investigacion.repository.InvestigacionesByAreaSpecification;

@Component
public class InvestigacionComponent {

	@Autowired
	InvestigacionRepository investigacionRepository;
	
	public List<Investigacion> findByArea(Integer area, Integer offSet, Integer limit){
		
		//Se hace la asignacion de las variables a Pageable y Specification
		Pageable pageable = PageRequest.of(offSet, limit);
		Specification<Investigacion> spec = new InvestigacionesByAreaSpecification(area); 
		
		//Se hace la llamada al metodo findAll del repository
		Page<Investigacion> pageData = investigacionRepository.findAll(spec,pageable);
	    
		//Casteo del resultado
		List<Investigacion> filteredData = pageData.getContent();
	    
		//Retorno de la consulta
		return filteredData;
	}
	
}
