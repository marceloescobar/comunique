package br.gov.sp.sorocaba.comunique.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "setoresoriginal")
public class Setor {

	
	@Id
	@Column(name="setCodigo")
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
}
