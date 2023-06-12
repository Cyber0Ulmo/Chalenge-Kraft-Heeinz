package model;

public class Fornecedor {
	
	 private String cdId;
	 private String nmDs;
	 private String dsCnpj;
	 private String fabricaCdIdFabrica;
	
	 public Fornecedor() {
		 
	 }
	 
	 public Fornecedor(String cdId, String nmDs, String dsCnpj, String fabricaCdIdFabrica  ) {
		 this.cdId = cdId;
		 this.nmDs = nmDs;
		 this.dsCnpj = dsCnpj;
		 this.fabricaCdIdFabrica = fabricaCdIdFabrica;
	 }
	 
	 public String getCdId() {
		return cdId;
	}
	public void setCdId(String cdId) {
		this.cdId = cdId;
	}
	public String getNmDs() {
		return nmDs;
	}
	public void setNmDs(String nmDs) {
		this.nmDs = nmDs;
	}
	public String getDsCnpj() {
		return dsCnpj;
	}
	public void setDsCnpj(String dsCnpj) {
		this.dsCnpj = dsCnpj;
	}
	public String getFabricaCdIdFabrica() {
		return fabricaCdIdFabrica;
	}
	public void setFabricaCdIdFabrica(String fabricaCdIdFabrica) {
		this.fabricaCdIdFabrica = fabricaCdIdFabrica;
	}
	    
	    

}
