public class Main {
    public static void main(String[] args) {

        /*Elevator elevator = new Elevator(-3, 26);
        while (true) {
            System.out.print("Введите номер этажа: ");
            int floor = new Scanner(System.in).nextInt();
            elevator.move(floor);
        } */


        Dimensions dimensions = new Dimensions();
        Cargo cargo = new Cargo(dimensions, 490, "Питер", "Можно ", " ап 3245д", " Да");
        /*cargo.setAddress("город Москва");
        cargo.setDimensions(50);
        cargo.setFragile("Да");
        cargo.setNumber("CN35672");
        cargo.setWeight(490);
        cargo.setRotate("Можно");
        System.out.println("Информация о грузе: " + cargo );*/

        Dimensions copy = new Dimensions(dimensions.getWidth(), dimensions.getHeight(), dimensions.getLength());
        System.out.println("Информация о грузе: " + cargo);
        System.out.println();
        Dimensions copy1 = new Dimensions();
        Cargo cargo1 = new Cargo(dimensions, 5577, "Калининград", "Нельзя", "834762748872Dfr", "Нет");
        cargo1.getWeight();
        cargo1.getAddress();
        cargo1.getNumber();
        cargo1.getRotate();
        cargo1.getFragile();

        System.out.println("Инфо о грузе: " + cargo1);


    }
}
