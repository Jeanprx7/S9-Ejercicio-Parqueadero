package org.example;

/*
Nombre: Jean Paul Rodriguez
Materia: Programación 2
Fecha: 31/05/2024

Enunciado:Se quiere construir una aplicación para administrar un parqueadero. Dicho parqueadero
tiene 40 puestos numerados. En cada puesto se puede parquear un carro. El parqueadero
tiene una tarifa por hora o fracción de hora

*/
public class Main {
    public static void main(String[] args) {
        Parqueadero parqueadero = new Parqueadero();
        System.out.println("Puestos libres: "+parqueadero.calcularPuestosLibres());

        // Carros dentro del parqueadero

        parqueadero.entrarCarro("PB5210");
        parqueadero.entrarCarro("PC5678");
        parqueadero.entrarCarro("PB9456");
        parqueadero.entrarCarro("PD1122");

        // Simular el paso del tiempo
        for (int i = 0; i < 4; i++) {
            parqueadero.avanzarHora();
        }

       // Metodos
        System.out.println("Puestos libres:" +parqueadero.calcularPuestosLibres());
        System.out.println("Promedio horas: "+parqueadero.darTiempoPromedio());
        System.out.println("Carro con mas horas: "+parqueadero.DevuelveCarroMayorTiempo().darPlaca());
        System.out.println("Existe un auto con mas de ocho horas: "+parqueadero.hayCarroMasdeOchoHoras());
        System.out.println("Carros con mas de 3 horas: "+parqueadero.darCarrosMasDeTresHorasParqueados());
        System.out.println("Carros con las placas iguales: "+parqueadero.hayCarrosPlacaIgual());
        System.out.println("Carros con la placa PB: "+parqueadero.contarCarrosQueComienzanConPlacaPB());
        System.out.println("Carro con 24 horas: "+parqueadero.hayCarroCon24Horas());
        System.out.println(parqueadero.metodo1());
        System.out.println(parqueadero.metodo2());
      }
    }