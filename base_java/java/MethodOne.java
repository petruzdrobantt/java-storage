public class MethodOne {
    static boolean isPrime(int x){
        if(x == 1)
            return  false;
        if(x == 2)
            return  true;
        if(x % 2 ==0)
            return false;
        double s = Math.sqrt(x);
        for(int d= 3; d<= s; d++)
            if(x%d == 0)
                return false;
        return true;
    }

    static int gcd(int x, int y){
        int res = 1;
        int d = 2;

        while(d <= x && d <=y){
            if(x%d==0 && y%d==0)
                res = d;
            d++;
        }
        return res;
    }

    static int maxElement(int[] arr){
        int max = arr[0];
        for(int el : arr){
            if(el > max)
                max = el;
        }
        return max;
    }

    public static void main(String args[]){
        System.out.println(isPrime(121));
        System.out.println(gcd(2, 3));
        int[] arr = {123,123,123,123,12,314,34,4534};
        System.out.println(maxElement(arr));
    }
}
