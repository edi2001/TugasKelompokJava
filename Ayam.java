public class Ayam extends Hewan implements TempatTinggal {
  private String jenis;
  private String warna;
  private int usia;

  Ayam() {
    super();
    this.jenis = "Kampung";
    this.usia = 150;
    this.warna = "Pink";

  }

  void suara() {
    System.out.println("AWOKWOKAOAK");
  }

  void getAyam() {
    System.out.println("Jenis : " + this.jenis + "\nUsia : " + this.usia + "\nWarna : " + this.warna);
    tinggal();
  }

  String setJenis(String jenisBaru) {
    return this.jenis = jenisBaru;
  }

  String setWarna(String warnaBaru) {
    return this.warna = warnaBaru;
  }

  int setUsia(int usiaBaru) {
    return this.usia = usiaBaru;
  }

  public void tinggal() {
    System.out.println("Makhluk darat ni bos");
  }
}
