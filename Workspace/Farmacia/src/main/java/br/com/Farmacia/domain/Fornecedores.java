package br.com.Farmacia.domain;

public class Fornecedores {
	private Long codigo;
	private String descricao; 
	
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	@Override
    public String toString() {
        return "Fornecedores { " +
               "codigo=" + codigo +
               ", descricao='" + descricao + '\'' +
               " }";
    }
}
