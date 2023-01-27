package objects;

public enum LengthUnit {
    METERS(1),
    FOOTS(0.305),
    STEPS(0.8),
    INCHES(0.0254);
    final double unit;

     LengthUnit(double unit){
         this.unit = unit;
    }

    public double Length(double count){
        return count * this.unit;
    }
}
