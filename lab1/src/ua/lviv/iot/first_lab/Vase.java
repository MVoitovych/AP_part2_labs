package ua.lviv.iot.first_lab;

public record Vase(float waterVolumeInLiters, float weight, int creationYear, int heightInSm, String materialType, String mainColour ) {

    private final static String standardVaseName = "vase";

    private static String lastVaseName;
    public Vase(){
        this(3, 2, 2022, 50, "Plastic", "Red");
        }

    public Vase(String mainColour, String materialType, int creationYear ){
        this(3, 2, creationYear, 50, materialType, mainColour);
    }

    public Vase(float waterVolumeInLiters, float weight, int creationYear, int heightInSm, String materialType, String mainColour ){
        this.waterVolumeInLiters = waterVolumeInLiters;
        this.weight = weight;
        this.creationYear = creationYear;
        this.heightInSm = heightInSm;
        this.materialType = materialType;
        this.mainColour = mainColour;
        lastVaseName = String.format("%s %s %s", mainColour, materialType, standardVaseName);
    }

    public static String getLastVaseName(){
        return "last vase is " + lastVaseName + "\n";
    }

    @Override
    public String toString(){
        return String.format("""
                water volume are %.2f liters
                weight are %.2f grams
                creation year is %d
                height are %d sm
                material is %s
                colour is %s""", waterVolumeInLiters, weight, creationYear, heightInSm, materialType, mainColour);
    }
}
