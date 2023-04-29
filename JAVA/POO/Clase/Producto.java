package POO.Clase;

import POO.Interfaz.IContenedor;
import POO.Interfaz.IProducto;

public abstract class Producto implements IProducto {

    private String referencia;
    private int peso;
    private int volumen;

    public Producto(String referencia, int peso, int volumen) {
        this.referencia = referencia;
        this.peso = peso;
        this.volumen = volumen;
    }

    @Override
    public String getReferencia() {
        return referencia;
    }

    @Override
    public int getPeso() {
        return peso;
    }

    @Override
    public int getVolumen() {
        return volumen;
    }

    @Override
    public boolean tengoEspacio(IContenedor contenedor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'tengoEspacio'");
    }

}
