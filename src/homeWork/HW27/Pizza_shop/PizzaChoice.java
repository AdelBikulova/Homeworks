package homeWork.HW27.Pizza_shop;

class PizzaChoice {
    public static Pizza choosePizza(int number) {
        switch (number) {
            case 1:
                return new PizzaSalami("dough", "mozzarella", "tomato paste", "salami","Salami");
            case 2:
                return new PizzaMargarita("dough", "mozzarella", "tomato paste","Margarita");
            case 3:
                return new PizzaHawaii("dough", "mozzarella", "tomato paste", "ham", "pineapples","Hawaii");
            default:
                return null;
        }
    }
}