package br.gov.sp.sorocaba.comunique.dominio;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name = "comunique")
public class Comunique extends BaseEntity<Integer>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	
	@Column(name = "status")
	private Boolean status;
	
	@ManyToOne
    @JoinColumn(name="usuario_id", nullable = false)
	private Usuario usuario;
	
	
	@Transient
	private MultipartFile comuniqueFile;
	

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

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public MultipartFile getComuniqueFile() {
		return comuniqueFile;
	}

	public void setComuniqueFile(MultipartFile comuniqueFile) {
		this.comuniqueFile = comuniqueFile;
	}
	
	
	
}
