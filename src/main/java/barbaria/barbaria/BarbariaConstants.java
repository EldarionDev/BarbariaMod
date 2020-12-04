package barbaria.barbaria;

public class BarbariaConstants {
    public static final String MOD_ID = "barbaria";
    public static final String MOD_NAME = "Barbaria";
    public static final String VERSION = "1.0-SNAPSHOT";

    private static Barbaria INSTANCE;

    public static Barbaria getModInstance () {
        return INSTANCE;
    }

    public static void setModInstance (Barbaria instance) {
        INSTANCE = instance;
    }
}
