package org.example;

public class Main {

    public static void main(String[] args) {

        Guitar guitar = new Guitar("Fender", "Fender", 159.33, "black",true);
        guitar.setManufacturer("Gibson");

        Piano piano = new Piano("", "", 3400, "Black", 5);
        Trumpet trumpet = new Trumpet("", "", 150, "Gold", true);



        playInstrument(guitar); //Polymorphism
        playInstrument(piano);
        playInstrument(trumpet);

        Instrument[] musicStore = {guitar, trumpet, piano};


    }

    }

    public static void playInstrument(Instrument instrument){
        instrument.makeNoise();
    }

public void main() {
}

