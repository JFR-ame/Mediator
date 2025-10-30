package components;
/**
 * Clase que representa una luz inteligente.
 * 
 * Sus acciones son encender y apagar, pero no decide por sí sola:
 * responde a las instrucciones del mediador.
 */
import mediator.*;
public class Light extends Device {

    public Light(SmartHouseMediator mediator) {
        super(mediator);
    }

    public void turnOn() {
        System.out.println("Luz encendida");
    }

    public void turnOff() {
        System.out.println("Luz apagada");
    }
}