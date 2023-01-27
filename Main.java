import Alive.Character;
import Alive.MazeMonster;
import Exceptions.*;
import objects.*;


public class Main {
    public static void main(String[] args) throws NoMonsterInMazeException {
        Character character = new Character("Я", true, 60);
        Character character1 = new Character("демоническое плато Ленг", "омерзительного снежного человека", "рукописи с намеками на нечеловеческое происхождение");
        Character.Mind come = character1.comeToMind();
        MazeMonster monster = new MazeMonster("Монстр", true, 50);
        Maze maze = new Maze(false);
        Maze.StoneTowers towers = maze.new StoneTowers();
        LengthUnit unit = LengthUnit.INCHES;
        Plateau plateau = new Plateau(unit);
        character.phrase1();
        plateau.printPlateauAge();
        plateau.printPlateauHeight();
        plateau.GetSnowCover();
        Climate climate =  Climate.COLD;
        climate.weather();
        if (!climate.isSuitableForLiving()) System.out.println("Климат здесь непригоден для всего живого.");
        for (int i = 0; i < 3; i++) {
            maze.addItem(Rock.createRock());
        }
        System.out.println(maze.toString());
        if (!maze.IsCreatedByNature()) {
            System.out.println("Каменные джунгли явно искусственного происхождения.");
        }
        maze.sendImage("через горный хребет.");
        towers.saveFromDeath();
        maze.getActions();
        Ghost ghostFantom = new Ghost() {
            @Override
            public void Fantom() {
                System.out.println("Призрачный фантом несет в себе некоторые преувеличения и искажения.");
            }
        };
        ghostFantom.Fantom();
        System.out.println("Мне вновь пришли на ум " + come.rememberedPlateau() + ", " + come.rememberedManuscripts ()+ ".");
        try{
            maze.maze3();
        }catch(NoMonsterInMazeException e){
            System.err.println("В лабиринте нет монстра.");;
        }
        maze.printMaze();
        //character.trySolveMaze(maze);

    }


}
