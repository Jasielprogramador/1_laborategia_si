package lana;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.*;

public class Ikasle {

	private String izen;
	private String abizen;
	private String eposta;
	private double azterketaNota;
	private String herrialde;
	private List<Entregagarri> entregagarriZerr = new ArrayList<Entregagarri>() ;

	public Ikasle(String pIzen, String pAbizen, String pEposta,  String pHerrialde)
	{
		izen = pIzen;
		abizen = pAbizen;
		eposta = pEposta;
		herrialde = pHerrialde;
		
	}
	/////GETTERRAK//////
	
	public String getIzen(){return izen;}
	public String getAbizen(){return abizen;}
	public String getHerrialde(){return herrialde;}
	
	
	///////////////////	
	
	public void addEntregagarri(Entregagarri pEnt){
		entregagarriZerr.add(pEnt);
	}
	
	public void setNota(double pNota) {
		azterketaNota = pNota;
	}
	
	public String toString(){
		return "Izen-abizenak: " + izen + " " + abizen + ", eposta: " + eposta; 
	}
	
	////////////////////////////JAVA8////////////////////////////////	
	
	
	public boolean gaindituDu() {
		return notaFinalaKalkulatu() >= 5.0;
	}
	 
	public double entregagarrienNotaKalkulatu(){
		return this.entregagarriZerr.stream().mapToDouble(
				Entregagarri::getNota).average().orElse(0.0);
	}
	
	public double notaFinalaKalkulatu(){
		return (0.4*this.entregagarrienNotaKalkulatu())+(0.6*this.azterketaNota);
	}
	
	public boolean entregagarriGuztiakGaindituDitu(){
		return this.entregagarriZerr.stream().allMatch(Entregagarri -> Entregagarri.getNota()>=5);
	}
	
	
	public boolean entregagarrietakoBatekNotaGaindituDu(double pNota){
		return this.entregagarriZerr.stream().anyMatch(Entregagarri -> Entregagarri.getNota()>pNota);
	}
	
	
}
