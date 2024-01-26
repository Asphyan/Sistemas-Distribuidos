package HeapsortHeapmax;

public class HeapSort {
    public static void main(String[] args) {
        
        int[] v = {7, 6, 5, 4, 3, 2, 1};
        int n = v.length;

        for (int m = n; m >= 2; m--) {
            int x = v[0]; // Corrigido para v[0] para os índices iniciarem em zero.
            for (int j = 0; j < m - 1; ++j) {
                v[j] = v[j + 1];
            }
            v[m - 1] = x;
        }

        // Imprimindo o vetor após as manipulações
        for (int i = 0; i < n; i++) {
            System.out.print(v[i] + " ");
        }
    }

    public static void heapSort(int[] array) {
    }
}
