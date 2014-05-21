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
	
	
	@ManyToOne
    @JoinColumn(name="traSetorDestino", referencedColumnName="setCodSetor")
	//@Column(name="traSetorDestino")
	private Setor setorDestino;
	
	
	
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

	public String getSetorRemetente() {
		return setorRemetente;
	}

	public void setSetorRemetente(String setorRemetente) {
		this.setorRemetente = setorRemetente;
	}

	public Date getHoraEnvio() {
		return horaEnvio;
	}

	public void setHoraEnvio(Date horaEnvio) {
		this.horaEnvio = horaEnvio;
	}



	public Setor getSetorDestino() {
		return setorDestino;
	}

	public void setSetorDestino(Setor setorDestino) {
		this.setorDestino = setorDestino;
	}

	public Date getDataRecebido() {
		return dataRecebido;
	}

	public void setDataRecebido(Date dataRecebido) {
		this.dataRecebido = dataRecebido;
	}

	public Date getHoraRecebido() {
		return horaRecebido;
	}

	public void setHoraRecebido(Date horaRecebido) {
		this.horaRecebido = horaRecebido;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}
	
	
	
}
