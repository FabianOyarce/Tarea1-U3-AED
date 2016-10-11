import java.util.ArrayList;

/**
 *
 * @author Fabian Oyarce
 */
public class BusquedaBinaria
{

    public static <T extends Comparable<T>> int buscar(ArrayList<T> a, int n, T buscado, int inicio, int fin)
    {
      
        int mitad = (inicio+fin)/2;

        if (inicio>fin){
            return n;
        }
        if (a.get(mitad).equals(buscado)){
            return mitad;
        }
   
        if (a.get(mitad).compareTo(buscado) > 0){
            return buscar(a, n, buscado, inicio, mitad-1);
        }
        else{
            return buscar(a, n, buscado, mitad+1, fin);
        }


    }
}

