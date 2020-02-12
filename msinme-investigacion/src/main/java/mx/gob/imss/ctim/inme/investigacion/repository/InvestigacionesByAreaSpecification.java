package mx.gob.imss.ctim.inme.investigacion.repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import mx.gob.imss.ctim.inme.investigacion.entity.Investigacion;

public class InvestigacionesByAreaSpecification implements Specification<Investigacion> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private final Integer idAreaAdquisiciones; 
	
	public InvestigacionesByAreaSpecification(Integer idAreaAdquisiciones) {
	    this.idAreaAdquisiciones = idAreaAdquisiciones;
	  }

	@Override
	public Predicate toPredicate(Root<Investigacion> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
		return criteriaBuilder.equal(root.get(InvestigacionesMercado_.idAreaAdquisiciones), this.idAreaAdquisiciones) ;
	}

}
