package com.example;

public class Main {

    public static void main(String[] args) {

        SmartWatch relojInteligente = new SmartWatch(true, true, 3.9d, true, true, 2300);

        SmartPhone celularInteligente = new SmartPhone(true, true, 1000, true, 5.9d, "Galaxy S21", "Samsung");


        System.out.println(celularInteligente);
        System.out.println(relojInteligente);

    }
}

class SmartClase {


    boolean wifi;
    boolean gps;

    public SmartClase() {

    }

    public SmartClase(boolean wifi, boolean gps) {
        this.wifi = wifi;
        this.gps = gps;
    }

}

class SmartPhone extends SmartClase {

    double memoria;
    boolean giroscopio;
    double tamañoPantalla;
    String modelo;
    String marca;

    public SmartPhone() {
    }

    public SmartPhone(boolean wifi, boolean gps, double memoria, boolean giroscopio, double tamañoPantalla, String modelo, String marca) {
        super(wifi, gps);
        this.memoria = memoria;
        this.giroscopio = giroscopio;
        this.tamañoPantalla = tamañoPantalla;
        this.modelo = modelo;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "memoria=" + memoria +
                ", giroscopio=" + giroscopio +
                ", tamañoPantalla=" + tamañoPantalla +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", wifi=" + wifi +
                ", gps=" + gps +
                '}';
    }
}

class SmartWatch extends SmartClase {

    double tamañoPantalla;
    boolean monitorCardiaco;
    boolean monitorSueño;
    double mahBateria;


    public SmartWatch() {
    }

    public SmartWatch(boolean wifi, boolean gps, double tamañoPantalla, boolean monitorCardiaco, boolean monitorSueño, double mahBateria) {
        super(wifi, gps);
        this.tamañoPantalla = tamañoPantalla;
        this.monitorCardiaco = monitorCardiaco;
        this.monitorSueño = monitorSueño;
        this.mahBateria = mahBateria;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "tamañoPantalla=" + tamañoPantalla +
                ", monitorCardiaco=" + monitorCardiaco +
                ", monitorSueño=" + monitorSueño +
                ", mahBateria=" + mahBateria +
                ", wifi=" + wifi +
                ", gps=" + gps +
                '}';
    }
}
