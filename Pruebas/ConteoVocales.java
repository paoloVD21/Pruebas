public class ConteoVocales {
    public int contar(String palabra) {
        int tamanio = palabra.toLowerCase().length();
        int cont = 0;

        for (int i = 0; i < tamanio; i++) {
            switch (palabra.charAt(i)) {
                case 'a':
                    cont++;
                    break;
                case 'e':
                    cont++;
                    break;
                case 'i':
                    cont++;
                    break;
                case 'o':
                    cont++;
                    break;
                case 'u':
                    cont++;
                    break;
            }
        }

        return cont;
    }
}
