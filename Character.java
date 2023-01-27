package Alive;

import objects.Maze;

public class Character extends IsAlive {

    public void phrase1() {
        System.out.println("Я нашел дьявольский город-мираж. Передо мной открылось кошмарное зрелище.");
    }

    public Character(String name, boolean isAlive, int skill) {
        this.name = name;
        this.skill = skill;
        this.isAlive = isAlive;
    }

    //    public boolean trySolveMaze(Maze maze) {
//
//        for (int i = 0; i < 5; i++) {
//            //if (maze.x[i][0] ==
//        }
//        return true;
        private String plateau, snowman, manuscripts;

        public Character(String plateau, String snowman, String manuscripts) {
            this.plateau = plateau;
            this.snowman = snowman;
            this.manuscripts = manuscripts;
        }

        public interface Mind {
            String rememberedPlateau();

            String rememberedManuscripts();

        }

        public Mind comeToMind() {
            class CharacterComeToMind implements Mind {
                final String plateau = Character.this.plateau;
                final String manuscripts = Character.this.manuscripts;
                @Override
                public String rememberedPlateau() {
                    return this.plateau;
                }
                @Override
                public String rememberedManuscripts () {
                    return this.manuscripts;
                }
            }
            return new CharacterComeToMind();
        }
    }


