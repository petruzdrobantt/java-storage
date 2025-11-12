public class MethodTwo {
    //Overloading
    static double area(double breadth, double length){
        return breadth* length;
    }

    static double area(double radius){
        return Math.PI * radius * radius;
    }

    static double area(double topSide, double bottomSide, double height){
        return (topSide + bottomSide)/2 *height;
    }

    static int reverse(int x){
        int newNr = 0;
        while(x > 0){
            newNr = newNr*10 + x%10;
            x/=10;
        }
        return newNr;
    }

    static void reverse(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
    }

    public  static  void  main(String[] args){
        System.out.println(area(4,10));
        System.out.println(area(5));
        System.out.println(area(2,15,2));

        System.out.println(reverse(123));
        System.out.println(reverse(123456789));
        System.out.println(reverse(120));

    }
}
