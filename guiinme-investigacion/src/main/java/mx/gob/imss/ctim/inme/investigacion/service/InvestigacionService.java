package mx.gob.imss.ctim.inme.investigacion.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import mx.gob.imss.ctim.inme.investigacion.model.Documento;
import mx.gob.imss.ctim.inme.investigacion.model.Investigacion;

@Service
public class InvestigacionService {

	private String INVESTIGACIONES_URL = "http://localhost/api-back-mercados/investigaciones/";
	private RestTemplate restTemplate;
	
	public Investigacion getDetalleInvestigacion(Integer id){
		Investigacion investigacion = new Investigacion();
		Documento docto = new Documento();
//		INVESTIGACIONES_URL.concat(String.valueOf(id));
//		restTemplate= new RestTemplate();	 
//		ResponseEntity<Investigacion> response =
//				  restTemplate.getForEntity(INVESTIGACIONES_URL, Investigacion.class);		 
//		investigacion = response.getBody();
		investigacion.setId(3);
		investigacion.setDescripcion("Limpieza");
		investigacion.setFechaApertura("01/01/2020");
		investigacion.setFechaCierre("31/01/2020");
		docto.setId("000231");
		investigacion.setDocumento(docto);
		return investigacion;
	}
}
