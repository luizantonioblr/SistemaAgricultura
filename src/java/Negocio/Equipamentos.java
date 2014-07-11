package Negocio;

public enum Equipamentos {
     MANUAL("Manual"),
    TRATOR("Trator"), 
    PUVERIZADOR_COSTAL("Puverizador Costal"),
    CULTIVADOR("Cultivador"),
    ARADO("Arado");



private String equi;

    Equipamentos(String equi) {
        this.equi = equi;
    }

    public String getEqui() {
        return equi;
    }

}
