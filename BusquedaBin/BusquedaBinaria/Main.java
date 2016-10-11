
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

import java.util.ArrayList;

/**
 *
 * @author Fabian Oyarce
 */
public class Main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        ArrayList<Integer> a = new ArrayList<>();
        long time_start, time_end;
        
        if(args.length < 3){
            System.out.println("cantidadElementos nombreDelArchivo numeroBuscado");
            return;
        }
        int N = Integer.parseInt(args[0]);
        int n = N;
        int buscado = Integer.parseInt(args[2]);
        
        Scanner sc = new Scanner(new File(args[1]));
        int i = 0;
        while (sc.hasNextInt()) {

            a.add(sc.nextInt());
            
        }
        time_start = System.currentTimeMillis();
        int resultado = BusquedaBinaria.buscar(a,n,buscado,0,n-1);
        if (resultado != n){

            System.out.printf("El numero %d se encuentra en el indice %d del arreglo\n",buscado,resultado);
        }
        else{
            System.out.printf("El numero %d NO se encuentra en el arreglo\n",buscado);
        }
        
        time_end = System.currentTimeMillis();
        System.out.printf("%d\t%d\n", a.size(), time_end - time_start);

         
       
        
    }

}