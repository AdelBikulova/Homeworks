package homeWork.HW29.garten;

public class Garden {

    /*
    Проект Садовод-любитель. Будем выращивать растения в течение нескольких лет и смотреть что получилось.

    Задача: Выращиваем деревья и цветы. Каждый из этих видов имеет следующие характеристики:

    - displayName, height, age
    Каждый из них вырастает за сезон на одинаковую высоту, т.е. одинаковую для всех деревьев и всех цветов.
    Каждый сезон состоит из 4 времен года, в котором цветы и деревья ведут себя не всегда одинаково:

    Для цветов: сезон начинается весной, зимой они не растут, летом они не растут, а цветут, осенью их срезают
    Для деревьев: сезон начинается весной, зимой они не растут, летом растут, осенью не растут

    В классе Garden нужно создать метод growPlants()..., в котором будет подробно отражен процесс роста
    минимум двух растений (дерева и цветка) в течение нескольких лет:
    Что происходит зимой, летом, весной и осенью, т.е. их размер в каждое время года и какого размера
    и возраста они будут в конце.

    Spring - Summer - Autumn - Winter


    Growing plants for 2 years:

    Tulip has grow in Spring, 20
    Tulip is not growing in summer, 20
    ------------------
    ------------------
    Pine tree has grow in Summer, 220


    Tulip has height: 25 and is 3 years old
    Pine has height: 150 and is 3 years old

    Алгоритм:
    1. Создать три класса. Родительский Plant и дочерние Flower и Tree
    2. В классах должны быть общие характеристики name, height, age и поведение, выраженное методами:

            doSpring()
            doSummer()
            doAutumn()
            doWinter()

            Подумать, какие из них лучше объявить абстактными, а какие реализовать в родительском классе

     3. В методе growPlant реализовать смену сезона с помощью цикла/циклов for

     */
    public static void main(String[] args) {

        Flower tulip = new Flower("Tulip", 0, 0);
        Tree pineTree = new Tree("Pine tree", 0, 0);

        Flower rose = new Flower("Rose", 0, 0);
        Tree birchTree = new Tree("Birch tree", 0, 0);

        Plant[] plants = {tulip, rose, pineTree, birchTree};

        growPlants(plants, 3);

    }

    public static void growPlants(Plant[] plants, int years) {
        for (int year = 1; year <= years; year++) {
            for (Plant plant : plants) {
                plant.doSpring();
                plant.doSummer();
                plant.doAutumn();
                plant.doWinter();

                System.out.println();
            }
        }
    }
}