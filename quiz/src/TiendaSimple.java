import java.util.ArrayList;
import java.util.Scanner;
 
class Producto {
    protected String nombre;
    protected double precio;
    protected int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public double precioTotal() {
        return precio * cantidad;
    }

    public String descripcion() {
        return nombre + " - $" + precio + " x " + cantidad;
    }
}

class Televisor extends Producto {
    private int pulgadas;

    public Televisor(String nombre, double precio, int cantidad, int pulgadas) {
        super(nombre, precio, cantidad);
        this.pulgadas = pulgadas;
    }

    @Override
    public double precioTotal() {
        return super.precioTotal() * 0.9; 
    }

    @Override
    public String descripcion() {
        return "Televisor " + nombre + " (" + pulgadas + " pulgadas) - $" + precio + " x " + cantidad;
    }
}

class Refrigerador extends Producto {
    private int capacidad;

    public Refrigerador(String nombre, double precio, int cantidad, int capacidad) {
        super(nombre, precio, cantidad);
        this.capacidad = capacidad;
    }

    @Override
    public String descripcion() {
        return "Refrigerador " + nombre + " (" + capacidad + "L) - $" + precio + " x " + cantidad;
    }
}
public class TiendaSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Producto> carrito = new ArrayList<>();

        System.out.println("=== Bienvenido a la tienda de electrodomésticos ===");

        System.out.print("¿Qué marca de televisor quieres? ");
        String marcaTele = sc.nextLine();
        System.out.print("¿Cuántos televisores? ");
        int cantTele = sc.nextInt();
        System.out.print("¿Cuántas pulgadas? ");
        int pulgadas = sc.nextInt();
        System.out.print("¿Precio por unidad? ");
        double precioTele = sc.nextDouble();
        sc.nextLine(); 
        carrito.add(new Televisor(marcaTele, precioTele, cantTele, pulgadas));

        System.out.print("\n¿Qué marca de refrigerador quieres? ");
        String marcaRefri = sc.nextLine();
        System.out.print("¿Cuántos refrigeradores? ");
        int cantRefri = sc.nextInt();
        System.out.print("¿Capacidad en litros? ");
        int capacidad = sc.nextInt();
        System.out.print("¿Precio por unidad? ");
        double precioRefri = sc.nextDouble();
        carrito.add(new Refrigerador(marcaRefri, precioRefri, cantRefri, capacidad));

        double total = 0;
        System.out.println("\n=== Carrito de compras ===");
        for (Producto producto : carrito) {
            System.out.println("- " + producto.descripcion());
            total += producto.precioTotal();
        }

        System.out.printf("Total a pagar: $%.2f\n", total);

        sc.close();
    }
}
