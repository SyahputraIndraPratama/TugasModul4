package Sorting;

public class C_selectionsort {
    public static void selectionaort(int[] A){
        int smallIndex;
        int pass, j, n = A.length;
        int temp;
        
        for (pass = 0; pass < n - 1; pass++) {
            smallIndex = pass;
            for (j = pass + 1; j < n; j++) {
                if (A[j]< A[smallIndex]){
                    smallIndex = j;
                    
                }
            }
        
            temp = A[pass];
            A[pass] = A[smallIndex];
            A[smallIndex] = temp;
        }
    }
    
    public static void tampil(int data[]) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int A[] = {25, 7, 9, 13, 3};
        C_selectionsort.tampil(A);
        C_selectionsort.selectionaort(A);
        C_selectionsort.tampil(A);
        
            System.out.println("Syahputra Indra Pratama");
            System.out.println("NIM   : 20090124");
            System.out.println("Kelas : 2B");
    }
}
