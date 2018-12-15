package General.Sorting;

public class QuickSort {
    public void QuickSort(int arr[],int p, int q){
        while (p<q) {
            int t = partition(arr, p, q);
            if (t-p<q-t) {
                QuickSort(arr, p, t - 1);
                p=t+1;
            }else {
                QuickSort(arr, t + 1, q);
                q = t - 1;
            }
        }
    }

    private int partition(int[] arr, int p, int q) {
        int x=arr[p];
        int i=p;
        for (int j = i+1; j <= q; j++) {
            if (arr[j]<x){
                i=i+1;
                swap(arr,i,j);
            }
        }
        swap(arr,p,i);
        return i;
    }

    private void swap(int[] arr,int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void printArray(int[] arr){
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        long t2=System.currentTimeMillis();
        int arr[] =  {1, 4, 2, 4, 2, 4, 1, 2, 4, 1, 2, 2, 2, 2, 4, 1, 4, 4, 4};

        System.out.println("Given Array");
        printArray(arr);

        QuickSort ob = new QuickSort();
        ob.QuickSort(arr,0,arr.length-1);

        System.out.println("\nSorted array");
        printArray(arr);
        long t1=System.currentTimeMillis();
        System.out.println("time of execution: "+(t2-21));
    }


}
