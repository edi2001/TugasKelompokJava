package makhluk.hewan;

import makhluk.Makhluk;

public class Hewan extends Makhluk {

  @Override
  public void bernafas() {
    System.out.println("> Bernafas kalo hidup");
  }

  @Override
  public void bergerak() {
    System.out.println("> Bergerak kalo masih hidup");
  }

  @Override
  public void suara() {
    System.out.println("> Bisa ngomong juga");
  }
}
