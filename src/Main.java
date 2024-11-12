public class Main {
    public static void main(String[] args) {

        System.out.println("\nЗадание №1\n");

        Cat cat1 = new Cat("Бася");
        cat1.run(50);
        cat1.swim(34);

        Dog dog1 = new Dog("Шарик");
        Dog dog2 = new Dog("Рекс");
        dog1.run(654);
        dog2.run(360);
        dog1.swim(5);


        Cat[] cats = {
                new Cat("Мурзик"),
                new Cat("Кузя"),
                new Cat("Барон"),
                new Cat("Леопольд")
        };

        Bowl bowl = new Bowl(0);
        bowl.AddFood(30);

        cat1.FeedAnimal(bowl, 10);

        for (Cat cat : cats) {
            cat.FeedAnimal(bowl, 8);
        }
        for  (int i = 0; i < cats.length; i++) {
            System.out.println("Кот " + cats[i].getName() + " сыт: " + cats[i].isFed());
        }

        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Всего собак: " + Dog.getDogCount());
        System.out.println("Всего котов: " + Cat.getCatCount());

        System.out.println("\nЗадание №2\n");

        Figure circle1 = new Circle(6, "Красный", "Желтый");
        Figure rectangle1 = new Rectangle(2, 4, "Синий", "Красный");
        Figure triangle1 = new Triangle(5, 6, 2, "Фиолетовый", "Зеленый");

        circle1.printFigureInfo();
        System.out.println();

        rectangle1.printFigureInfo();
        System.out.println();

        triangle1.printFigureInfo();
    }
}


