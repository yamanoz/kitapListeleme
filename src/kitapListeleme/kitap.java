package kitapListeleme;

public class kitap {
	
	private String name;
	private int sayi;
	private String yazar;
	private String tarih;
	
	
	public kitap(String name,int sayi,String yazar,String tarih) {
		this.name=name;
		this.sayi=sayi;
		this.yazar=yazar;
		this.tarih=tarih;
		
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}

	public int getSayi() {
		return sayi;
	}

	public void setSayi(int sayi) {
		this.sayi = sayi;
	}

	public String getYazar() {
		return yazar;
	}

	public void setYazar(String yazar) {
		this.yazar = yazar;
	}

	public String getTarih() {
		return tarih;
	}

	public void setTarih(String tarih) {
		this.tarih = tarih;
	}

}
