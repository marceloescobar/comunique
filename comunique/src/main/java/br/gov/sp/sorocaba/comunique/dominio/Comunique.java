package br.gov.sp.sorocaba.comunique.dominio;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "comunique")
public class Comunique {

	@Id
	@Column(name = "id")
	private Integer id;
	
	@ManyToOne
    @JoinColumn(name="tramitacao_id", nullable = false)
	private Tramitacao tramitacao;
	

	@Column(name = "comunicado")
	private String comunicado;

	@Column(name="datacadastro")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCadastro;
	
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

	public Tramitacao getTramitacao() {
		return tramitacao;
	}

	public void setTramitacao(Tramitacao tramitacao) {
		this.tramitacao = tramitacao;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	

}
