package intro;

public class Main {
	
	//camelCase
	//Don't repeat yourself
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String internetSubeButton="�nternet �ubesi";
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
		
		String[] krediler = {"H�zl� kredi","Mutlu emekli kredisi","Konut kredisi","�ift�i Kredisi",
				"Msb Kredisi","Meb Kredisi"};
		
		//foreach d�ng�s�
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
		System.out.print("dolar d��t�");
	}
	
	public static void dolarYukseldi() {
		System.out.print("dolar y�kseldi");
	}
	public static void dolarEsittir() {
		System.out.print("dolar e�ittir");
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
		String sehir2="�stanbul";
		sehir1 = sehir2;
		sehir2="�zmir";
		System.out.println(sehir1); 
		/*stringler char array olarak tutulur fakat yeni nesil programlama dillerinde
		 * kullan�c� bunu de�er tipi gibi ataca��na kanaaat getirerek referans tip gibi 
		 * direk atar bu y�zden istanbul olur
		 */
	}
}
