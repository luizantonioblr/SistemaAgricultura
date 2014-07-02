package Negocio;

public enum Etapa {

    PREPARO_DO_SOLO("Preparo do Solo"),
    PLANTIO("Plantio"),
    TRATOS_CULTURAIS("Tratos Culturais"),
    COLHEITA("Colheita"),
    COMERCIALIZAÇÃO("Comercialização");

    private String label;

    Etapa(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

}
