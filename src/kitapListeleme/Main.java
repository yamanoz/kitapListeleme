package kitapListeleme;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<kitap> kitapListesi=new ArrayList<>();
		kitapListesi.add(new kitap("kitap 1",12,"yazar 1","10.12.1994"));
		kitapListesi.add(new kitap("kitap 2",22,"yazar 2","10.12.1994"));
		kitapListesi.add(new kitap("kitap 3",302,"yazar 3","10.12.1994"));
		kitapListesi.add(new kitap("kitap 4",42,"yazar 4","10.12.1994"));
		kitapListesi.add(new kitap("kitap 5",52,"yazar 5","10.12.1994"));
		kitapListesi.add(new kitap("kitap 6",262,"yazar 6","10.12.1994"));
		kitapListesi.add(new kitap("kitap 7",72,"yazar 7","10.12.1994"));
		kitapListesi.add(new kitap("kitap 8",82,"yazar 8","10.12.1994"));
		kitapListesi.add(new kitap("kitap 9",502,"yazar 9","10.12.1994"));
		kitapListesi.add(new kitap("kitap 10",112,"yazar 10","10.12.1994"));
		
		Map<String,String> yeniKitap=new HashMap<>();
		kitapListesi.stream().forEach(i->yeniKitap.put(i.getName(), i.getYazar()));
		System.out.println("Tüm kitap ve yazarlar");
		for(String name: yeniKitap.keySet()) {
			System.out.println(name+"  "+yeniKitap.get(name));
		}
		
		System.out.println("  -----------------------------      ");
		
		List<kitap> filterkitapListesi=kitapListesi.stream().filter(i->i.getSayi()>100).collect(Collectors.toList());
		filterkitapListesi.stream().forEach(i->System.out.println(
				"Yazar :"+i.getYazar()+
				"\n Kitap :"+i.getName()+
				"\n Sayi :"+i.getSayi()));
		
		
		
		
		
		
		
		
		
		
		
	}

}
