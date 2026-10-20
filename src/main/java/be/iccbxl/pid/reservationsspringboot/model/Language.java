package be.iccbxl.pid.reservationsspringboot.model;

public enum Language {
    EN("Anglais"),
    FR("Français"),
    NL("Néerlandais");

    private final String description;

    Language(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
}