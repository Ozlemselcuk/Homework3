//32 değerini içeren düğümü silen fonksiyon
public class 3.soru {
    public class IkiliAramaAgaci {
    
    
        public void dugumSil(int veri) {
            kok = dugumSilRecursive(kok, veri);
        }
    
        private Dugum dugumSilRecursive(Dugum dugum, int veri) {
            if (dugum == null) {
                return dugum;
            }
    
            if (veri < dugum.veri) {
                dugum.sol = dugumSilRecursive(dugum.sol, veri);
            } else if (veri > dugum.veri) {
                dugum.sag = dugumSilRecursive(dugum.sag, veri);
            } else {
                // İstenilen düğüm bulundu
                if (dugum.sol == null) {
                    return dugum.sag;
                } else if (dugum.sag == null) {
                    return dugum.sol;
                }
    
                // İki çocuğu olan düğümün silinmesi durumu
                dugum.veri = enKucukDugum(dugum.sag).veri;
                dugum.sag = dugumSilRecursive(dugum.sag, dugum.veri);
            }
    
            return dugum;
        }
    
        private Dugum enKucukDugum(Dugum dugum) {
            Dugum current = dugum;
            while (current.sol != null) {
                current = current.sol;
            }
            return current;
        }
    
        public static void main(String[] args) {
        
    
            int silinecekDeger = 32;
            agac.dugumSil(silinecekDeger);
    
            System.out.print("Preorder çiktisi (32 silindi): ");
            agac.preorder();
        }
    }
    //Bu kodda, dugumSil adında bir fonksiyon tanımlandı. İlk olarak, silinecek değer ağaçta aranır ve bulunur.
     //Daha sonra, silinecek düğümün farkli durumlari ele alinir.
    
}
