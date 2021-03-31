/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latih_logic;

/**
 *
 * @author User
 */
public class LATIH_LOGIC {

    public static void main(String[] args) {
        
        System.out.println("==========Thanks=======");        
        System.out.println("====Create by ASRUL====");
        System.out.println("=======================");
        
        int x = 5;
        for (int y = 0; y < x; y++) {
            for (int z = 0; z < y; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println("=====================");
        
        int a = 5;
        for (int b = 1; b <= a; b++){
            for (int c = 4; c >= b; c--){
                System.out.print(" ");
            }
            for (int d = 1; d <= b; d++){
                System.out.print("*");
            }
            System.out.println();
        }
            
        System.out.println("=====================");
        
        int e = 5;
        for (int f = 1; f <= e; f++){
            for(int g = 4; g >= f; g--){ //
                System.out.print(" ");
            }
            for(int h = 1; h <= f; h++){ //bintang
                System.out.print("*");
            }
            for (int i = 1; i <= f-1; i++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println("=====================");
        
        int j = 5;
        for (int k = 1; k < j; k++) {
            for (int l = 4; l >= k ; l--) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println("=====================");
        
        int m = 5;
        for (int n = 1; n < m; n++) {
            for (int o = 1; o <= n; o++) {
                System.out.print(" ");
            }
            for (int p = 4; p >= n; p--) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println("=====================");
        
        int q = 5;
        for (int r = 1; r <= q; r++) {
            for (int s = 1; s <= r; s++) {
                System.out.print(" ");
            }
            for (int t = 5; t >= r; t--) {
                System.out.print("*");
            }
            for (int u = 4; u >= r ; u--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("===================");
    }
}
