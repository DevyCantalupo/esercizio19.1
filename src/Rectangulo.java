public class Rectangulo extends Forma {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea(){
        double area = base*altura;
        return area;
    }
}
