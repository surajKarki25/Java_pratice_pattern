public class patternSeven {
    static int n=5;
    public static void main(String[] args) {
        for (int i = 0; i < n; i++) {
            for(int j=0;j<n;j++){
                if(i==0 || j==0 || i==(n/2)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }
}
