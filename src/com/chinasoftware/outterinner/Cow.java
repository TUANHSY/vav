package com.chinasoftware.outterinner;

/**
 * @author: DX
 * @date: 2019/12/4 11:31
 */
public class Cow {
    private double cowHeight;
    private double cowWeight;

    public double getCowHeight() {
        return cowHeight;
    }

    public void setCowHeight(double cowHeight) {
        this.cowHeight = cowHeight;
    }

    public double getCowWeight() {
        return cowWeight;
    }

    public void setCowWeight(double cowWeight) {
        this.cowWeight = cowWeight;
    }



    public class CowLeg{
        String legColor;
        double legLength;

        public String getLegColor() {
            return legColor;
        }

        public void setLegColor(String legColor) {
            this.legColor = legColor;
        }

        public double getLegLength() {
            return legLength;
        }

        public void setLegLength(double legLength) {
            this.legLength = legLength;
        }

        public CowLeg(String legColor, double legLength) {
            this.legColor = legColor;
            this.legLength = legLength;
        }

        public void showCow(){
            System.out.println(Cow.this.getCowHeight()+" "+Cow.this.getCowWeight()+" "+this.getLegColor()+" "+this.getLegLength());
        }
    }


    public Cow(double cowHeight, double cowWeight) {
        this.cowHeight = cowHeight;
        this.cowWeight = cowWeight;
    }

    public Cow() {
    }
}
