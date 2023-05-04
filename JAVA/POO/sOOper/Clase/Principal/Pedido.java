package POO.sOOper.Clase.Principal;

import java.util.HashSet;
import java.util.Set;

import POO.sOOper.Interfaz.IContenedor;
import POO.sOOper.Interfaz.IPedido;
import POO.sOOper.Interfaz.IProducto;

public class Pedido implements IPedido {
    private String referencia;
    private Set<IContenedor> contenedores;

    public Pedido(String referencia) {
        this.referencia = referencia;
        this.contenedores = new HashSet<IContenedor>();
    }

    @Override
    public String getReferencia() {
        return referencia;
    }

    @Override
    public Set<IProducto> getProducto() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Set<IContenedor> getContenedor() {
        return contenedores;
    }

    @Override
    public void addContenedor(IContenedor contenedor) {
        contenedores.add(contenedor);
    }

    @Override
    public IContenedor addProducto(IProducto producto) {
        for (IContenedor contenedor : contenedores) {
            if (contenedor.meter(producto)) {
                return contenedor;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pedido: " + referencia + "\n");
        for (IContenedor contenedor : contenedores) {
            sb.append("\t" + contenedor + "\n");
        }
        return sb.toString();
    }

}
