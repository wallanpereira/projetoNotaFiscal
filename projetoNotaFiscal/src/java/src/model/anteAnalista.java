package src.model;

public class anteAnalista implements IPersistente{
        private Integer numero;
	private String data_pagamento;
        private String solicitar;
	private String status;   
        
	public anteAnalista(){
	}        
        
	public anteAnalista(Integer numero, String data_pagamento,String solicitar, String status){
		this.numero = numero;
		this.data_pagamento = data_pagamento;
                this.solicitar = solicitar;
		this.status = status;
	}

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getData_pagamento() {
        return data_pagamento;
    }

    public void setData_pagamento(String data_pagamento) {
        this.data_pagamento = data_pagamento;
    }

    public String getSolicitar() {
        return solicitar;
    }

    public void setSolicitar(String solicitar) {
        this.solicitar = solicitar;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status){
        this.status = status;
    }
}
