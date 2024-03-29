public class QuickSort {

    static int partition(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low-1;

        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=arr[high];
        arr[high]=temp;
        return i;

    }

    static void quickSort(int arr[],int low,int high){
        if(low<high){
            int pi=partition(arr, low, high);

            quickSort(arr, low,pi-1);
            quickSort(arr, pi+1, high);
        }
    }

    static void printArray(int arr[]){
        int n=arr.length;

        for(int i=0;i<n;++i){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        QuickSort qs= new QuickSort();
    
        int arr[]={5,6,3,2,7,4};
         int n=arr.length;

        qs.quickSort(arr, 0, n-1);

        System.out.println("Sorted Array");
        qs.printArray(arr);
    }
}
