class Bowl {
    int food;

    public Bowl(int food) {
        this.food = food;
    }

    public void AddFood(int food) {
        this.food += food;
        if (food < 0) {
            food = 0;
            System.out.println("В миске " + food + " ед. еды.");
        } else System.out.println("В миске " + food + " ед. еды.");
    }

    public int getFood() {
        return food;
    }
}

