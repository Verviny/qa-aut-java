package model;

public class Plant {
    private String plantType;
    private Boolean isPoisonous;
    private String plantColor;
    private Character greenhouseCharacter;
    private Float plantHeight;

    public String getPlantType() {
        return plantType;
    }

    public void setPlantType(String plantType) {
        this.plantType = plantType;
    }

    public Boolean getPoisonous() {
        return isPoisonous;
    }

    public void setPoisonous(Boolean poisonous) {
        isPoisonous = poisonous;
    }

    public String getPlantColor() {
        return plantColor;
    }

    public void setPlantColor(String plantColor) {
        this.plantColor = plantColor;
    }

    public Character getGreenhouseCharacter() {
        return greenhouseCharacter;
    }

    public void setGreenhouseCharacter(Character greenhouseCharacter) {
        this.greenhouseCharacter = greenhouseCharacter;
    }

    public Float getPlantHeight() {
        return plantHeight;
    }

    public void setPlantHeight(Float plantHeight) {
        this.plantHeight = plantHeight;
    }
}
