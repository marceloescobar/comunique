package br.gov.sp.sorocaba.comunique.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "comunique")
public class Comunique {

	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "comunicado")
	private String comunicado;

	@Column(name = "assunto")
	private String assunto;

	@Column(name = "chefe")
	private String chefe;

	@Column(name = "responsavel")
	private String responsavel;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getComunicado() {
		return comunicado;
	}

	public void setComunicado(String comunicado) {
		this.comunicado = comunicado;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getChefe() {
		return chefe;
	}

	public void setChefe(String chefe) {
		this.chefe = chefe;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	
	

}
