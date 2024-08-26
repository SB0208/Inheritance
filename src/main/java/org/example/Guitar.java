package org.example;

import java.util.Objects;

public class Guitar extends Instrument {



    private boolean electric;

    public Guitar(String manufacturer, String brand, double price, String color, boolean isElectric) {
        super(manufacturer, brand, price, color);
        this.electric = isElectric;

    }

    @Override
    public void makeNoise(){
        System.out.println("Guitar sounds");
    }

    public boolean isElectric() {
        return electric;
    }
    public void setElectric(boolean electric) {
        this.electric = electric;
    }

   @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Guitar guitar = (Guitar) o;
        return electric == guitar.electric;
   }

   @Override
    public String toString(){
        return "Guitar{" +
                "electric=" + electric +
                "}" + super.toString();


   }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), electric);
    }


}
