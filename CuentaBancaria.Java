public class CuentaBancaria {
  
    private String numeroCuenta;
    private String nombreTitular;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, String nombreTitular) {
        this.numeroCuenta = numeroCuenta;
        this.nombreTitular = nombreTitular;
        this.saldo = 0.0;
    }

    public CuentaBancaria(String numeroCuenta, String nombreTitular, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.nombreTitular = nombreTitular;
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0.0; // No permite saldos negativos
            System.out.println("Saldo inicial inválido. Se asignó 0.0");
        }
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito exitoso: $" + monto);
        } else {
            System.out.println("El monto a depositar debe ser positivo.");
        }
    }

    public void retirar(double monto) {
        if (monto > 0) {
            if (monto <= saldo) {
                saldo -= monto;
                System.out.println("Retiro exitoso: $" + monto);
            } else {
                System.out.println("Fondos insuficientes.");
            }
        } else {
            System.out.println("El monto a retirar debe ser positivo.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Titular: " + nombreTitular);
        System.out.println("Saldo actual: $" + saldo);
    }

    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("12345", "Juan Pérez");
        cuenta1.mostrarInformacion();
        cuenta1.depositar(500);
        cuenta1.retirar(200);
        cuenta1.mostrarInformacion();

        System.out.println("--------------------------");

        CuentaBancaria cuenta2 = new CuentaBancaria("67890", "María López", 1000);
        cuenta2.mostrarInformacion();
        cuenta2.depositar(-50); 
        cuenta2.retirar(1200); 
        cuenta2.retirar(300);
        cuenta2.mostrarInformacion();
    }
}
