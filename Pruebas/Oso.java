public class Oso extends Mamifero {
    private String nombre;
    
    public void pescar() {
        System.out.println("Pescando un salmon");
    }



    public Oso(String nombre) {
        this.nombre = nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }
}
