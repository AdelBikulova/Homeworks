package homeWork.HW24;

public class Main_games {

    /*
    Написать как минимум одну иерархию классов в которой будет один родительский класс и два наследника,
    расширяющих его функционал
     */

    public static void main(String[] args) {

        Computer_games computer_games = new Computer_games();

        Racing racing = new Racing();
        Strategy strategy = new Strategy();
        Puzzle puzzle = new Puzzle();

        computer_games.gaming();
        System.out.println();

        racing.gaming();
        System.out.println();

        strategy.gaming();
        System.out.println();

        puzzle.gaming();
        System.out.println();

    }
}