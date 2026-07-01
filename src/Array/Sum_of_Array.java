package Array;

public class Sum_of_Array {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        int sum =0;
        System.out.print("Element of Array = ");
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            System.out.print(arr[i]+ " ");
        }

        System.out.println('\n' + "Sum of Array = "+ sum);
    }
}
