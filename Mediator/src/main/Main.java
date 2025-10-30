package main;

import components.AirConditioner;
import components.Door;
import components.Light;
import components.Sensor;
import mediator.SmartHouseHub;

/**
 * Clase principal que simula el sistema de casa inteligente.
 * 
 * Aquí se crean los dispositivos y se registran en el mediador (hub),
 * luego el sensor envía eventos para demostrar la coordinación.
 */
public class Main {
    public static void main(String[] args) {
        // Crear el mediador (hub principal)
        SmartHouseHub hub = new SmartHouseHub();

        // Crear los dispositivos y pasarlos al hub
        Light light = new Light(hub);
        Door door = new Door(hub);
        AirConditioner air = new AirConditioner(hub);
        Sensor sensor = new Sensor(hub);

        // Registrar los dispositivos en el hub
        hub.setLight(light);
        hub.setDoor(door);
        hub.setAirConditioner(air);

        // Simular eventos
        sensor.detectMovement();
        System.out.println();
        sensor.noMovement();
    }
}