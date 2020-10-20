public class Demo{
    public static void main(String[] args) {
        if (args.length!=0) printLoop(Integer.parseInt(args[0]));
        else printLoop(5);
    }
    public static void printLoop(int n){
        for(int i=1; i<=n; i++){
            for(int j=i-1; j<n; j++){
                System.out.println(i);
            }
            System.out.println();
        }
    }
}
