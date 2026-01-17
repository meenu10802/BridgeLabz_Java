package ObjectOrientedProgramming.Inheritance;

/*
 * Problem Statement:
 * Write a Java program to demonstrate inheritance
 * using Device and Thermostat classes.
 */

/*
 * Class Name: Device
 *
 * Description:
 * This superclass represents a generic device.
 * It stores common attributes such as device ID
 * and operational status.
 */
class Device {

    // Unique identifier for the device
    String deviceId;

    // Status of the device (on/off)
    boolean status;

    // Constructor to initialize device details
    Device(String deviceId, boolean status) {

        // Assign device ID
        this.deviceId = deviceId;

        // Assign device status
        this.status = status;
    }
}

/*
 * Class Name: Thermostat
 *
 * Description:
 * This class represents a Thermostat device.
 * It extends the Device class and adds
 * temperature control functionality.
 */
class Thermostat extends Device {

    // Temperature setting of the thermostat
    int temperatureSetting;

    // Constructor to initialize thermostat details
    Thermostat(String deviceId, boolean status, int temperatureSetting) {

        // Call superclass constructor
        super(deviceId, status);

        // Assign temperature setting
        this.temperatureSetting = temperatureSetting;
    }

    // Method to display thermostat status
    void displayStatus() {

        // Display device ID, status, and temperature setting
        System.out.println(deviceId + " " + status + " " + temperatureSetting);
    }
}
