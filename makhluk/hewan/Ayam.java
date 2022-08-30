package makhluk.hewan;

public class Ayam extends Hewan implements TempatTinggal {
  private String jenis;
  private String warna;
  private int usia;

  public Ayam() {
    super();
    this.jenis = "Kampung";
    this.usia = 150;
    this.warna = "Pink";

  }

  @Override
  public void suara() {
    System.out.println("AWOKWOKAOAK");
  }

  public void getAyam() {
    System.out.println("Jenis : " + this.jenis + "\nUsia : " + this.usia + "\nWarna : " + this.warna);
    tinggal();
    bernafas();
    bergerak();
    suara();
  }

  // Contoh Overload method
  public void getAyam(String jenis) {
    System.out.println("Jenis : " + jenis + "\nUsia : " + this.usia + "\nWarna : " + this.warna);
    tinggal();
  }

  public String setJenis(String jenisBaru) {
    return this.jenis = jenisBaru;
  }

  public String setWarna(String warnaBaru) {
    return this.warna = warnaBaru;
  }

  public int setUsia(int usiaBaru) {
    return this.usia = usiaBaru;
  }

  @Override
  public void tinggal() {
    System.out.println("Makhluk darat ni bos");
  }
}
