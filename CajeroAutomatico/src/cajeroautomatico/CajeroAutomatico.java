/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajeroautomatico;
import java.util.Scanner;
public class CajeroAutomatico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int dinerosolicitado=0;
    final int BILLETES[]= {500,200,100,50,20,10,5,2,1};
    int billetesentregados[]= new int [BILLETES.length];
    int dineroEntregado, dineroRestante;
        System.out.println("Ingrese la cantidad de dinero que necesita retirar: ");
        dinerosolicitado = entrada.nextInt();
        
        dineroRestante= dinerosolicitado;
        for (int x = 0; x < BILLETES.length;x++) {
            if (dineroRestante>=BILLETES[x]){
                billetesentregados[x] = dineroRestante/BILLETES[x];
                dineroEntregado = billetesentregados [x]*BILLETES[x];
                dineroRestante = dineroEntregado;
            }else {
                billetesentregados[x]=0;
            }
            System.out.println("Billetes de " +BILLETES[x]+ " entregados");
        }
    }
    
}
