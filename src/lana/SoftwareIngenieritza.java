
package lana;

import java.util.ArrayList;

import java.util.Collection;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.*;
import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

public class SoftwareIngenieritza {
	
	private static SoftwareIngenieritza nSoftwareIngenieritza;
	private List<Ikasle> matrikulatuZerr = new ArrayList<>();
	
	private SoftwareIngenieritza(){}
	
	public static SoftwareIngenieritza getSoftwareIngenieritza()
	{
		if(nSoftwareIngenieritza==null){
			nSoftwareIngenieritza = new SoftwareIngenieritza();
		}
		return nSoftwareIngenieritza;
	}
	
	public void addIkasle(Ikasle pIk)
	{
		matrikulatuZerr.add(pIk);
	}
	
	private Iterator<Ikasle> getIterator()
	{
		return matrikulatuZerr.iterator();
	}	
	
	////////////////////////////JAVA8////////////////////////////////
	
	
	//Quintano lo tiene distinto
	public void notaTotalakErakutsi(){
		this.matrikulatuZerr.stream().mapToDouble(Ikasle -> Ikasle.notaFinalaKalkulatu()).forEach(a -> System.out.println(a));
	}
	
	public List<Ikasle> gainditutakoakLortu(){
		return this.matrikulatuZerr.stream().filter(ikasle -> ikasle.notaFinalaKalkulatu()>=5.0).collect(Collectors.toList());	//con Collectors.toList() le conviertes la lista
																																//filtrada en List<Ikasle>
		
	}

	public List<Ikasle> gainditutakoakIzenezOrdenatutaLortu(){
		return this.gainditutakoakLortu().stream().filter(elem->elem.notaFinalaKalkulatu()>=5.0)
				.sorted(Comparator.comparing(Ikasle::getIzen)).collect(Collectors.toList());
	}

	public List<Ikasle> gainditutakoakIzenezAbizenezOrdenatutaLortu(){
		return this.gainditutakoakLortu().stream().filter(elem->elem.notaFinalaKalkulatu()>=5.0).
				sorted(Comparator.comparing(Ikasle::getIzen).thenComparing(Ikasle::getAbizen)).collect(Collectors.toList());
	}
	
	public double gaindituenPortzentaiaLortu(){
		return this.gainditutakoakLortu().stream().count()/matrikulatuZerr.size()*100;
	}

	public List<String> herrialdeakLortu(){
		return this.matrikulatuZerr.stream().distinct().map(Ikasle::getHerrialde).
				collect(Collectors.toList());
	}
	

	public List<Ikasle> entregagarriGuztiakGainditutakoakLortu(){
		return this.matrikulatuZerr.stream().filter(ikasle -> ikasle.entregagarriGuztiakGaindituDitu()).collect(Collectors.toList());
	}
	
	public List<Ikasle> entregagarrianNotaGainditzenDutenIkasleakLortu(double pNota){
		return this.matrikulatuZerr.stream().filter(ikasle -> ikasle.entregagarrietakoBatekNotaGaindituDu(pNota)).collect(Collectors.toList());
	}

	public void ikasleenEstatiskikakInprimatu() {
		var d = this.matrikulatuZerr.stream().
		collect(Collectors.summarizingDouble(Ikasle::notaFinalaKalkulatu));
		
		System.out.println("{\"max\":"+d.getMax()+
				",\"min\":"+d.getMin()+
				",\"average\":"+d.getAverage()+"}");
	}
	
	public Map<Boolean,List<Ikasle>> gaindituakSuspendituakLortu(){
		return this.matrikulatuZerr.stream().collect(Collectors.partitioningBy(s -> s.gaindituDu()));
	}
	
	public Map<String,List<Ikasle>> ikasleakHerrialdekaLortu(){
		return this.matrikulatuZerr.stream().collect(Collectors.groupingBy(s -> s.getHerrialde()));
	}

	public Map<String,Double> batazbestekoNotakHerrialdekaLortu(){
		return this.matrikulatuZerr.stream().collect(Collectors.groupingBy(s -> s.getHerrialde(),
				Collectors.averagingDouble(s -> s.notaFinalaKalkulatu())));
	}

	public Map<String,Ikasle> notaMaximodunIkasleaHerrialdekaLortu(){
		
		return this.matrikulatuZerr.stream()
				.collect(Collectors.groupingBy(
						s -> s.getHerrialde(),
						Collectors.collectingAndThen(
										Collectors.maxBy(Comparator.comparing(Ikasle::notaFinalaKalkulatu)),
										Optional::get)));
		
	}
	
	public Map<String,Double> notaMaximoaHerrialdekaLortu(){
		return this.matrikulatuZerr.stream()
				.collect(Collectors.groupingBy(
						s -> s.getHerrialde(),
						Collectors.collectingAndThen(
										Collectors.maxBy(Comparator.comparing(Ikasle::notaFinalaKalkulatu)),
										g -> g.get().notaFinalaKalkulatu())));
	}

}
