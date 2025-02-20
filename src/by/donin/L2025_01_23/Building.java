package by.donin.L2025_01_23;

public class Building {
    int windowNumber;
    int doorNumber;
    String material;
    String street;
    int height;
    int yearBuilt;

    public Building(
        int windowNumber,
        int doorNumber,
        String material,
        String street
        ) {
       this.windowNumber = windowNumber;
       this.doorNumber = doorNumber;
       this.material = material;
       this.street = street;
    }

    public Building(
            int windowNumber,
            int doorNumber,
            String material,
            String street,
            int height,
            int yearBuilt
    ) {
        this.windowNumber = windowNumber;
        this.doorNumber = doorNumber;
        this.material = material;
        this.street = street;
        this.height = height;
        this.yearBuilt = yearBuilt;
    }

    String getDescription(){
        return "Здание имеет " + windowNumber + " окон, " +
                doorNumber + " дверей, находится на улице " +
                street + ", сделано из " + material +
                ". Высота здания " + height + " м, построено в " +
                yearBuilt + " году.";
    }
}
