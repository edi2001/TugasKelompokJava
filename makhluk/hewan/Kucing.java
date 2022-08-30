package makhluk.hewan;

public class Kucing extends Hewan implements TempatTinggal {
  private String jenis;
  private String warna;
  private int usia;

  public Kucing() {
    super();
    this.jenis = "Anggora";
    this.warna = "Pelangi";
    this.usia = 170;
  }

  public void getKucing() {
    System.out.println("Jenis : " + this.jenis + "\nUsia : " + this.usia + "\nWarna : " + this.warna);
    tinggal();
    bernafas();
    bergerak();
    suara();
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
