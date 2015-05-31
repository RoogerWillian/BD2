package br.com.planocontas.modelo;

public class Subconta {
	
	private Long id;
	private String descricao;
	private Integer codigo;
	private String permissao;
	private Conta conta;
	private Subconta subconta;

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

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getPermissao() {
		return permissao;
	}

	public void setPermissao(String permissao) {
		this.permissao = permissao;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public Subconta getSubconta() {
		return subconta;
	}

	public void setSubconta(Subconta subconta) {
		this.subconta = subconta;
	}
}
