public class ArrayOne {
    public static void main(String args[]){
        int A[] = {3,9,7,8,12,6,15,5,4,10};

        //finding sum
        int sum = 0;
        for(int el: A)
            sum += el;
        System.out.println("Sum of array is "+sum);

        //searching an element
        boolean found = false;
        int searched = 121;
        for(int el: A){
            if(el == searched)
                found = true;
        }
        System.out.println("Element found "+found);

        //finding max element
        int maxIndex = 0;
        for( int i = 0; i< A.length; i++)
        {
            if(A[i] >= A[maxIndex])
                maxIndex = i;
        }
        System.out.println("max is "+A[maxIndex]);

        //second largest
        int max2Index = maxIndex - 1;
        for( int i = 0; i< A.length; i++)
        {
            if(A[i] >= A[max2Index] && i != maxIndex)
                max2Index = i;
        }
        System.out.println("max2 is "+A[max2Index]);

    }
}
