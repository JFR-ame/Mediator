package mediator;
/**
 * Interfaz del Mediador (SmartHomeMediator).
 * 
 * Define el contrato que deben seguir todos los mediadores:
 * un método 'notify' que recibe un dispositivo (emisor) y un evento.
 */
import components.*;
public interface SmartHouseMediator {
    void notify(Device sender, String event);
}