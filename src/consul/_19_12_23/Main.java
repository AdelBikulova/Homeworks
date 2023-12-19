package consul._19_12_23;

public class Main {

    // Девочки на уроках труда готовят суп, а мальчики делают табурет.
    // Используя свойства наследования и абстрактных классов создать соотвествующие классы, затем создать
    // массив из 2 мальчиков и 2 девочек и вывести на экран их имя, фамилию, возраст и занятие на уроке труда

    /*
    Имя =  Джон, фамилия Блек, возраст = 14, Джон делает табуретки
    Имя =  Кейт, фамилия Вайт, возраст 12, Кэйт готовит суп
     */

    public static void main(String[] args) {
        Pupil boy1 = new Boy("John", "Black", 14);
        Pupil boy2 = new Boy("Bill", "Clinton", 13);
        Pupil girl1 = new Girl("Kate", "White", 12);
        Pupil girl2 = new Girl("Ann", "Braun", 11);


        Pupil[] pupils = {boy1, boy2, girl1, girl2};

        for (Pupil pupil : pupils) {
            System.out.println(pupil);
            pupil.work();

        }
    }
}