// Задание 3
public class Park {
    public static class Attractions {
        private String name;
        private String openingHours;
        private int price;

        public Attractions(String name, String openingHours, int price) {
            this.name = name;
            this.openingHours = openingHours;
            this.price = price;
        }

        public void getInfo() {
            System.out.println("Информация об аттракционе: " + name + ", " + openingHours + ", " + price + " руб.");
        }

        public static void main(String args[]) {

            Park.Attractions[] attractions = new Park.Attractions[4];

            attractions[0] = new Park.Attractions("Колесо обозрения", "11:00-23:00", 200);
            attractions[1] = new Park.Attractions("Американские горки", "12:00-23:00", 400);
            attractions[2] = new Park.Attractions("Комната смеха", "10:00-22:00", 250);
            attractions[3] = new Park.Attractions("Карусель", "10:00-20:00", 150);

            for (Park.Attractions information : attractions) {
                information.getInfo();
            }
        }
    }
}


