public abstract class Animal {
    protected String name;
    static int animalCount = 0;


    public Animal(String name) {
        this.name = name;
        boolean satiety = false;
        animalCount++;
    }
    public static int getAnimalCount() {
        return animalCount;
    }

    public String getName() {
        return name;
    }

    public abstract void run(int distance);
    public abstract void swim(int distance);
}

