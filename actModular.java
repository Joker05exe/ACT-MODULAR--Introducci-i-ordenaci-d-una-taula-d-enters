import java.util.Scanner;

public class actModular {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Demanar la mida de la taula
        System.out.println("Introdueix la mida de la taula:");
        int mida = 0;
        
        if (scanner.hasNextInt()) {
            mida = scanner.nextInt();
        } else {
            System.out.println("Error: Has d'introduir un número enter.");
            return;
        }

        // 2. Cridar al mètode d'entrada de dades
        int[] taula = entradaDeDades(mida);

        // 3. Cridar al mètode d'ordenació (Ara manual)
        int[] taulaOrdenada = ordenarDades(taula);

        // 4. Mostrar la taula ordenada
        System.out.println("\nTaula ordenada:");
        for (int i = 0; i < taulaOrdenada.length; i++) {
            System.out.print(taulaOrdenada[i] + " ");
        }
        System.out.println(); 
    }

    // --- Mètodes Obligatoris ---

    /**
     * Mètode 1: Entrada de dades
     */
    public static int[] entradaDeDades(int mida) {
        Scanner scanner = new Scanner(System.in);
        int[] taula = new int[mida];

        System.out.println("\nIntrodueix els valors:");
        for (int i = 0; i < mida; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            taula[i] = scanner.nextInt();
        }
        return taula;
    }

    /**
     * Mètode 2: Ordenació de dades (Manual - Bombolla)
     * Rep un array d’enters i retorna l’array ordenat de menor a major
     * sense utilitzar llibreries externes.
     */
    public static int[] ordenarDades(int[] taula) {
        // Algorisme de la Bombolla (Bubble Sort)
        int n = taula.length;
        
        // Bucle extern: per a cada passada
        for (int i = 0; i < n - 1; i++) {
            // Bucle intern: compara parelles adjacents
            for (int j = 0; j < n - i - 1; j++) {
                
                // Si l'element actual és més gran que el següent, els intercanviem
                if (taula[j] > taula[j + 1]) {
                    int aux = taula[j];       // Guardem el valor actual en una variable auxiliar
                    taula[j] = taula[j + 1];  // Posem el petit a l'esquerra
                    taula[j + 1] = aux;       // Posem el gran (aux) a la dreta
                }
            }
        }
        return taula;
    }
}