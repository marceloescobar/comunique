package br.gov.sp.sorocaba.comunique.dominio;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Tramitacao {

	@Id
	@Column(name="traCodigo")
	private Integer id;
	
	
	@Column(name="traProcesso")
	private Integer processo;
	
	@Column(name="traDataEnvio")
	@Temporal(TemporalType.DATE)
	private Date dataEnvio;
	
	
	@Column(name="traSetorRemetente")
	private String setorRemetente;

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

	public Date getDataEnvio() {
		return dataEnvio;
	}

	public void setDataEnvio(Date dataEnvio) {
		this.dataEnvio = dataEnvio;
	}
	
	
	
}
