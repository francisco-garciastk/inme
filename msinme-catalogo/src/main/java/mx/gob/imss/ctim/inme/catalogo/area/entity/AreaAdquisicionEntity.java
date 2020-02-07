package mx.gob.imss.ctim.inme.catalogo.area.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class AreaAdquisicionEntity {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	long id;
    String descripcion;

}
