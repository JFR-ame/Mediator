package components;

import mediator.*;
public class Sensor extends Device {

    public Sensor(SmartHouseMediator mediator) {
        super(mediator);
    }

    public void detectMovement() {
        mediator.notify(this, "movimiento detectado");
    }

    public void noMovement() {
        mediator.notify(this, "sin movimiento");
    }
}