class Cat extends Animal {
    private static int catCount = 0;
    boolean satiety = false;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }

    @Override
    public void run(int distance) {
        if (distance < 0) {
            System.out.println("Введено некорректное значение.");
        } if (distance > 200) {
            System.out.println("Кот " + name + " смог пробежать только 200 м.");
        } else System.out.println("Кот " + name + " пробежал " + distance + " м.");
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот не плавает.");
    }

    public void FeedAnimal(Bowl bowl, int eaten) {
        if (eaten > bowl.food) {
            satiety = false;
            System.out.println("Кот " + name + " не покушал. В миске недостаточно еды.");
        } else {
            bowl.food -= eaten;
            satiety = true;
            System.out.println("Кот " + name + " наелся.");
        }
    }

    public boolean isFed() {
        return satiety;
    }
}