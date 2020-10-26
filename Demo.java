public class Demo{
    public static void main(String[] args) {
        if (args.length!=0) printLoop(Integer.parseInt(args[0]));
        else printLoop(5);
	//int[][] a = new int[][]{{},{},{}};
        //System.out.println(arrayDeepToString(a).replace("},","},\n"));
	//System.out.println(arrayDeepToString(create2DArrayRandomized(4,4,5)));
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


    public static String arrayDeepToString(int[][]arr){
        if (arr.length==0) return "{}";
        String s="{";
        for (int i=0; i<arr.length-1; i++){
            s+= arrToString(arr[i])+", ";
        }
        return s+arrToString(arr[arr.length-1])+"}";
    }


    public static int[][] create2DArray(int rows, int cols, int maxValue){
        int[][]arr =new int[rows][cols];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                arr[i][j]=(int)(Math.random()*(maxValue+1));
            }
        }
        return arr;
    }
    public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue){
        int[][]arr =new int[rows][];
        for (int i=0; i<rows; i++){
	    int cols1=(int)(Math.random()*(cols+1));
	    arr[i]=new int[cols1];
	    for (int j=0; j<cols1; j++){
                arr[i][j]=(int)(Math.random()*(maxValue+1));
            }
	}
        return arr;
    }
}
