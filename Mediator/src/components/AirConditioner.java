package components;
/**
 * Clase que representa un aire acondicionado inteligente.
 * 
 * Puede encenderse o apagarse según las instrucciones del mediador.
 */
import mediator.*;
public class AirConditioner extends Device {

    public AirConditioner(SmartHouseMediator mediator) {
        super(mediator);
    }

    public void turnOn() {
        System.out.println("Aire acondicionado encendido");
    }

    public void turnOff() {
        System.out.println("Aire acondicionado apagado");
    }
}