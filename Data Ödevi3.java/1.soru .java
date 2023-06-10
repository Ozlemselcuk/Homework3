public class 1.soru{
    import java.util.ArrayList;
import java.util.List;

// İkili Ağaç Yapısı - Binary Tree
class Dugum {
    int veri;
    Dugum sol, sag;

    public Dugum(int eleman) {
        veri = eleman;
        sol = sag = null;
    }
}

public class IkiliAgac {
    Dugum kok;

    // Yeni bir düğümü ağaca eklemek için kullanılan yardımcı metot
    private Dugum dugumEkle(Dugum kok, int veri) {
        if (kok == null) {
            kok = new Dugum(veri);
            return kok;
        }

        if (veri < kok.veri)
            kok.sol = dugumEkle(kok.sol, veri);
        else if (veri > kok.veri)
            kok.sag = dugumEkle(kok.sag, veri);

        return kok;
    }

    // Preorder gezinme
    private void preorderYardimci(Dugum dugum, List<Integer> sonuc) {
        if (dugum != null) {
            sonuc.add(dugum.veri);
            preorderYardimci(dugum.sol, sonuc);
            preorderYardimci(dugum.sag, sonuc);
        }
    }

    // Preorder gezinme sonucunu döndüren fonksiyon
    public List<Integer> preorderYazdir() {
        List<Integer> sonuc = new ArrayList<>();
        preorderYardimci(kok, sonuc);
        return sonuc;
    }

    public static void main(String[] args) {
        IkiliAgac agac = new IkiliAgac();

        // Ağaç yapısını oluşturma
        agac.kok = agac.dugumEkle(agac.kok, 70);
        agac.kok = agac.dugumEkle(agac.kok, 45);
        agac.kok = agac.dugumEkle(agac.kok, 32);
        agac.kok = agac.dugumEkle(agac.kok, 21);
        agac.kok = agac.dugumEkle(agac.kok, 13);
        agac.kok = agac.dugumEkle(agac.kok, 27);
        agac.kok = agac.dugumEkle(agac.kok, 40);
        agac.kok = agac.dugumEkle(agac.kok, 56);
        agac.kok = agac.dugumEkle(agac.kok, 46);
        agac.kok = agac.dugumEkle(agac.kok, 68);
        agac.kok = agac.dugumEkle(agac.kok, 87);
        agac.kok = agac.dugumEkle(agac.kok, 77);
        agac.kok = agac.dugumEkle(agac.kok, 73);
        agac.kok = agac.dugumEkle(agac.kok, 80);
        agac.kok = agac.dugumEkle(agac.kok, 79);
        agac.kok = agac.dugum
}