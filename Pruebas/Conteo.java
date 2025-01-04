public class Conteo {
    public int contar(String text) {
        int cont = 0;
        char flag = ' ';

        char[] arreglo = text.toLowerCase().toCharArray();
        int tamanio = arreglo.length;

        for (int i = 0; i < tamanio; i++) {
            flag = arreglo[i];
            int contint = 0;
            for (int j = i + 1; j < tamanio; j++) {
                if (flag != ' ') {
                    if (flag == arreglo[j]) {
                        arreglo[j] = ' ';
                        contint++;
                    }
                }
            }
            
            if (contint >= 1) {
                cont++;
            }
        }

        return cont;
    }
}
