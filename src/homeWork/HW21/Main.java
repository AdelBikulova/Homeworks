package homeWork.HW21;

public class Main {

    /*
    Создать класс Dog c полями name , counter и конструктором. Cоздать несколько обьектов этого класса и
     вывести на печать количество созданных обьектов.
     */

    public static void main(String[] args) {
        Dog dog1 = new Dog ("Bim");
        Dog dog2 = new Dog ("Lulu");
        Dog dog3 = new Dog ("Micky");
        Dog dog4 = new Dog ("Rex");
        Dog dog5 = new Dog ("Layda");

        System.out.println("There are " + Dog.counter + " dogs");

    }

}
