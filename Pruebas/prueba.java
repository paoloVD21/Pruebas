public class prueba {
    public static void main(String[] args) {
        MayusAMin a = new MayusAMin();

        String cambiada = a.cambioMayus("indica a Hibernate que use el dialecto SQL específico para PostgreSQL");

        System.out.println(cambiada);
    }
}
