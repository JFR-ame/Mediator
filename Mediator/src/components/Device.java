package components;
/**
 * Clase abstracta base para todos los dispositivos.
 * 
 * Cada dispositivo tiene una referencia al mediador (SmartHomeMediator)
 * para poder comunicarse a través de él.
 */
import mediator.*;
public abstract class Device {
    protected SmartHouseMediator mediator;

    public Device(SmartHouseMediator mediator) {
        this.mediator = mediator;
    }
}