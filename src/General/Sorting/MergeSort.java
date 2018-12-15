package General.Sorting;

public class MergeSort {

    public void MergeSort(int arr[], int i, int j){
        if (i<j){
            int m=(i+j)/2;
            MergeSort(arr,i,m);
            MergeSort(arr,m+1,j);
            merge(arr,i,m,m+1,j);
        }
    }

    private void merge(int[] arr, int i, int m, int i1, int j) {
        int n1=m-i+1;
        int n2=j-i1+1;
        int larr[]=new int[n1];
        int rarr[]=new int[n2];
        i1=0;
        m=0;
        int k=i;
        while(i1<n1){
            larr[i1++]=arr[k++];
        }
        while (m<n2){
            rarr[m++]=arr[k++];
        }

        i1=0;
        m=0;
        k=i;
        while (i1<n1 && m<n2){
            if (larr[i1]<=rarr[m]){
                arr[k]=larr[i1];
                i1++;
            }
            else{
                arr[k]=rarr[m];
                m++;
            }
            k++;

        }
        while (i1<n1){
            arr[k++]=larr[i1++];
        }
        while (m<n2){
            arr[k++]=rarr[m++];
        }
    }

    static void printArray(int arr[]){
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 7};

        System.out.println("Given Array");
        printArray(arr);

        MergeSort ob = new MergeSort();
        ob.MergeSort(arr,0,arr.length-1);

        System.out.println("\nSorted array");
        printArray(arr);
    }
}
