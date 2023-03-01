package referentiel;

public abstract class Espece {
    // Attributs
    private final int pokeId;
    private String surnom;
    private final String espece; // Le pokemon en question (ex : Carapuce)
    private EnumType enumType;
    private int pointsDeVie;
    private final int pointsDeVieMax;
    private int pointsXp;

    // CONSTRUCTOR

    // GETTERS SETTERS
    public int getPokeId() {
        return pokeId;
    }

    public Espece(int pokeId, String espece, int pointsDeVieMax) {
        this.pokeId = pokeId;
        this.espece = espece;
        this.pointsDeVieMax = pointsDeVieMax;
    }

    public String getSurnom() {
        return surnom;
    }

    public void setSurnom(String surnom) {
        this.surnom = surnom;
    }

    public String getEspece() {
        return espece;
    }

    public EnumType getEnumType() {
        return enumType;
    }

    public void setEnumType(EnumType enumType) {
        this.enumType = enumType;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    public int getPointsDeVieMax() {
        return pointsDeVieMax;
    }

    public int getPointsXp() {
        return pointsXp;
    }

    public void setPointsXp(int pointsXp) {
        this.pointsXp = pointsXp;
    }

}
