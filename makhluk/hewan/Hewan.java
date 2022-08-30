package makhluk.hewan;

import makhluk.Makhluk;

public class Hewan extends Makhluk {

  @Override
  public void bernafas() {
    System.out.println("Ya, bernafas kalo masih hidup");
  }

  @Override
  public void bergerak() {
    System.out.println("Ya, bisa bergerak kalo masih hidup");
  }

  @Override
  public void suara() {
    System.out.println("Ada suaranya kalo masih hidup");
  }
}
