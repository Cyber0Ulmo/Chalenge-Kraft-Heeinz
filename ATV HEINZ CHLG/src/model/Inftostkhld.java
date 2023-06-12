package model;



public class Inftostkhld {
	 private String fabricaCdIdFabrica;
	 private String dsReport;
	
	 public Inftostkhld() {
		 
	 }
	 
	 public Inftostkhld(String fabricaCdIdFabrica, String dsReport ) {
		 
		 this.fabricaCdIdFabrica = fabricaCdIdFabrica;
		 this.dsReport = dsReport;
	 }
	 
	 public String getFabricaCdIdFabrica() {
		return fabricaCdIdFabrica;
	}
	 public void setFabricaCdIdFabrica(String fabricaCdIdFabrica) {
		this.fabricaCdIdFabrica = fabricaCdIdFabrica;
	}
	 public String getDsReport() {
		return dsReport;
	}
	public void setDsReport(String dsReport) {
		this.dsReport = dsReport;
	}
	 
	public void relatorioAmbiental(int qtAgua, int qtEnergia, String dsMetodo, int cdMetodo) {
			    this.dsReport = "A quantidade de água usada em Litros foi de " + qtAgua + 
			    		", a quantidade de energia usado em KiloWhats kWh" + qtEnergia + 
			    		", o método de cultivo " + dsMetodo + ". ( 0 = dentro das normas e 1 = fora das normas" 
			    		+ cdMetodo;

			    // Implemente a lógica adicional do relatório ambiental aqui, se necessário
			    System.out.println("Relatório Ambiental:");
			    System.out.println("dsReport: " + dsReport);
			}


}
