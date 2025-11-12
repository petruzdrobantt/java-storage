public class ArrayTwo {
    public static void main(String args[]){
        int A[] = {3,9,7,8,12,6,15,5,4,10};

        //rotation to left
        int temp = A[0];
        for(int i = 1; i<A.length; i++)
            A[i-1] = A[i];

        A[A.length -1] = temp;
        System.out.print("Rotated Array ");
        for(int el: A)
            System.out.print(" "+el);
        System.out.println("\n");

        //rotation to right, same but with temp last

        //Insertion
        int n = A.length;
        int newEl = 60;
        int newPosition = 4;

        for(int i = A.length-2 ; i>= newPosition; i--){
            A[i+1] = A[i];
        }
        A[newPosition] = newEl;
        n++;
        for(int el: A)
            System.out.print(" "+el);
        System.out.println("\n");


        //Deletion
        int del = 6;
        for(int i = del; i< A.length-1; ++i)
        {
            A[i] = A[i+1];
        }
        n--;

        for(int el: A)
            System.out.print(" "+el);
        System.out.println("\n");
    }


}
