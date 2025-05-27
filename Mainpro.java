//bubble sort
/*import java.util.Scanner;
class Mainpro{
    public static void bubblesort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void printArray(int[] arr){
        for(int val:arr)
            System.out.print(val+" ");
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        printArray(arr);
        bubblesort(arr);
        printArray(arr);
    } 
}*/


/*
import java.util.Scanner;
class Mainpro{
    static void insertionsort(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && key<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    public static void printArray(int[] arr){
        for(int val:arr)
            System.out.print(val+" ");
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        printArray(arr);
        insertionsort(arr);
        printArray(arr);
        sc.close();
    } 
}
*/



/*
import java.util.Scanner;
class Mainpro{
    static void selectionsort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minIndx=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndx])
                    minIndx=j;
            }
            int temp=arr[i];
            arr[i]=arr[minIndx];
            arr[minIndx]=temp;
        }
    }
    public static void printArray(int[] arr){
        for(int val:arr)
            System.out.print(val+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        printArray(arr);
        selectionsort(arr);
        printArray(arr);
        sc.close();
    }
}
*/

/*
class Mainpro{
    public static void evenodd(int[] nums) {
        int low=0,mid=0;
        while(mid<nums.length){
            if(nums[mid]%2==1){
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low++;
            }
            mid++;
        }
    }
    public static void main(String[] args){
        int nums[]={1,2,3,4,5,6};
        evenodd(nums);
        for(int val:nums){
            System.out.print(val+" ");
        }
    }
}
*/
/*
import java.util.Scanner;
class Mainpro{
    public static void quicksort(int[] arr,int low,int high){
        if(low<high){
            int pivotIndex=partition(arr,low,high);
            quicksort(arr,low,pivotIndex-1);
            quicksort(arr,pivotIndex+1,high);
        }
    }
    private static int partition(int[] arr,int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }
    public static void printArray(int[] arr){
        for(int val:arr)
            System.out.print(val+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        printArray(arr);
        quicksort(arr,0,n-1);
        printArray(arr);
        sc.close();
    }
}
*/
/*
import java.util.Scanner;
class Mainpro{
    public static void mergesort(int[] arr,int left,int right){
        if(left<right){
            int mid=left+(right-left)/2;
            mergesort(arr,left,mid);
            mergesort(arr,mid+1,right);
            merge(arr,left,mid,right);
        }
    }
    private static void merge(int[] arr,int left,int mid,int right){
        int n1=mid-left+1;
        int n2=right-mid;
        int[] L=new int[n1];
        int[] R=new int[n2];
        for(int i=0;i<n1;i++){
            L[i]=arr[left+i];
        }
        for(int j=0;j<n2;j++){
            R[j]=arr[mid+1+j];
        }
        int i=0,j=0;
        int k=left;
        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                arr[k]=L[i];
                i++;
            }
            else{
                arr[k]=R[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k]=L[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=R[j];
            j++;
            k++;
        }
    }
    public static void printArray(int[] arr){
        for(int val:arr)
            System.out.print(val+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        printArray(arr);
        mergesort(arr,0,n-1);
        printArray(arr);
        sc.close();
    }
}
*/

import java.util.Scanner;
class Mainpro{
    static int binarysearch(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]<target) low=mid+1;
            else high=mid-1;          
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int result=binarysearch(arr,target);
        if(result==-1)
            System.out.println("Element not found");
        else    
            System.out.println("Element found at index "+result);
        sc.close();
    }
}



