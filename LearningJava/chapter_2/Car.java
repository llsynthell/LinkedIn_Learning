import java.awt.*;

public class Car {
    // Data Types:
    // int -> integer (I.E. 1, 2, 3)
    // double -> decimal (I.E. 50.23, 24.33)
    // String -> words (I.E. "Hello World")
    
    double averageMilesPerGallon;
    String licensePlate;
    Color paintColor;
    Boolean areTaillightsWorking;

    public Car() {
        averageMilesPerGallon = 0;
        licensePlate = "Empty";
        paintColor = Color.BLACK;
        areTaillightsWorking = false;
    }

    public Car(double inputMilesPerGallon, String inputLicensePlate, Color inputPaintColor, Boolean inputTaillightsWorking) {
        this.averageMilesPerGallon = inputMilesPerGallon;
        this.licensePlate = inputLicensePlate;
        this.paintColor = inputPaintColor;
        this.areTaillightsWorking = inputTaillightsWorking;
    }

    public void changePaintColor(Color newPaintColor) {
        this.paintColor = newPaintColor;
    }

    public double speedingUp(double currentSpeed) {
        return currentSpeed += 100;
    }
}