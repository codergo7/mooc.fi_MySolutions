
import java.util.HashMap;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> list;

    public VehicleRegistry() {
        this.list = new HashMap<>();

    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (!this.list.containsKey(licensePlate)) {
            this.list.put(licensePlate, owner);
            return true;
        }

        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate licensePlate : this.list.keySet()) {
            System.out.println(licensePlate);
        }
    }

    public void printOwners() {
        this.list.values().stream().distinct().forEach(s -> {
            System.out.println(s);
        });
        
    }

    public String get(LicensePlate licensePlate) {

        if (this.list.containsKey(licensePlate)) {
            return this.list.get(licensePlate);
        }

        return null;
    }

    public boolean remove(LicensePlate licensePlate) {

        if (this.list.containsKey(licensePlate)) {
            this.list.remove(licensePlate);
            return true;
        }

        return false;
    }

}
