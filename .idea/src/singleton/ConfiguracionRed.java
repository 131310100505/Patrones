package org.uade.singleton;

public class ConfiguracionRed {

    private static ConfiguracionRed instancia;

    private String servidor;
    private int puerto;

    private ConfiguracionRed() {}

    public static ConfiguracionRed getInstance() {
        if (instancia == null) {
            instancia = new ConfiguracionRed();
        }
        return instancia;
    }

    public String getServidor() {
        return servidor;
    }

    public void setServidor(String servidor) {
        this.servidor = servidor;
    }

    public int getPuerto() {
        return puerto;
    }

    public void setPuerto(int puerto) {
        this.puerto = puerto;
    }
}