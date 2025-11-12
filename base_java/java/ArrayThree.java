public class ArrayThree {
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] b = new int[10];

//        System.arraycopy(arr, 0, b, 0, arr.length);
        for(int i = 0 ; i < arr.length; i++){
            b[i] = arr[i];
        }

        //reverse coppying an array
        for(int i = 0; i< arr.length ; i++){
            b[arr.length - 1- i] = arr[i];
        }

        for(int i: b)
            System.out.print(i);

        //size increase
        int[] A = {1,2,3,4};
        int[] B = new int[2 * A.length];

        for(int i = 0; i< A.length; ++i){
            B[i] = A[i];
        }

        A=B;
        B=null; // free up B reference
    }
}
