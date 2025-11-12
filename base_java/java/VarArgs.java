public class VarArgs {
    static int max(int ...number){
        int max = -1;
        for(int el: number){
            if(el > max)
                max = el;
        }
        return max;
    }

    static int sum(int ...number){
        int sum = 0;
        for(int el: number)
            sum+=el;
        return sum;
    }

    public static void main(String[] args){
        System.out.println(max(123,123,544,23,2455,2123,6767,99,231));
        System.out.println(sum(1,2,3,4,5,6,7,8,9));
    }
}
