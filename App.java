import java.util.Scanner;

public class App{
    
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Ayam ay = new Ayam();
        Kucing kuc = new Kucing();
        Ikan ik = new Ikan();
        String jenis,warna,hewan;
        int usia;
        System.out.print("Nyari apa mas? (Ayam/Kucing/Ikan) : ");
        hewan = scan.nextLine().toLowerCase();
        switch (hewan) {
            case "ayam":
                System.out.print("Masukkan jenis : ");
                jenis = scan.nextLine();
                System.out.print("Masukkan usia : ");
                usia = scan.nextInt();
                System.out.print("Masukkan warna : ");
                warna = scan.next();
                ay.setJenis(jenis);
                ay.setUsia(usia);
                ay.setWarna(warna);
                System.out.println("====================");
                ay.getAyam();
                System.out.println("====================");
                break;
            case "kucing":
                System.out.print("Masukkan jenis : ");
                jenis = scan.nextLine();
                System.out.print("Masukkan usia : ");
                usia = scan.nextInt();
                System.out.print("Masukkan warna : ");
                warna = scan.next();
                kuc.setJenis(jenis);
                kuc.setUsia(usia);
                kuc.setWarna(warna);
                System.out.println("====================");
                kuc.getKucing();
                System.out.println("====================");
                break;
            case "ikan":
                System.out.print("Masukkan jenis : ");
                jenis = scan.nextLine();
                System.out.print("Masukkan usia : ");
                usia = scan.nextInt();
                System.out.print("Masukkan warna : ");
                warna = scan.next();
                ik.setJenis(jenis);
                ik.setUsia(usia);
                ik.setWarna(warna);
                System.out.println("====================");
                ik.getIkan();
                System.out.println("====================");
                break;
            default:
                System.out.println("Nggak ada mas :')");
                break;
        }
    }
}

