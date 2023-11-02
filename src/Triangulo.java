public class Triangulo extends Forma {
    private double base;
    private double altura;

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea(){
        double area = (base*altura)/2;
        return area;
    }
}
