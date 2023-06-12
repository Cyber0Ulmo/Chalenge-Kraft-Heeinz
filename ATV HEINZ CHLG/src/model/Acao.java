package model;

public class Acao {

	 private String fabricaCdIdFabrica;
	 private String cdAcao;
	 private int qtAcucar;
	 private int qtRefeicao;
		
	    public Acao() {
	    	
	    }
	    
	    public Acao(String fabricaCdIdFabrica , String cdAcao, int qtAcucar, int qtRefeicao ) {
	    	this.fabricaCdIdFabrica = fabricaCdIdFabrica;
	    	this.cdAcao = cdAcao;
	    	this.qtAcucar = qtAcucar;
	    	this.qtRefeicao = qtRefeicao;
	    }

		public String getFabricaCdIdFabrica() {
			return fabricaCdIdFabrica;
		}

		public void setFabricaCdIdFabrica(String fabricaCdIdFabrica) {
			this.fabricaCdIdFabrica = fabricaCdIdFabrica;
		}

		public String getCdAcao() {
			return cdAcao;
		}

		public void setCdAcao(String cdAcao) {
			this.cdAcao = cdAcao;
		}

		public int getQtAcucar() {
			return qtAcucar;
		}

		public void setQtAcucar(int qtAcucar) {
			this.qtAcucar = qtAcucar;
		}

		public int getQtRefeicao() {
			return qtRefeicao;
		}

		public void setQtRefeicao(int qtRefeicao) {
			this.qtRefeicao = qtRefeicao;
		}
	    
	   
	
	    
	    
}

