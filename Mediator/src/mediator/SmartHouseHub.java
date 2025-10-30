package mediator;


import components.*;


/**
 * Clase concreta que implementa el patrón Mediator.
 * 
 * El SmartHomeHub coordina las interacciones entre los dispositivos 
 * (luz, puerta, aire acondicionado) sin que se comuniquen directamente entre ellos.
 */
public class SmartHouseHub implements SmartHouseMediator {

    private Light light;
    private Door door;
    private AirConditioner airConditioner;

    // Métodos "setter" para registrar los dispositivos en el hub
    public void setLight(Light light) {
        this.light = light;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public void setAirConditioner(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    /**
     * Método principal del mediador.
     * Se encarga de reaccionar según el evento recibido del dispositivo emisor.
     */
    @Override
    public void notify(Device sender, String event) {
        if (event.equals("movimiento detectado")) {
            System.out.println("[Sensor]: Movimiento detectado");
            System.out.println("[Hub]: Encendiendo luz, abriendo puerta, activando aire");
            light.turnOn();
            door.open();
            airConditioner.turnOn();

        } else if (event.equals("sin movimiento")) {
            System.out.println("[Sensor]: Sin movimiento");
            System.out.println("[Hub]: Apagando luz, cerrando puerta, desactivando aire");
            light.turnOff();
            door.close();
            airConditioner.turnOff();
        }
    }
}
