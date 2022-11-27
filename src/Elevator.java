import java.util.SortedMap;

public class Elevator {
    private int currentFloor = 1; // текущий этаж
    private int minFloor; // мин этаж
    private int maxFloor; // макс этаж

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveDown() { // 1 этаж вниз
        currentFloor = currentFloor > minFloor ? currentFloor - 1 : currentFloor;
    }

    public void moveUp() { // 1 этаж вверх
        currentFloor = currentFloor < maxFloor ? currentFloor + 1 : currentFloor;
    }
    public void move(int floor) {
    if (floor < minFloor || floor > maxFloor || floor == 0) {
        System.out.println("Данного этажа нет");
    } else if (floor == currentFloor) {
        System.out.println("Вы на текущем этаже");
    } else if (floor < currentFloor) {
        while (true) {
            moveDown();
            if (currentFloor != 0) {
                System.out.println("Лифт отускается " + currentFloor + " этаж");
            }
            if (floor == currentFloor) {
                System.out.println("Лифт приехал на " + currentFloor + " этаж");
                break;
            }
        }
    }
        else if (floor > currentFloor) {
        while (true) {
            moveUp();
            if (currentFloor != 0) {
                System.out.println("Лифт поднимается " + currentFloor + " этаж");
            }
            if (floor == currentFloor) {
                System.out.println("Лифт приехал на " + currentFloor + " этаж");
                break;
            }
        }
    }

    }

}
