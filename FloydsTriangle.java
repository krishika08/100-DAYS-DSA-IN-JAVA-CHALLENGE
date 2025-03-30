public class FloydsTriangle {
    public static void Floyds_Triangle(int n){
        int counter =1;
        // OUTER LOOP
        for(int i = 1;i <= n;i++){
            //  INNER LOOP
            for(int j =1;j <= i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Floyds_Triangle(5);
    }
}
