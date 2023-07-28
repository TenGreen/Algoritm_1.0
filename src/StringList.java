import exeption.*;
import interfase.StringListInterface;


public class StringList implements StringListInterface {

    private String[] strings;

    public StringList(int size) {
        this.strings = new String[size];
    }

    @Override
    public String add(String item) {
        if (item == null) {
            throw new ItemIsNull();
        }
        int actual = 0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] == null) {
                strings[i] = item;
                actual = i;
                break;
            }
        }
        if ((strings.length / actual) > 0.75f) {
            IncreaseOverallSize(strings);
        }

        return strings[actual];
    }

    private static String[] IncreaseOverallSize(String[] strings) {
        String[] newString = new String[(int) (strings.length * 1.5f)];
        for (int i = 0; i < strings.length; i++) {
            newString[i] = strings[i];
            strings[i] = null;
        }
        return newString;
    }
    // Добавление элемента.
    // Вернуть добавленный элемент
    // в качестве результата выполнения.


    @Override
    public String add(int index, String item) {
        if (item == null) {
            throw new ItemIsNull();
        }
        if (index >= strings.length) {
            throw new IndexIsLargerOfSizeArray();
        }
        if (strings[index - 1] == null) {
            throw new IndexIsLargerOfSizeArray();
        }
        strings[index] = item;
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
        if (item == null) {
            throw new ItemIsNull();
        }
        strings[index] = item;
        if (index >= strings.length) {
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
        if (item == null) {
            throw new ItemIsNull();
        }
        String actual = null;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals(item)) {
                actual = strings[i];
                strings[i] = null;
                break;
            }
        }
        if (actual == null) {
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
        if (item == null) {
            throw new ItemIsNull();
        }
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
        if (item == null) {
            throw new ItemIsNull();
        }
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
        if (item == null) {
            throw new ItemIsNull();
        }
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
        if (index >= strings.length) {
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
