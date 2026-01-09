//El niven de combustible debe llenar por defecto al 90% de su capacidad maxima
// y no puede llenarse en una sola carga mas del 50% de combustible
public class Vehiculo {
    String modelo;
    double capacidadMaxima;
    double nivelCombustible;

    double nivelRecomendado;
    double cargaPermitida;

    public Vehiculo(String modelo, double capacidadMaxima, double nivelCombustible){
        this.modelo = modelo;
        this.capacidadMaxima = capacidadMaxima;
        this.nivelCombustible = nivelCombustible;
    }

    public void tanquear(double litros){
        cargaPermitida = capacidadMaxima * 0.5;
        nivelRecomendado = capacidadMaxima * 0.9;

        double cargaTemporal = litros + nivelCombustible;

        if (litros > capacidadMaxima || cargaTemporal > capacidadMaxima){
            System.out.println("La gasolina llegara a su tope");
        } else {
            if (litros > cargaPermitida){
                System.out.println("No puedes cargar más del 50% del tanque en una sola carga");
            } else {
                if (cargaTemporal > nivelRecomendado){
                    System.out.println("Estás sobrepasando el nivel recomendado");
                }
                nivelCombustible += litros;
                System.out.println("Carga realizada correctamente");
            }
        }
        System.out.println("Nivel de gasolina actual: " + nivelCombustible);
    }
}
