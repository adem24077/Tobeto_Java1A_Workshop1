package intro;

import java.util.Iterator;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Hello world!");
		
		//Değişken isimlendirmeleri Java'da camelCase yazılır.
		String ortaMetin = "İlginizi çekebilir.";
		String altMetin = "Vade süresi";
		
		System.out.println(ortaMetin);
		
		//integer
		int vade = 12;
		
		double dolarDun = 18.25;
		double dolarBugun = 18.30;
		
		boolean dolarDustuMu = false;
		
		String okYonu = "";
		
		if (dolarBugun<dolarDun) { //false
			okYonu = "down.swg";
			System.out.println(okYonu);
		} else if(dolarBugun>dolarDun) {
			okYonu = "up.swg";
			System.out.println(okYonu);
		}
		else {
			okYonu = "equal.swg";
			System.out.println(okYonu);
		}
		
		//array
		
		String[] krediler = {"Hızlı Kredi","Maaşını Halkbanktan","Mutlu Emekli"};
		
		

		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
	}
}
