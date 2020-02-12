package mx.gob.imss.ctim.inme.investigacion.model;

import java.io.Serializable;
import lombok.Data;

@Data
public class Investigacion implements Serializable {
	
	private static final long serialVersionUID = 6400039598516335455L;
	
	private Integer id;
	private String descripcion;
	private String fechaApertura;
	private String fechaCierre;
	private Documento documento;
	
}
