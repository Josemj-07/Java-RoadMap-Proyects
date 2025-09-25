# Cuenta Bancaria (Extremadamente básico)

### Hola a todos, es mi primera vez usando markdown así que espero que no quede tan mal :)
Este pequeño programa nos permitió abstraer un poco de como funciona una cuenta bancaria, evidemente es demasiado básico
ya que hay partes que no tienen como tal sentido en el mundo real. Por ejemplo faltaría algo como la clave de acceso para cada cuenta;
los métodos para comparar si una cuenta es igual a otra son muy básicos y dependen del nombre y el saldo, entonces por ejemplo dos cuentas 
pueden ser iguales si tienen distinto saldo pero el mismo nombre del titular, evidentemente puede pasar pero faltarían muchas más capas de validación de datos.

Con el tiempo espero retomar este problema y llevarlo a mayor escala

### ¿Qué contiene la clase CuentaBancaria?
- Atributos para el nombre del titular y el saldo que este tiene:
```java
private String nombreTitular;
private double saldo;
```
- Dos constructores que permiten crear objetos con un saldo inicial o sin saldo (se inicializa en cero)
- Los dos métodos heredados de la clase Object:
```java
public String toString();
public boolean equals(Object obj);
```
- Métodos getters para obtener los valores de los atributos, los Set no los hice porque no tiene sentido que alguien se cambie el saldo jajajaja

**La verdad aprendí mucho de este miniprograma a pesar de que fuese tan sencillo,  me permitió refrescar un poco la mente con algunos temas de POO y aprender algunas cosas nuevas**

>Sic parvis magna - Sr.Francis Drake

## Posibles mejoras futuras
- Agregar autenticación con clave de acceso
- Mejorar la implementación del método equals
- Agregar nuevas clases y relaciones entre estas. Por ejemplo una clase persona y que se puedan hacer transferencias entre distintas instancias
- Añadirle una interfaz gráfica 
- Una mejor suite de pruebas para incluir casos más extremos
- Mejorar las implementaciones de los métodos actuales del API para que sean más realistas
