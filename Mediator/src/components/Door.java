package components;
/**
 * Clase que representa una puerta inteligente.
 * 
 * Puede abrirse o cerrarse bajo las órdenes del mediador.
 */
import mediator.*;
public class Door extends Device {

    public Door(SmartHouseMediator mediator) {
        super(mediator);
    }

    public void open() {
        System.out.println("Puerta abierta");
    }

    public void close() {
        System.out.println("Puerta cerrada");
    }
}