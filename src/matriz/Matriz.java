package matriz;

/**
 *
 * @author FABY
 */
public class Matriz {

    private int[][] matriz1;
    public int[][] matriz2;
    private int[][] suma;

    public Matriz(int i, int j) {
        matriz1 = new int[i][j];
        matriz2 = new int[i][j];
        suma = new int[i][j];
    }

    public void llenarMatriz() {
        int l = 0;
        for (int i = 0; i < matriz1.length; i++) {//dimensión de las filas
            for (int j = 0; j < matriz1[i].length; j++) {//dimensión de las columnas
                matriz1[i][j] = l;
                matriz2[i][j] = l;
                l++;
            }
        }
    }

    public void impriirMatriz() {
        String sms1 = "Matriz 1\n", sms2 = "Matriz 2\n";
        for (int i = 0; i < matriz1.length; i++) {//dimensión de las filas
            for (int j = 0; j < matriz1[i].length; j++) {//dimensión de las columnas
                sms1 += "[" + matriz1[i][j] + "]";
                sms2 += "[" + matriz2[i][j] + "]";
            }
            sms1 += "\n";
            sms2 += "\n";
        }
        System.out.println(sms1);
        System.out.println(sms2);
    }

    public void sumarMatrices() {
        System.out.println("La suma de Matrices es:");
        for (int i = 0; i < matriz1.length; i++) {//dimensión de las filas
            for (int j = 0; j < matriz2[i].length; j++) {//dimensión de las columnas
                suma[i][j] = matriz1[i][j] + matriz2[i][j];
                System.out.print("[" + suma[i][j] + "]");
            }
            System.out.println("");
        }
    }
}
