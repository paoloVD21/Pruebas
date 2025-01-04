public class CantidadBitsUno {
    public int cantUnos(int num) {
        int cont = 0;
        for (int a = num; a != 0; a /= 2) {
            if (a % 2 == 1) cont++;
        }

        return cont;
    }
}
