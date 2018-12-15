package General.Hashing;

public class Hash {
    Hash(){}

    public static void main(String[] args) {
        int [] arr=new int[10];
        int size=arr.length;
        printArray(arr,size);
        insert(arr,25,size);
        insert(arr,98,size);
        insert(arr,57,size);
        insert(arr,75,size);
        insert(arr,97,size);    
        insert(arr,18,size);
        insert(arr,78,size);
        insert(arr,65,size);
        insert(arr,46,size);
        printArray(arr,size);

    }

    private static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.println("["+i+"]"+arr[i]);
        }
    }

    private static void insert(int[] arr,int k, int size) {
        int hf1=k%size;

        int hf2=1+(k%(size-2));
        for (int i = 0; i < size; i++) {
            int pos=(hf1+i*hf2)%size;
            if (arr[pos]!=0)
                continue;
            else
            {
                arr[pos]=k;
                break;
            }
        }
    }

}
