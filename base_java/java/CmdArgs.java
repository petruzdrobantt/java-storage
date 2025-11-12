public class CmdArgs {
    public static void main(String[] args){
        try{
            double sum = 0;
            for(String arg: args){
                sum += Double.parseDouble(arg);
            }
            System.out.println(sum);
        }catch(Exception e){
            System.out.println("Nan " + e.getMessage());
        }
    }
}
