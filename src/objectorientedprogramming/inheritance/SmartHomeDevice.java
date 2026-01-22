package ObjectOrientedProgramming.Inheritance;

/*
 * SmartDevice class
 * -----------------
 * Superclass representing a generic smart device.
 * Contains common device attributes.
 */
class SmartDevice {
    String deviceId;  // Device identifier
    boolean status;  // Device status (on/off)

    // Constructor to initialize smart device
    SmartDevice(String deviceId, boolean status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Method to display device status
    void displayStatus() {
        System.out.println("Device ID: " + deviceId + " Status: " + status);
    }
}

/*
 * ThermostatDevice class
 * ----------------------
 * Subclass representing a Smart Thermostat.
 * Extends SmartDevice with temperature control.
 */
class ThermostatDevice extends SmartDevice {
    int temperatureSetting;  // Temperature setting in celsius

    // Constructor to initialize thermostat device
    ThermostatDevice(String id, boolean status, int temp) {
        super(id, status);
        this.temperatureSetting = temp;
    }

    // Overridden method to include temperature information
    @Override
    void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature: " + temperatureSetting);
    }
}
