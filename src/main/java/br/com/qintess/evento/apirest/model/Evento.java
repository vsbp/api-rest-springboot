package br.com.qintess.evento.apirest.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_EVENTO")
public class Evento  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String descricao;
	
	@Column(nullable = false)
	private LocalDate data;
	
	@Column(nullable = false)
	private BigDecimal preco;
	
	@Column(nullable = false)
	private Integer limitePessoas;
	
	@Column(nullable = false)
	private String enderecoEvento;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Evento other = (Evento) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (preco == null) {
			if (other.preco != null)
				return false;
		} else if (!preco.equals(other.preco))
			return false;
		if (limitePessoas == null) {
			if (other.limitePessoas != null)
				return false;
		} else if (!limitePessoas.equals(other.limitePessoas))
			return false;
		if (enderecoEvento == null) {
			if (other.enderecoEvento != null)
				return false;
		} else if (!enderecoEvento.equals(other.enderecoEvento))
			return false;
		return true;
	}
	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}


	public Integer getLimitePessoas() {
		return limitePessoas;
	}

	public void setLimitePessoas(Integer limitePessoas) {
		this.limitePessoas = limitePessoas;
	}

	public String getEnderecoEvento() {
		return enderecoEvento;
	}

	public void setEnderecoEvento(String enderecoEvento) {
		this.enderecoEvento = enderecoEvento;
	}

	@Override
	public String toString() {
		return "Evento [id=" + id + ", descricao=" + descricao + ", data=" + data + ", preco=" + preco
				+ ", limitePessoas=" + limitePessoas + ", enderecoEvento=" + enderecoEvento + "]";
	}




	

}
