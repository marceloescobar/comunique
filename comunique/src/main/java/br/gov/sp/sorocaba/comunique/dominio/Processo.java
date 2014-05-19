package br.gov.sp.sorocaba.comunique.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "processos")
public class Processo {

	@Id
	@Column(name="proCodigo")
	private Integer id;
	
	@Column(name="proProcesso")
	private Integer processo;
	
	@Column(name="proInteressado")
	private String interessado;
	
	@Column(name="proAssunto")
	private String assunto;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getProcesso() {
		return processo;
	}

	public void setProcesso(Integer processo) {
		this.processo = processo;
	}

	public String getInteressado() {
		return interessado;
	}

	public void setInteressado(String interessado) {
		this.interessado = interessado;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	
	
}
