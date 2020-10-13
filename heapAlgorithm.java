// Java program to print all permutations using
// Heap's algorithm
class HeapAlgo {
    void printArr(int a[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
    void heapPermutation(int a[], int size, int n)
    {
        if (size == 1)
            printArr(a, n);
 
        for (int i = 0; i < size; i++) {
            heapPermutation(a, size - 1, n);
            if (size % 2 == 1) {
                int temp = a[0];
                a[0] = a[size - 1];
                a[size - 1] = temp;
            }
            else {
                int temp = a[i];
                a[i] = a[size - 1];
                a[size - 1] = temp;
            }
        }
    }
    public static void main(String args[])
    {
        HeapAlgo obj = new HeapAlgo();
        int a[] = { 1, 2, 3 };
        obj.heapPermutation(a, a.length, a.length);
    }
}
 
