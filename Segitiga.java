/**
 * Created by Maudy on 19/05/2015.
 */
public class Segitiga {
    int tinggi;
    int alas;
    int sisimiring;

    public void cetakkelayar(){
        System.out.println("Alas:"+alas);
        System.out.println("Tinggi:"+tinggi);
        System.out.println("Sisimiring:"+sisimiring);
    }
    public double hitungluas(){
        double luas;
        luas=((0.5)*alas*tinggi);
        return luas;
    }
    public int hitungkeliling(){
        int keliling;
        keliling=(alas+sisimiring+sisimiring);
        return keliling;
    }
}
