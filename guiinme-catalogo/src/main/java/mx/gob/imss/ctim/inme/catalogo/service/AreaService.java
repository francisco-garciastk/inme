package mx.gob.imss.ctim.inme.catalogo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import mx.gob.imss.ctim.inme.catalogo.model.AreaAdquisicion;

@Service
public class AreaService {

	private static final String areasURL = "http://localhost/api-back-mercados/catalogos/areas";
	private RestTemplate restTemplate;
	
	public List<AreaAdquisicion> getAreas(){
		List<AreaAdquisicion> areas = new ArrayList<AreaAdquisicion>();
		restTemplate= new RestTemplate();	 
		 ResponseEntity<AreaAdquisicion[]> response =
				  restTemplate.getForEntity(areasURL, AreaAdquisicion[].class);		 
		areas = Arrays.asList(response.getBody());
		return areas;
	}
}
