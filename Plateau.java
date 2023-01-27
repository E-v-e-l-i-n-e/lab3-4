package objects;

import java.util.ArrayList;
import java.util.List;

public class Plateau extends ContentStorage{
    private int age;
    private double height;
    public Plateau(LengthUnit unit){
        plateauAge();
        plateauHeight(unit);
    }
    private static int heightSnowCover = 45;
    public static class snowCover {
        public static void  GetHeightSnowCover() {
            System.out.println("Высота снежного покрова примерно " + heightSnowCover + " футов.");
        }
    }
    public void GetSnowCover(){
        snowCover s = new snowCover();
        s.GetHeightSnowCover();
    }
    public void snowCover(int heigth) {
        this.height = heightSnowCover;
    }
    private void plateauAge() {
        int[] age = new int[5];
        age[0] = 500000;
        age[1] = 600000;
        age[2] = 400000;
        age[3] = 450000;
        age[4] = 666666;
        int a = (int) Math.round(Math.random() * 4);
        this.age = age[a];
    }
    public void printPlateauAge() {
        System.out.println("Плоскогорье появилось за " + this.age + " лет до появления человека.");
    }
    private void plateauHeight(LengthUnit unit) {
        int[] height = new int[4];
        height[0] = 20000;
        height[1] = 25000;
        height[2] = 15000;
        height[3] = 22000;
        int a = (int) Math.round(Math.random() * 3);
        double h = unit.Length(height[a]);
        this.height = height[a];
    }
    public void printPlateauHeight(){
        System.out.println("Плоскогорье вознесено на высоте " + this.height + " метров над уровнем моря.");
    }

    private final List<Content> contentList = new ArrayList<Content>();

    @Override
    public List<Content> getContent() {
        return contentList;
    }

    @Override
    public void addItem(Content content) {
        contentList.add(content);
    }
    }
