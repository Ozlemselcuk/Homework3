//Bu kod, BinarySearchTree sinifini ve Node sınıfını tanımlar.
// BinarySearchTree sinifi, bir ikili arama ağacını temsil eder ve "insert" metodu ile düğüm eklemeyi,
// "preOrder" metodu ile Preorder dolaşımını gerçekleştirmeyi sağlar.
// Main metodunda örnek bir ağaç oluşturulur ve Preorder çıktısı yazdırılır.
public class 2.soru {
    public class BinarySearchTree {
        // Diğer kodlar...
    
        public Node findLowestCommonAncestor(int value1, int value2) {
            return findLowestCommonAncestorRecursive(root, value1, value2);
        }
    
        private Node findLowestCommonAncestorRecursive(Node root, int value1, int value2) {
            if (root == null) {
                return null;
            }
    
            if (root.data > value1 && root.data > value2) {
                return findLowestCommonAncestorRecursive(root.left, value1, value2);
            } else if (root.data < value1 && root.data < value2) {
                return findLowestCommonAncestorRecursive(root.right, value1, value2);
            }
    
            return root;
        }
    
        public static void main(String[] args) {
            // Diğer kodlar...
    
            int value1 = 27;
            int value2 = 46;
            Node lowestAncestor = tree.findLowestCommonAncestor(value1, value2);
            System.out.println("Seçilen (" + value1 + "," + value2 + ") için sonuç = " + lowestAncestor.data);
    
}
