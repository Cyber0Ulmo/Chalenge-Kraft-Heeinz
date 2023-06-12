package model;

public class Insumo {
	
	private String cdIdInsumo;
    private String dsInsumo;
    private int qtInsumo;
    private String dsDt;
    private String dsMetodo;
    private int cdMetodo;
    private String fornecedorCdId;
	
    public Insumo() {
    	
    }
    
    public Insumo(String cdIdInsumo, String dsInsumo, int qtInsumo, String dsDt, String dsMetodo,
    		int cdMetodo, String fornecedorCdId) {
    	
    this.cdIdInsumo = cdIdInsumo;
    this.dsInsumo = dsInsumo;
    this.qtInsumo = qtInsumo;
    this.dsDt = dsDt;
    this.dsMetodo = dsMetodo;
    this.cdMetodo = cdMetodo;
    this.fornecedorCdId = fornecedorCdId;
   
    }
    
    public String getCdIdInsumo() {
		return cdIdInsumo;
	}
	public void setCdIdInsumo(String cdIdInsumo) {
		this.cdIdInsumo = cdIdInsumo;
	}
	public String getDsInsumo() {
		return dsInsumo;
	}
	public void setDsInsumo(String dsInsumo) {
		this.dsInsumo = dsInsumo;
	}
	public int getQtInsumo() {
		return qtInsumo;
	}
	public void setQtInsumo(int qtInsumo) {
		this.qtInsumo = qtInsumo;
	}
	public String getDsDt() {
		return dsDt;
	}
	public void setDsDt(String dsDt) {
		this.dsDt = dsDt;
	}
	public String getDsMetodo() {
		return dsMetodo;
	}
	public void setDsMetodo(String dsMetodo) {
		this.dsMetodo = dsMetodo;
	}
	public int getCdMetodo() {
		return cdMetodo;
	}
	public void setCdMetodo(int cdMetodo) {
		this.cdMetodo = cdMetodo;
	}
	public String getFornecedorCdId() {
		return fornecedorCdId;
	}
	public void setFornecedorCdId(String fornecedorCdId) {
		this.fornecedorCdId = fornecedorCdId;
	}
    
    

}
