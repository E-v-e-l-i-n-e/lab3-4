package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Exceptions.*;

public class Maze extends ContentStorage implements MirageCity, StoneMonster {
    boolean created;


    @Override
    public String[] getActions() {
        return new String[]{"Отражается в облаках ледяной пыли."};
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

    @Override
    public String toString() {
        String contentDescription = "";
        for (int i = 0; i < contentList.size(); i++) {
            if (i < contentList.size() - 1) {
                contentDescription += contentList.get(i).toString() + ", ";
            } else {
                contentDescription += contentList.get(i).toString() + ".";
            }
        }
        return "Перед моим взором открылся лабиринт. \nЛабиринт состоит из:" + contentDescription;
    }

    public Maze(boolean created) {
        this.created = created;
    }
    public class StoneTowers {

        public void saveFromDeath() {
            System.out.println("Каменные башни уберегли от гибели это жуткое творение.");
        }
    }


        public boolean IsCreatedByNature() {
        return this.created;
    }

    @Override
    public void sendImage(String direction) {
        System.out.println("Доисторический каменный монстр посылает свой образ " + direction);
    }

    public static int random2() {
        int d = (int) Math.round(Math.random() * 4);
        return d;

    }

    public String[][] x = new String[5][5];

    public void maze3() throws NoMonsterInMazeException {
        int m1 = random2();
        int m2 = random2();
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 4; j++) {
                int f = random2();
                if (f == 0) {
                    x[i][j] = "  ";
                } else if (f == 1) {
                    x[i][j] = "__|";
                } else if (f == 2) {
                    x[i][j] = "__";
                } else {
                    x[i][j] = "  |";
                }
                if (i == 0) {
                    x[i][j] = "__";
                }
                if (i > 0 & j == 0) {
                    x[i][j] = "|";
                }
                if (i > 0 & j == 4) {
                    x[i][j] = "  |";
                }
                if ((i == 4) & (x[i][j].equals("  "))) {
                    x[i][j] = "__";
                } else if ((i == 4) & (x[i][j].equals("  |"))) {
                    x[i][j] = "__|";
                }
                x[0][0] = "   ";
                x[4][4] = "  |";
//                if ((i == m1) & (j == m2) & !(j == 0) & !(j == 4) & !(i ==0) & !(i ==4)){
//                    x[i][j] = "* ";
//                    System.out.println("* - здесь монстр из лабиринта.");
//                } else {
//                    System.out.println("В лабиринте нет монстра.");
//                }
            }
        }
        if ((m1 == 0) | (m1 == 4) | (m2 == 0) | (m2 == 4)) {
            throw new NoMonsterInMazeException("В лабиринте нет монстра.");
        }else{
            x[m1][m2] = "* ";
            System.out.println("* - здесь монстр из лабиринта.");
        }
    }


    public void printMaze() {
        for (int k = 0; k <= 4; k++) {
            for (int l = 0; l <= 4; l++) {
                System.out.print(x[k][l]);
            }
            System.out.println("\n");
        }
    }

}
