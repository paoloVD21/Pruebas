public class TestearPalabra {
    public boolean testeoLetras(String palabra) {
        boolean flag = true;

        char arreglo[] = palabra.toLowerCase().toCharArray();
        int tamanio = arreglo.length - 1;
        if (tamanio == 0) {
            return true;
        }

        for (int i = 0; i < tamanio; i++) {
            i = 0;
            for (int j = i; j < tamanio; j++) {
                if (arreglo[j] == arreglo[tamanio]) {
                    flag = false;
                    break;
                } else {
                    flag = true;
                }
            }

            if (flag == true) {
                tamanio--;
            } else {
                break;
            }
        }

        return flag;

        // chars() -> Convierte la cadena de caracteres (ahora en minúsculas) en un flujo de int (stream) que representa el valor de cada carácter.
        // distinct() -> Filtra el flujo de int para que solo queden valores únicos. Esto significa que elimina todos los duplicados, dejando solo una instancia de cada valor.
        // count() -> Cuenta el numero de elementos en el flujo
        // return palabra.length() == palabra.toLowerCase().chars().distinct().count();
    }
}
