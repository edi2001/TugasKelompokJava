public class Ikan extends Hewan implements TempatTinggal {
  private String jenis;
  private String warna;
  private int usia;

  Ikan() {
    super();
    this.jenis = "Anggora";
    this.warna = "Pelangi";
    this.usia = 170;
  }

  void getIkan() {
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
    System.out.println("Makhluk air ni bos");
  }
}
