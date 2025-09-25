//--ENUNCIADO DEL EJERCICIO--

/*
 * Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular y saldo (puede tener decimales).

    El titular será obligatorio y la cantidad es opcional. Crea dos constructores que cumpla lo anterior.

    Crea sus métodos get, set y toString.

    Tendrá dos métodos:

    ingresar(double cantidad)
    retirar(double cantidad)

*/

public class CuentaBancaria {

    private String nombreDelTitular;
    private double saldo;

    //Métodos constructores
    public CuentaBancaria(String titular,double dinero) { //aún no usaré la palabra reservada this ya que no comprendo su funcionamiento al 100%
        if(titular != null && dinero > 0) {
            nombreDelTitular = titular;
            saldo = dinero;
        }
        else {
            throw new IllegalArgumentException("Parámetros no válidos, prueba a ingresar una cadena de texto y números positivos");
        }
        
        
    }
    public CuentaBancaria(String titular) {

        if(titular != null) {
            nombreDelTitular = titular;
            saldo = 0;
        }
        else {
            throw new IllegalArgumentException("Parámetros no válidos, prueba a ingresar una cadena de texto");
        }
       
    }

    //Métodos accesores, solo implementaremos el Get, los set no tienen sentido en este contexto, no puedes cambiar tu nombre tan fácil y modificar tu saldo menos jajajaja
    public String GetNombreDelTitular() {
        return nombreDelTitular;
    }
    public double GetSaldo() {
        return saldo;
    }

    //Métodos heredados de la clase Object (solo implementaré el toStirng y el equals)

    @Override //Nota: aún no se cuál es el propósito de las anotaciones, lo aprenderé en su debido momento...
    public String toString() {
        return "Nombre del titular de la cuenta: " + nombreDelTitular + "\n" + "Saldo disponible: " + saldo;
    }

    @Override //Nota: aún no se cuál es el propósito de las anotaciones, lo aprenderé en su debido momento...
    public boolean equals(Object object) {

        if(this == object) return true;
        if(object == null | getClass() != object.getClass()) return false;
        //Acá ya verificamos que los objetos son del mismo tipo, por lo que debemos proceder a comparar sus atributos
        CuentaBancaria obj = (CuentaBancaria)object;
        return nombreDelTitular == obj.GetNombreDelTitular() && saldo == obj.GetSaldo();

    }
    
    //Métodos de instancia
    public void depositar(double monto) {

        if(monto <= 0) {
            throw new IllegalArgumentException("Ingresa una cantidad de dinero válida por favor");
        }
        else {
            saldo += monto;
        }

    }
    public void retirar(double monto) {
        if(monto > saldo || monto < 0) {
            throw new IllegalArgumentException("Ingresa una cantidad de dinero válida por favor, recuerda que esta no debe superar tu saldo actual");
        }
        else{
            saldo -= monto;
        }
    }

}

