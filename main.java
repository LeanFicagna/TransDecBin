public class TDB {
    final static int TAM = 32;
    public static void main(String args[]) {
        somaBin(7, 7);
    }
    
    public static void somaBin(int a, int b) {
        int[] iSoma = new int[ TAM ], vaiUm = new int[ TAM ];
        
        int[] valA = transDecBin(a), valB = transDecBin(b);
        
        for(int i = 0; i < TAM-1; i++) {
            iSoma[i] = (valA[i] == 1 ^ valB[i] == 1)? 1: 0;
            vaiUm[i+1] = ((iSoma[i] == 1 & vaiUm[i] == 1) || (valA[i] == 1 & valB[i] == 1))? 1: 0;
            iSoma[i] = (iSoma[i] == 1 ^ vaiUm[i] == 1)? 1: 0;
        } 
        for(int i = TAM-1; i >= 0; i--) System.out.print(iSoma[i]);
        System.out.println();
    }
    
    public static int[] transDecBin(int a) {
        int i = 0;
        int[] col = new int[ TAM ];
        while( a > 0 ) {
            col[i] = (int)(a % 2);
            a = (a - col[i++])/2;
        }
        
        for(i = TAM-1; i >= 0; i--) System.out.print(col[i]);
        System.out.println();
        return col;
    }
}
