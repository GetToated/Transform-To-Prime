public class Solution {
    public static boolean esprimo(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i * i < n; i++) {
            if (n % i == 0)
            return false;
        }
        return true;
    }

        public static int minimumNumber ( int[] numbers){
            int sumar = 0;
            for (int numero : numbers) {
                sumar += numero;
            }
            int numeromin = 0;
            while (!esprimo(sumar + numeromin)) {
                numeromin++;
            }
            return numeromin;
        }
        public static void main (String[]args){
            int[] array1 = {3, 1, 2};
            int[] array2 = {5, 2};
            int[] array3 = {1,1,1};
            System.out.println(minimumNumber(array1));
            System.out.println(minimumNumber(array2));
            System.out.println(minimumNumber(array3));

        }

}
