package objects;

import Exceptions.NoRockException;

public class Rock implements Content {
    public Rock(RockShape shape) {
        this.shape = shape;
    }
    RockShape shape;
    @Override
     public String toString() {
        if (shape == RockShape.ROUND) {
            return "круглый камень";
        }else if (shape == RockShape.CUBE){
            return "квадратный камень";
        }else{
            return "прямоугольный камень";
        }
    }
     public static Rock createRock() throws NoRockException {
        int c = random();
        if (c == 0) {
            return new Rock(RockShape.CUBE);
        }else if (c == 1) {
            return new Rock(RockShape.ROUND);
        }else if (c == 2) {
            return new Rock(RockShape.RECTANGULAR);
        }else {
            throw new NoRockException("не смогли создать камень");
        }
    }
    static int random() {
        double a = Math.random() * 2;
        int b = (int) Math.round(a);
        return b;

    }
}