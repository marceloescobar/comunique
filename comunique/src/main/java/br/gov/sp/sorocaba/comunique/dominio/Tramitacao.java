package br.gov.sp.sorocaba.comunique.dominio;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tramitacoes")
public class Tramitacao implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	@Column(name="traCodigo")
	private Integer id;
	
	
	@Column(name="traProcesso")
	private Integer processo;
	
	
	//@ManyToOne
    //@JoinColumn(name="traProcesso", referencedColumnName="")
	//private Processo processo;
	
	
	@Column(name="traSetorRemetente")
	private String setorRemetente;
	
	@Column(name="traDataEnvio")
	@Temporal(TemporalType.DATE)
	private Date dataEnvio;
	
	@Column(name="traHoraEnvio")
	@Temporal(TemporalType.TIME)
	private Date horaEnvio;
	
	
	
	@Column(name="traSetorDestino")
	private String setorDestino;
	
	
	
	@Column(name="traDataRecebido")
	@Temporal(TemporalType.DATE)
	private Date dataRecebido;
	
	
	
	@Column(name="traHoraRecebido")
	@Temporal(TemporalType.TIME)
	private Date horaRecebido;

	
	@Column(name="traObs")
	private String obs;

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
