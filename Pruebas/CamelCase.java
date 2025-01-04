public class CamelCase {
    public String separacion(String palabra) {
        char[] arreglo = palabra.toCharArray();
        String respuesta = "";
        for (int i = 0; i < arreglo.length; i++) {
            if (Character.isUpperCase(arreglo[i])) {
                respuesta = respuesta + " ";
            }
            
            respuesta = respuesta + arreglo[i];
        }

        return respuesta;
    }
}
