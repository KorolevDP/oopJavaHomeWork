package Services;

import Domain.Places;

import java.util.ArrayList;
import java.util.List;

//класс спиралей, на которых держатся товары
public class Holder {
    private List<Places> places; // список спиралей

    // метод генерации спиралей с позициями
    public Holder(int xSize, int ySize) {
        places = new ArrayList<>(xSize * ySize);
        for (int x = 0; x < xSize; x++) {
            for (int y = 0; y < ySize; y++) {
                places.add(new Places(x, y));
            }
        }
    }

    // метод выдачи выбранного товара
    public boolean release(int x, int y) {
        return places.stream().filter(place -> place.getCol() == x && place.getRow() == y)
                .findFirst().get().setEmpty(true);
    }

    public int getBalance() {
        return 0;
    }
}