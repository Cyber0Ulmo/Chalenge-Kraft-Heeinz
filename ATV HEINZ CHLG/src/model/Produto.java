package model;

public class Produto {
	
	 private String cdIdProduto;
	    private String dsProduto;
	    private String dsComposicao;
	    private int qtAgua;
	    private int qtEnergia;
	    private String fabricaCdIdFabrica;
	    private String dsDtProdi;
	    
	    
		public Produto() {
			
		}
		
		public Produto(String cdIdProduto, String dsProduto,String dsComposicao, int qtAgua,
				int qtEnergia,String fabricaCdIdFabrica, String dsDtProdi ) {
			
			this.cdIdProduto = cdIdProduto;
			this.dsProduto = dsProduto;
			this.dsComposicao = dsComposicao;
			this.qtAgua = qtAgua;
			this.qtEnergia = qtEnergia;
			this.fabricaCdIdFabrica = fabricaCdIdFabrica;
			this.dsDtProdi = dsDtProdi;
		}
	    
	    public String getCdIdProduto() {
			return cdIdProduto;
		}
		public void setCdIdProduto(String cdIdProduto) {
			this.cdIdProduto = cdIdProduto;
		}
		public String getDsProduto() {
			return dsProduto;
		}
		public void setDsProduto(String dsProduto) {
			this.dsProduto = dsProduto;
		}
		public String getDsComposicao() {
			return dsComposicao;
		}
		public void setDsComposicao(String dsComposicao) {
			this.dsComposicao = dsComposicao;
		}
		public int getQtAgua() {
			return qtAgua;
		}
		public void setQtAgua(int qtAgua) {
			this.qtAgua = qtAgua;
		}
		public int getQtEnergia() {
			return qtEnergia;
		}
		public void setQtEnergia(int qtEnergia) {
			this.qtEnergia = qtEnergia;
		}
		public String getFabricaCdIdFabrica() {
			return fabricaCdIdFabrica;
		}
		public void setFabricaCdIdFabrica(String fabricaCdIdFabrica) {
			this.fabricaCdIdFabrica = fabricaCdIdFabrica;
		}
		public String getDsDtProdi() {
			return dsDtProdi;
		}
		public void setDsDtProdi(String dsDtProdi) {
			this.dsDtProdi = dsDtProdi;
		}
	    
	    

}
