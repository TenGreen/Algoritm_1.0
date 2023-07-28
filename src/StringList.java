import exeption.ArrayIsEmpty;
import exeption.ArrayIsFull;
import exeption.IndexIsLargerOfSizeArray;
import exeption.NotFoundExeptoin;
import interfase.StringListInterface;
import interfase.StringListInterface;


public class StringList implements StringListInterface {

    private String[] strings;

    public StringList(int size) {
        this.strings = new String[size];
    }

    @Override
    public String add(String item) throws ArrayIsFull {
        boolean addTrue = false;
        int actual = 0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] == null) {
                strings[i] = item;
                actual = i;
                addTrue = true;
                break;
            }
        }
        if (!addTrue) {
            throw new ArrayIsFull();
        }
        return strings[actual];
    }
    // Добавление элемента.
    // Вернуть добавленный элемент
    // в качестве результата выполнения.


    @Override
    public String add(int index, String item) {
        if (index >= strings.length){
            throw new IndexIsLargerOfSizeArray();
        }
        if (strings[index] == null) {
            strings[index] = item;
        } else throw new ArrayIsFull();
        return strings[index];
        // Добавление элемента
        // на определенную позицию списка.
        // Если выходит за пределы фактического
        // количества элементов или массива,
        // выбросить исключение.
        // Вернуть добавленный элемент
        // в качестве результата выполнения.
    }

    @Override
    public String set(int index, String item) {
        strings[index] = item;
        if (index >= strings.length){
            throw new IndexIsLargerOfSizeArray();
        }
        return strings[index];
        // Установить элемент
        // на определенную позицию,
        // затерев существующий.
        // Выбросить исключение,
        // если индекс больше
        // фактического количества элементов
        // или выходит за пределы массива.
    }

    @Override
    public String remove(String item) {
        String actual = null;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals(item)) {
                actual = strings[i];
                strings[i] = null;
                break;
            }
        }
        if (actual == null){
            throw new NotFoundExeptoin();
        }
        return actual;
    }
    // Удаление элемента.
    // Вернуть удаленный элемент
    // или исключение, если подобный
    // элемент отсутствует в списке.

    @Override
    public String remove(int index) {
        String actual = null;
        if (strings[index] != null) {
            actual = strings[index];
            strings[index] = null;
        }
        if (actual == null) {
            throw new NotFoundExeptoin();
        }
        return actual;
        // Удаление элемента по индексу.
        // Вернуть удаленный элемент
        // или исключение, если подобный
        // элемент отсутствует в списке.
    }

    @Override
    public boolean contains(String item) {
        boolean result = false;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals(item)) {
                result = true;
                break;
            }
        }
        return result;
        // Проверка на существование элемента.
        // Вернуть true/false;
    }

    @Override
    public int indexOf(String item) {
        int index = -1;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals(item)) {
                index = i;
                break;
            }
        }
        return index;
    }
    // Поиск элемента.
    // Вернуть индекс элемента
    // или -1 в случае отсутствия.

    @Override
    public int lastIndexOf(String item) {
        int index = -1;
        for (int i = strings.length; i == 0; i--) {
            if (strings[i].equals(item)) {
                index = i;
                break;
            }
        }
        return index;
    }
        // Поиск элемента с конца.
        // Вернуть индекс элемента
        // или -1 в случае отсутствия.


    @Override
    public String get(int index) {
        if (index >= strings.length){
            throw new IndexIsLargerOfSizeArray();
        }
        String result = strings[index];
        return result;
        // Получить элемент по индексу.
        // Вернуть элемент или исключение,
        // если выходит за рамки фактического
        // количества элементов.
    }



    @Override
    public boolean equals(StringList otherList) {
        if (otherList == null) {
            throw new ArrayIsEmpty();
        }
        boolean result = false;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals(otherList[i])) {
                break;
            }
        }
        return result;
        // Сравнить текущий список с другим.
        // Вернуть true/false или исключение,
        // если передан null.
    }

    @Override
    public int size() {
        int result = 0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] != null) {
                result++;
            }
        }
        return result;
        // Вернуть фактическое количество элементов.
    }

    @Override
    public boolean isEmpty() {
        boolean result = false;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] != null) {
                result = true;
            }
        }
        return result;
        // Вернуть true,
        // если элементов в списке нет,
        // иначе false.
    }

    @Override
    public void clear() {
        for (int i = 0; i < strings.length; i++) {
            strings[i] = null;
        }
// Удалить все элементы из списка.
    }

    @Override
    public String[] toArray() {
        String[] toArray = new String[];
        return toArray;
        // Создать новый массив
        // из строк в списке
        // и вернуть его.
    }
}
