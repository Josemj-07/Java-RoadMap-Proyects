
public class TestCuentaBancaria {
    public static void main(String[] args) {

        CuentaBancaria cuenta1 = new CuentaBancaria("Jose Muñoz", 50);
        CuentaBancaria cuenta2 = new CuentaBancaria("Jose Muñoz", 0);

        //prueba del método toString()
        System.out.println(cuenta1);
        System.out.println();
        System.out.println(cuenta2);

        //prueba del método .equals()
        if(cuenta1.equals(cuenta2)) {
            System.out.println("Las cuentas son iguales");
        }
        else{
            System.out.println("las cuentas son distintas");
        }

        //Cambios en el saldo
        cuenta2.depositar(50);
        System.out.println("Este es el saldo de la cuenta 2: "+ cuenta2.GetSaldo());
        cuenta2.retirar(20);
        System.out.println("Este es el saldo de la cuenta 2:" + cuenta2.GetSaldo());

        //Verficamos que el constructor tenga medidas de seguridad correctas, acá el programa debería dejar de ejecutarse entonces dejamos esto como la última linea
        CuentaBancaria cuenta3 = new CuentaBancaria("Anita", -200);



    }   
}
