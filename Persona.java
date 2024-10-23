public class Persona {
    private String nombre;
    int edad;
    double altura;
    public Persona(String name, int edad, double altura){
        this.nombre=name;
        this.edad=edad;
        this.altura=altura;
    }
    public Persona(){
        nombre="Amanda";
        edad=27;
        altura=12.2;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura){
        this.altura=altura;
    }
    public void imp(){
        System.out.println("Nombre: "+nombre+" Edad: "+edad+" altura: "+altura);
    }
}
