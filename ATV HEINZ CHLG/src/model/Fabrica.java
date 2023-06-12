package model;

public class Fabrica {
	
	  private String cdIdFabrica;
	  private String dsLocal;
	
	  public Fabrica() {
		  
	  }
	  
	  public Fabrica(String cdIdFabrica, String dsLocal) {
		  
		  this.cdIdFabrica = cdIdFabrica;
		  this.dsLocal = dsLocal;
	  }
	  
	  public String getCdIdFabrica() {
		return cdIdFabrica;
	}
	public void setCdIdFabrica(String cdIdFabrica) {
		this.cdIdFabrica = cdIdFabrica;
	}
	public String getDsLocal() {
		return dsLocal;
	}
	public void setDsLocal(String dsLocal) {
		this.dsLocal = dsLocal;
	}

	  
	  
}
