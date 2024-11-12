class Dog extends Animal {

    private static int dogCount = 0;

    public Dog (String name) {
        super(name);
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }

    @Override
    public void run(int distance) {
        if (distance < 0) {
            System.out.println("Введено некорректное значение");
        }
        if (distance > 500) {
            System.out.println("Пес " + name + " смог пробежать только 200 м.");
        } else System.out.println("Пес " + name + " пробежал " + distance + " м.");
    }

    @Override
    public void swim(int distance) {
        if (distance < 0) {
            System.out.println("Введено некорректное значение");
        }
        if (distance > 10) {
            System.out.println("Пес " + name + " смог проплыть только 10 м.");
        } else System.out.println("Пес " + name + " проплыл " + distance + " м.");
    }
}