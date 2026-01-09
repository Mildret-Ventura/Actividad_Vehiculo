//El niven de combustible debe llenar por defecto al 90% de su capacidad maxima
// y no puede llenarse en una sola carga mas del 50% de combustible
public class Main {
    public static void main(String[] args) {
        Vehiculo carro = new Vehiculo("Civic", 80, 20);

        carro.tanquear(10);
        carro.tanquear(25);
        carro.tanquear(15);
        carro.tanquear(5);
        carro.tanquear(40);
    }
}
