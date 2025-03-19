public class patterens {
    public static void main(String[] args) {
        
       // PRINT STAR PATTERN

        for(int line = 1; line <= 4; line++){
            for(int star = 1; star <= line; star++){
                System.out.print("*");
            }
            System.out.println();
        }

    //INVERTED STAR PATTERN

        int n = 4;
        for(int line = 1; line <= n; line++){
            for(int star = 1; star <= n-line+1; star++){
                System.out.print("*");
            }
            System.out.println();
        }

   // HALF PYRAMID PATTERN

    for (int i = 1; i <= n; i++) {
        for(int j = 1; j<=i; j++){
        System.out.print(j);
        }
        System.out.println();
    }


  //  PRINT CHARACTER PATTERN

    char ch = 'A';
    for(int i = 1; i <= n; i++){
        for(int j = 1; j <= i; j++){
            System.out.print(ch);
            ch++;
        }
        System.out.println();
        }

    
    }
}
