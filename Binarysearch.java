import java.util.Arrays;

public class Binarysearch {
    public static void main(String[] args) {
        int[] arr={9,7,5,3,11,2};
        System.out.println("Original array: "+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted array: "+Arrays.toString(arr));
        int target=3;
        int result=binarySearch(arr,target);
        System.out.println("Element found at index: "+result);
    }
    public static int binarySearch(int[] arr,int target){
        int low=0;
        int high = arr.length-1;
        while(low<=high){
            int mid= low + (high - low)/2; // Prevents overflow
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]<target){
                low=mid+1;
            }else{
                high = mid-1;
            }
        }
        return -1;
    }
}
