public class Kucing extends Hewan implements TempatTinggal {
  private String jenis;
  private String warna;
  private int usia;

  Kucing() {
    super();
    this.jenis = "Anggora";
    this.warna = "Pelangi";
    this.usia = 170;
  }

  void getKucing() {
    System.out.println("Jenis : " + this.jenis + "\nUsia : " + this.usia + "\nWarna : " + this.warna);
    tinggal();
    bernafas();
    bergerak();
    suara();
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

  @Override
  public void tinggal() {
    System.out.println("Makhluk darat ni bos");
  }
}
