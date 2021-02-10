
package lana;

import java.util.List;
import java.util.Map;


public class Nagusia {

	public static void main(String[] args) {
		/////////// 1. ikaslea
		Entregagarri e11 = new Entregagarri("Entregagarri1");
		e11.setUrl("Erantzuna 1");
		e11.setNota(5.4);
		
		Entregagarri e12 = new Entregagarri("Entregagarri2");
		e12.setUrl("Erantzuna 2");
		e12.setNota(6.8);
		
		Entregagarri e13 = new Entregagarri("Entregagarri3");
		e13.setUrl("Erantzuna 3");
		e13.setNota(4.6);
		
		Ikasle a1 = new Ikasle("Markel", "Alberdi" , "markel@ehu.eus", "Espainia");
		a1.setNota(2.5);
		a1.addEntregagarri(e11);
		a1.addEntregagarri(e12);
		a1.addEntregagarri(e13);
		
		/////////// 2. ikaslea	
		Entregagarri e21 = new Entregagarri("Entregagarri1");
		e21.setUrl("Erantzuna 1");
		e21.setNota(6.0);
		
		Entregagarri e22 = new Entregagarri("Entregagarri2");
		e22.setUrl("Erantzuna 2");
		e22.setNota(9.3);
		
		Entregagarri e23 = new Entregagarri("Entregagarri3");
		e23.setUrl("Erantzuna 3");
		e23.setNota(5.6);
		
		Ikasle a2 = new Ikasle("Maria", "Vaquero", "maria@ehu.eus", "Espainia");
		a2.setNota(5.5);
		a2.addEntregagarri(e21);
		a2.addEntregagarri(e22);
		a2.addEntregagarri(e23);
		/////////// 3. ikaslea
		Entregagarri e31 = new Entregagarri("Entregagarri1");
		e31.setUrl("Erantzuna 1");
		e31.setNota(4.0);
		
		Entregagarri e32 = new Entregagarri("Entregagarri2");
		e32.setUrl("Erantzuna 2");
		e32.setNota(5.3);
		
		Entregagarri e33 = new Entregagarri("Entregagarri3");
		e33.setUrl("Erantzuna 3");
		e33.setNota(5.6);
		
		Ikasle a3 = new Ikasle("Garazi", "Bikandi", "garazi@ehu.eus", "Espainia");
		a3.setNota(3.5);
		a3.addEntregagarri(e31);
		a3.addEntregagarri(e32);
		a3.addEntregagarri(e33);		
		/////////// 4. ikaslea
		Entregagarri e41 = new Entregagarri("Entregagarri1");
		e41.setUrl("Erantzuna 1");
		e41.setNota(7.0);
		
		Entregagarri e42 = new Entregagarri("Entregagarri2");
		e42.setUrl("Erantzuna 2");
		e42.setNota(5.3);
		
		Entregagarri e43 = new Entregagarri("Entregagarri3");
		e43.setUrl("Erantzuna 3");
		e43.setNota(5.6);
		
		Ikasle a4 = new Ikasle("Pedro", "Aragon", "pedro@ehu.eus", "Francia");
		a4.setNota(7.5);
		a4.addEntregagarri(e41);
		a4.addEntregagarri(e42);
		a4.addEntregagarri(e43);
		/////////// 5. ikaslea
		Entregagarri e51 = new Entregagarri("Entregagarri1");
		e51.setUrl("Erantzuna 1");
		e51.setNota(7.0);
		
		Entregagarri e52 = new Entregagarri("Entregagarri2");
		e52.setUrl("Erantzuna 2");
		e52.setNota(8.3);
		
		Entregagarri e53 = new Entregagarri("Entregagarri3");
		e53.setUrl("Erantzuna 3");
		e53.setNota(2.6);
		
		Ikasle a5 = new Ikasle("Angel", "Alonso", "angel@ehu.eus", "Portugal");
		a5.setNota(6.8);
		a5.addEntregagarri(e51);
		a5.addEntregagarri(e52);
		a5.addEntregagarri(e53);
		/////////// 6. ikaslea
		Entregagarri e61 = new Entregagarri("Entregagarri1");
		e61.setUrl("Erantzuna 1");
		e61.setNota(7.0);
		
		Entregagarri e62 = new Entregagarri("Entregagarri2");
		e62.setUrl("Erantzuna 2");
		e62.setNota(5.3);
		
		Entregagarri e63 = new Entregagarri("Entregagarri3");
		e63.setUrl("Erantzuna 3");
		e63.setNota(2.6);
		
		Ikasle a6 = new Ikasle("Irati", "Alberdi", "irati@ehu.eus", "Portugal");
		a6.setNota(3.7);
		a6.addEntregagarri(e61);
		a6.addEntregagarri(e62);
		a6.addEntregagarri(e63);
		////////////////////////////////		
		/////////// IKASGAIA ///////////
		////////////////////////////////
		SoftwareIngenieritza nSI = SoftwareIngenieritza.getSoftwareIngenieritza();
		nSI.addIkasle(a1);
		nSI.addIkasle(a2);
		nSI.addIkasle(a3);
		nSI.addIkasle(a4);
		nSI.addIkasle(a5);
		nSI.addIkasle(a6);
		

		////////////JAVA8///////////
		
		
		/*******TODO********
		//Zerrenda normala dugunean
		nZ.forEach(System.out::println)
		//MAP dugunean
		mapZ.forEach((key,value) -> System.out.printf("key: %s, value: %f\n", key, value));
		*******************/
		
		
		/**************************************************************************************
		 * IKASLEA
		 **************************************************************************************/
		
		System.out.println("IKASLEA1");
		System.out.println("Ikasle klasearen gaindituDu() metodoa");
		System.out.println("false -------"+a1.gaindituDu());
		
		System.out.println("Ikasle klasearen entregagarrienNotaKalkulatu() metodoa");
		System.out.println("5.6 ---------"+a1.entregagarrienNotaKalkulatu());
		
		System.out.println("Ikasle klasearen notaFinalaKalkulatu() metodoa");
		System.out.println("3.74 --------"+a1.notaFinalaKalkulatu());
		
		System.out.println("Ikasle klasearen entregagarriGuztiakGaindituDitu() metodoa");
		System.out.println("false -------"+a1.entregagarriGuztiakGaindituDitu());
		
		System.out.println("Ikasle klasearen entregagarrietakoBatekNotaGaindituDu(4.0) metodoa");
		System.out.println("true -------"+a1.entregagarrietakoBatekNotaGaindituDu(4.0));
		System.out.println("\n");
		
		
		System.out.println("IKASLEA2");
		System.out.println("Ikasle klasearen gaindituDu() metodoa");
		System.out.println("false -------"+a2.gaindituDu());
		
		System.out.println("Ikasle klasearen entregagarrienNotaKalkulatu() metodoa");
		System.out.println("6.966666666666666---------"+a2.entregagarrienNotaKalkulatu());
		
		System.out.println("Ikasle klasearen notaFinalaKalkulatu() metodoa");
		System.out.println("6.086666666666666 --------"+a2.notaFinalaKalkulatu());
		
		System.out.println("Ikasle klasearen entregagarriGuztiakGaindituDitu() metodoa");
		System.out.println("true -------"+a2.entregagarriGuztiakGaindituDitu());
		
		System.out.println("Ikasle klasearen entregagarrietakoBatekNotaGaindituDu(4.0) metodoa");
		System.out.println("true -------"+a2.entregagarrietakoBatekNotaGaindituDu(4.0));
		System.out.println("\n");
		
		
		
		System.out.println("IKASLEA3");
		System.out.println("Ikasle klasearen gaindituDu() metodoa");
		System.out.println("false -------"+a3.gaindituDu());
		
		System.out.println("Ikasle klasearen entregagarrienNotaKalkulatu() metodoa");
		System.out.println("4.966666666666666 ---------"+a3.entregagarrienNotaKalkulatu());
		
		System.out.println("Ikasle klasearen notaFinalaKalkulatu() metodoa");
		System.out.println("4.086666666666666 --------"+a3.notaFinalaKalkulatu());
		
		System.out.println("Ikasle klasearen entregagarriGuztiakGaindituDitu() metodoa");
		System.out.println("false -------"+a3.entregagarriGuztiakGaindituDitu());
		
		System.out.println("Ikasle klasearen entregagarrietakoBatekNotaGaindituDu(4.0) metodoa");
		System.out.println("true -------"+a3.entregagarrietakoBatekNotaGaindituDu(4.0));
		System.out.println("\n");
		
		
		
		/**************************************************************************************
		 * SOFTWARE INGENIERITZA
		 **************************************************************************************/
		
		System.out.println("SoftwareIngeniaritza klasearen notaTotalakErakutsi() metodoa");
		System.out.println("3.74\n"
				+ "6.086666666666666\n"
				+ "4.086666666666666\n"
				+ "6.886666666666667\n"
				+ "6.466666666666667\n"
				+ "4.206666666666667");
		System.out.println("--------------------");
		nSI.notaTotalakErakutsi();
		
		
		System.out.println("SoftwareIngeniaritza klasearen gainditutakoakIzenezOrdenatutaLortu() metodoa");
		System.out.println("Izen-abizenak: Angel Alonso, eposta: angel@ehu.eus\n"
				+ "Izen-abizenak: Maria Vaquero, eposta: maria@ehu.eus\n"
				+ "Izen-abizenak: Pedro Aragon, eposta: pedro@ehu.eus");
		System.out.println("------------------------------------------------------------------------------");
		for(Ikasle i:nSI.gainditutakoakIzenezOrdenatutaLortu()) {
			System.out.println(i);
		}
		
		System.out.println("SoftwareIngeniaritza klasearen gainditutakoakIzenezAbizenezOrdenatutaLortu() metodoa");
		System.out.println("Izen-abizenak: Angel Alonso, eposta: angel@ehu.eus\n"
				+ "Izen-abizenak: Maria Vaquero, eposta: maria@ehu.eus\n"
				+ "Izen-abizenak: Pedro Aragon, eposta: pedro@ehu.eus");
		System.out.println("------------------------------------------------------------------------------");
		for(Ikasle i:nSI.gainditutakoakIzenezAbizenezOrdenatutaLortu()) {
			System.out.println(i);
		}
		
		
		System.out.println("SoftwareIngeniaritza klasearen gaindituenPorzentaiaLortu() metodoa");
		System.out.println("50.0 ------------------"+nSI.gaindituenPortzentaiaLortu());
		
		System.out.println("SoftwareIngeniaritza klasearen herrialdeakLortu() metodoa");
		System.out.println("[Espainia, Francia, Portugal] -----------"+nSI.herrialdeakLortu());
		
		System.out.println("SoftwareIngeniaritza klasearen entregagarriGuztiakGainditutakoakLortu() metodoa");
		System.out.println("Izen-abizenak: Maria Vaquero, eposta: maria@ehu.eus\n" + 
				"Izen-abizenak: Pedro Aragon, eposta: pedro@ehu.eus");
		System.out.println("------------------------------------------------------------------------------");
		for(Ikasle i:nSI.entregagarriGuztiakGainditutakoakLortu()) {
			System.out.println(i);
		}
		
		System.out.println("SoftwareIngeniaritza klasearen entregagarrianNotaGainditzenDutenIkasleakLortu() metodoa");
		System.out.println("Izen-abizenak: Maria Vaquero, eposta: maria@ehu.eus\n" + 
				"Izen-abizenak: Angel Alonso, eposta: angel@ehu.eus");
		System.out.println("------------------------------------------------------------------------------");
		for(Ikasle i:nSI.entregagarrianNotaGainditzenDutenIkasleakLortu(7.0)) {
			System.out.println(i);
		}
		
		System.out.println("SoftwareIngeniaritza klasearen ikasleenEstatiskikakInprimatu() metodoa");
		System.out.println("{\"max\":6.886666666666667,\"min\":3.74,\"average\":5.245555555555556}");
		System.out.println("------------------------------------------------------------------------------");
		nSI.ikasleenEstatiskikakInprimatu();
		
		System.out.println("SoftwareIngeniaritza klasearen gaindituakSuspendituakLortu() metodoa");
		System.out.println("Nota: suspentso\n"
				+ "Lista: Izen-abizenak: Markel Alberdi, eposta: markel@ehu.eus\n"
				+ "Lista: Izen-abizenak: Garazi Bikandi, eposta: garazi@ehu.eus\n"
				+ "Lista: Izen-abizenak: Irati Alberdi, eposta: irati@ehu.eus\n"
				+ "Nota: aprobatua\n"
				+ "Lista: Izen-abizenak: Maria Vaquero, eposta: maria@ehu.eus\n"
				+ "Lista: Izen-abizenak: Pedro Aragon, eposta: pedro@ehu.eus\n"
				+ "Lista: Izen-abizenak: Angel Alonso, eposta: angel@ehu.eus");
		System.out.println("------------------------------------------------------------------------------");
		
		for(boolean i:nSI.gaindituakSuspendituakLortu().keySet()) {
			if(i==false)
				System.out.println("Nota: suspentso");
			else {
				System.out.println("Nota: aprobatua");
			}
			
			for(int j=0;j<nSI.gaindituakSuspendituakLortu().get(i).size();j++) {
				System.out.println("Lista: "+nSI.gaindituakSuspendituakLortu().get(i).get(j));
			}
		}
		
		System.out.println("SoftwareIngeniaritza klasearen ikasleakHerrialdekaLortu() metodoa");
		System.out.println("Espainia: Garazi Bikandi,Maria Vaquero, Markel Alberdi\n"
				+ "Francia: Pedro Aragon\n"
				+ "Portugal: Angel Alonso,Irati Alberdi");
		System.out.println("------------------------------------------------------------------------------");
		
		for(String i:nSI.ikasleakHerrialdekaLortu().keySet()) {
			for(int j=0;j<nSI.ikasleakHerrialdekaLortu().get(i).size();j++) {
				System.out.println("Herrialdea: "+i+" Ikasleak: "+nSI.ikasleakHerrialdekaLortu().get(i).get(j));
			}
		}
		
		
		System.out.println("SoftwareIngeniaritza klasearen batazbestekoNotakHerrialdekaLortu() metodoa");
		System.out.println("Francia=6.886666666666667, Espainia=4.637777777777777, Portugal=5.336666666666667");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println(nSI.batazbestekoNotakHerrialdekaLortu());
		
		System.out.println("SoftwareIngeniaritza klasearen notaMaximodunIkasleaHerrialdekaLortu() metodoa");
		System.out.println("Francia=Pedro Aragon, Espainia=Maria Vaquero, Portugal=Angel Alonso");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println(nSI.notaMaximodunIkasleaHerrialdekaLortu());
		
		System.out.println("SoftwareIngeniaritza klasearen notaMaximoaHerrialdekaLortu() metodoa");
		System.out.println("Francia=6.886666666666667, Espainia=6.086666666666666, Portugal=6.466666666666667");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println(nSI.notaMaximoaHerrialdekaLortu());
		
	}

}
