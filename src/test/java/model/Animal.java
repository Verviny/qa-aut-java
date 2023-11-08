package model;

public class Animal {
    private String animalType;
    private String animalBreed;
    private int dogBirthYear;
    private String animalName;
    private Boolean castrated;

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getAnimalBreed() {
        return animalBreed;
    }

    public void setAnimalBreed(String animalBreed) {
        this.animalBreed = animalBreed;
    }

    public int getDogBirthYear() {
        return dogBirthYear;
    }

    public void setDogBirthYear(int dogBirthYear) {
        this.dogBirthYear = dogBirthYear;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public Boolean getCastrated() {
        return castrated;
    }

    public void setCastrated(Boolean castrated) {
        this.castrated = castrated;
    }
}
