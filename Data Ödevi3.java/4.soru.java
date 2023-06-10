//Level Order  dolaşımı, ağacın düğümlerini seviyelerine göre soldan sağa doğru gezerek dolaşmayı sağlar

public class 4.soru {
    import java.util.LinkedList;
import java.util.Queue;

public class IkiliAramaAgaci {

    public void levelOrder() {
        if (kok == null) {
            return;
        }

        Queue<Dugum> queue = new LinkedList<>();
        queue.add(kok);

        while (!queue.isEmpty()) {
            Dugum current = queue.poll();
            System.out.print(current.veri + " ");

            if (current.sol != null) {
                queue.add(current.sol);
            }
            if (current.sag != null) {
                queue.add(current.sag);
            }
        }
    }

    public static void main(String[] args) {
        // Diğer kodlar...

        System.out.print("Level Order çiktisi: ");
        agac.levelOrder();
    }
    //Bu kodda, levelOrder adında bir fonksiyon tanımlanmıştır. İlk olarak, bir Queue veri yapısı oluşturulur ve kök düğüm bu kuyruğa eklenir. 
    //Ardından, kuyruk boşaltılırken her bir düğümün değeri yazdırılır. Her düğümün sol ve sağ çocukları kuyruğa eklenir. 
    //Bu işlem, kuyruk tamamen boşaltılana kadar devam eder.

//Son olarak, main metodunda örnek bir ağaç oluşturulur ve Level Order dolaşımı gerçekleştirilerek sonuç ekrana yazdırılır.
}
    
}
