public class Demo{
    public static void main(String[] args) {
        if (args.length!=0) printLoop(Integer.parseInt(args[0]));
        else printLoop(5);
	//int[][] a = new int[][]{{4,5,9},{1,2,5},{2,6,3}};
        //System.out.println(arrDeepToString(a).replace("},","},\n"));
	//System.out.println(arrDeepToString(create2DArray(2,2,5)));
    }
    public static void printLoop(int n){
        for(int i=1; i<=n; i++){
            for(int j=i-1; j<n; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static String arrToString(int[] arr){
        String s="{";
        if (arr.length==0) return "{}";
        for (int i=0; i<arr.length; i++){
            s+=String.valueOf(arr[i])+", ";
        }
        s=s.substring(0,s.length()-2)+"}";
        return s;
    }
    public static String arrDeepToString(int[][] arr){
        String s="{";
        if (arr.length==0) return "{}";
        for (int i=0; i<arr.length; i++){
            String s1="{";
            for (int j=0; j<arr[i].length; j++){
                s1+=String.valueOf(arr[i][j])+", ";
            }
            s1=s1.substring(0,s1.length()-2)+"}, ";
            s+=s1;
        }
        s=s.substring(0,s.length()-2)+"}";
        return s;
    }

    public static int[][] create2DArray(int rows, int cols, int maxValue){
        int[][]arr =new int[rows][cols];
        int n=0;
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                arr[i][j]=(int)(Math.random()*(maxValue+1));
                n++;
                if(n==maxValue+1){
                    j=cols;
                    n=0;
                }
            }
        }
        return arr;
    }
}
