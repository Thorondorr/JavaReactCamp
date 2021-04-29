package intro;

public class Main {
	
	//camelCase
	//Don't repeat yourself
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String internetSubeButton="Ýnternet Þubesi";
		double dolarDun = 8.15;
		double dolarBugun= 8.18;
		int vade = 36;
		boolean dustuMu = false;
		
		System.out.println(internetSubeButton);
		
		if(dolarBugun<dolarDun) {
			dolarDustu();
		}else if(dolarBugun>dolarDun) {
			dolarYukseldi();
		}else {
			dolarEsittir();
		}
		
		String[] krediler = {"Hýzlý kredi","Mutlu emekli kredisi","Konut kredisi","Çiftçi Kredisi",
				"Msb Kredisi","Meb Kredisi"};
		
		//foreach döngüsü
		for(String kredi: krediler) {
			System.out.println(kredi);
		}
		
		for(int i = 0 ; i<krediler.length;i++) {
			System.out.println(krediler[i]);
		}
		
		
		
	
		
	}
	
	public static void stringWriter(String text) {
		System.out.println(text);
	}
	
	public static void dolarDustu () {
		System.out.print("dolar düþtü");
	}
	
	public static void dolarYukseldi() {
		System.out.print("dolar yükseldi");
	}
	public static void dolarEsittir() {
		System.out.print("dolar eþittir");
	}
	
	public static void degerTipler() {
		int sayi1=10;
		int sayi2=20;
		sayi1=sayi2;
		sayi2=100;
		System.out.println(sayi1);
	}
	
	public static void referansTip() {
		int [] sayilar1 = {1,2,3,4,5};
		int [] sayilar2= {10,20,30,40,50};
		sayilar1=sayilar2;
		sayilar2[0]=100;
		System.out.println(sayilar1[0]);
		
	}
	
	public static void sasirtmaliReferansTip() {
		String sehir1 ="Ankara";
		String sehir2="Ýstanbul";
		sehir1 = sehir2;
		sehir2="Ýzmir";
		System.out.println(sehir1); 
		/*stringler char array olarak tutulur fakat yeni nesil programlama dillerinde
		 * kullanýcý bunu deðer tipi gibi atacaðýna kanaaat getirerek referans tip gibi 
		 * direk atar bu yüzden istanbul olur
		 */
	}
}
