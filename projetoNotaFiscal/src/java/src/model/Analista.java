package src.model;

public class Analista implements IPersistente{
	private Integer numero;        
	private String descricao;
	private String data_fatura;
	private String data_pagamento;
	private String status;      
        
	public Analista(){
	}        
        
	public Analista(Integer numero, String descricao, String data_fatura, String data_pagamento, String status){
		this.numero = numero;
		this.descricao = descricao;
		this.data_fatura = data_fatura;
		this.data_pagamento = data_pagamento;
		this.status = status;
	}        
          
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData_fatura() {
        return data_fatura;
    }

    public void setData_fatura(String data_fatura) {
        this.data_fatura = data_fatura;
    }

    public String getData_pagamento() {
        return data_pagamento;
    }

    public void setData_pagamento(String data_pagamento) {
        this.data_pagamento = data_pagamento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }	
}