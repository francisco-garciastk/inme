package mx.gob.imss.ctim.inme.catalogo.model;

import java.io.Serializable;
import lombok.Data;

@Data
public class AreaAdquisicion implements Serializable {
	
	private static final long serialVersionUID = 6400039598516335455L;
	
	private long id;
	private String descripcion;
	
}
