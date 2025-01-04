public class FuncAniosNecesarios {
    /*
     * aug es un número entero -> habitantes que entran o salen cada año,
     * el porcentaje es un número flotante positivo o nulo,
     * p0 y p son números enteros positivos
     */

    public int nbYear(int p0, double percent, int aug, int p) {
        int years = 0;
        int population = p0;

        while (population < p) {
            population += population * (percent / 100) + aug;
            years++;
        }

        return years;
    }
}