import java.util.Scanner;

public class App{
    
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Ayam ay = new Ayam();
        Kucing kuc = new Kucing();
        Ikan ik = new Ikan();
        String jenis,warna,hewan;
        int usia;
        System.out.println("Nyari apa mas? (Ayam/Kucing/Ikan) : ");
        hewan = scan.nextLine();
        switch (hewan) {
            case "Ayam":
                System.out.println("Masukkan jenis : ");
                jenis = scan.nextLine();
                System.out.println("Masukkan usia : ");
                usia = scan.nextInt();
                System.out.println("Masukkan warna : ");
                warna = scan.next();
                ay.setJenis(jenis);
                ay.setUsia(usia);
                ay.setWarna(warna);
                System.out.println("====================");
                ay.getAyam();
                System.out.println("====================");
                break;
            case "Kucing":
                System.out.println("Masukkan jenis : ");
                jenis = scan.nextLine();
                System.out.println("Masukkan usia : ");
                usia = scan.nextInt();
                System.out.println("Masukkan warna : ");
                warna = scan.next();
                kuc.setJenis(jenis);
                kuc.setUsia(usia);
                kuc.setWarna(warna);
                System.out.println("====================");
                kuc.getKucing();
                System.out.println("====================");
                break;
            case "Ikan":
                System.out.println("Masukkan jenis : ");
                jenis = scan.nextLine();
                System.out.println("Masukkan usia : ");
                usia = scan.nextInt();
                System.out.println("Masukkan warna : ");
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

