public class MergeSort {


    static void divide(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr,si,ei,mid);
    }

    static void conquer(int arr[],int si,int ei ,int mid){
        int merged[]=new int[ei-si+1];
        int indx1=si;
        int indx2=mid+1;
        int x=0;
        while(indx1<=mid && indx2<=ei){
            if(arr[indx1]<=arr[indx2]){
                merged[x++]=arr[indx1++];
            }
            else{
                merged[x++]=arr[indx2++];
            }
        }
        while(indx1<=mid){
            merged[x++]=arr[indx1++];
        }
        while(indx2<=ei){
            merged[x++]=arr[indx2++];
        }
        for(int i=0,j=si;i<merged.length;i++,j++){
              arr[j]=merged[i];
        }
    }
    void printArray(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;++i){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        
        MergeSort ms=new MergeSort();
        int arr[]={6,77,4,33,1,66};
        int n=arr.length;
        ms.divide(arr, 0, n-1);
        ms.printArray(arr);
    }
}
