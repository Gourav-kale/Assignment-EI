import java.util.HashMap;
import java.util.Map;

// Device interface
interface Device {
    void turnOn();
    void turnOff();
    String getStatus();
}

// Light class implementing the Device interface
class Light implements Device {
    private String status;

    public Light() {
        this.status = "off";
    }

    public void turnOn() {
        status = "on";
        System.out.println("Light is now ON.");
    }

    public void turnOff() {
        status = "off";
        System.out.println("Light is now OFF.");
    }

    public String getStatus() {
        return "Light is " + status + ".";
    }
}

// Thermostat class implementing the Device interface
class Thermostat implements Device {
    private int temperature;

    public Thermostat(int initialTemp) {
        this.temperature = initialTemp;
    }

    public void turnOn() {
        System.out.println("Thermostat is now ON. Current temperature: " + temperature + "°C.");
    }

    public void turnOff() {
        System.out.println("Thermostat is now OFF.");
    }

    public String getStatus() {
        return "Thermostat is set to " + temperature + "°C.";
    }

    public void setTemperature(int temperature) {
import java.util.HashMap;
import java.util.Map;

// Device interface
interface Device {
    void turnOn();
    void turnOff();
    String getStatus();
}

// Light class implementing the Device interface
class Light implements Device {
    private String status;

    public Light() {
        this.status = "off";
    }

    public void turnOn() {
        status = "on";
        System.out.println("Light is now ON.");
    }

    public void turnOff() {
        status = "off";
        System.out.println("Light is now OFF.");
    }

    public String getStatus() {
        return "Light is " + status + ".";
    }
}

// Thermostat class implementing the Device interface
class Thermostat implements Device {
    private int temperature;

    public Thermostat(int initialTemp) {
        this.temperature = initialTemp;
    }

    public void turnOn() {
        System.out.println("Thermostat is now ON. Current temperature: " + temperature + "°C.");
    }

    public void turnOff() {
        System.out.println("Thermostat is now OFF.");
    }

    public String getStatus() {
        return "Thermostat is set to " + temperature + "°C.";
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}

// Door class implementing the Device interface
class Door implements Device {
    private String status;

    public Door() {
        this.status = "locked";
    }

    public void turnOn() {
        status = "unlocked";
        System.out.println("Door is now UNLOCKED.");
    }

    public void turnOff() {
        status = "locked";
        System.out.println("Door is now LOCKED.");
    }

    public String getStatus() {
        return "Door is " + status + ".";
    }
}

// Smart Home System class to manage devices
class SmartHomeSystem {
    private Map<Integer, Device> devices = new HashMap<>();

    public void addDevice(int id, Device device) {
        devices.put(id, device);
        System.out.println("Device with ID " + id + " added.");
    }

    public void turnOnDevice(int id) {
        Device device = devices.get(id);
        if (device != null) {
            device.turnOn();
        } else {
            System.out.println("Device with ID " + id + " not found.");
        }
    }

    public void turnOffDevice(int id) {
        Device device = devices.get(id);
        if (device != null) {
            device.turnOff();
        } else {
            System.out.println("Device with ID " + id + " not found.");
        }
    }

    public void getStatusReport() {
        System.out.println("Status Report:");
        for (Device device : devices.values()) {
            System.out.println(device.getStatus());
        }
    }
}

// Main class to run the Smart Home System
public class SmartHomeApp {
    public static void main(String[] args) {
        SmartHomeSystem home = new SmartHomeSystem();

        // Initialize devices
        home.addDevice(1, new Light());
        home.addDevice(2, new Thermostat(20));
        home.addDevice(3, new Door());

        // User commands
        home.turnOnDevice(1); // Light
        home.turnOnDevice(2); // Thermostat
        home.turnOffDevice(3); // Door Lock
        home.getStatusReport();
    }
}￼Enter        this.temperature = temperature;
    }
}

// Door class implementing the Device interface
class Door implements Device {
    private String status;

    public Door() {
        this.status = "locked";
    }

    public void turnOn() {
        status = "unlocked";
        System.out.println("Door is now UNLOCKED.");
    }

    public void turnOff() {
        status = "locked";
        System.out.println("Door is now LOCKED.");
    }

    public String getStatus() {
        return "Door is " + status + ".";
    }
}
art Home System class to manage devices
class SmartHomeSystem {
    private Map<Integer, Device> devices = new HashMap<>();

    public void addDevice(int id, Device device) {
        devices.put(id, device);
        System.out.println("Device with ID " + id + " added.");
    }

    public void turnOnDevice(int id) {
        Device device = devices.get(id);
        if (device != null) {
            device.turnOn();
        } else {
            System.out.println("Device with ID " + id + " not found.");
        }
    }

    public void turnOffDevice(int id) {
        Device device = devices.get(id);
        if (device != null) {
            device.turnOff();
        } else {
            System.out.println("Device with ID " + id + " not found.");
        }
