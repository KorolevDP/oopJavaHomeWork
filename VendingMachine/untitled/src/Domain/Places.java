package Domain;

// класс места в VendMachine
public class Places {
    private int row; //строка
    private int col; // столбец
    private boolean empty; // признак заполнености

    public  Places(int row, int col){
        this.row = row;
        this.col = col;
    }

    public boolean isEmpty(){
        return empty;
    }

    public boolean setEmpty(boolean empty){
        boolean result = this.empty;
        this.empty = empty;
        return result;
    }

    // определяем геттеры сеттеры для строк и столбцов
    public int getRow(){
        return row;
    }

    public void setRow(int row){
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col){
        this.col = col;
    }
}