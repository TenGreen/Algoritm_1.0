import interfase.StringListInterfase;

public class StringList  implements StringListInterfase {
    @Override
    public String add(String item) {
        return null;
        // Добавление элемента.
        // Вернуть добавленный элемент
        // в качестве результата выполнения.
    }

    @Override
    public String add(int index, String item) {
        return null;
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
        return null;
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
        return null;
    }

    @Override
    public String remove(int index) {
        return null;
        // Удаление элемента по индексу.
        // Вернуть удаленный элемент
        // или исключение, если подобный
        // элемент отсутствует в списке.
    }

    @Override
    public boolean contains(String item) {
        return false;
        // Проверка на существование элемента.
        // Вернуть true/false;
    }

    @Override
    public int indexOf(String item) {
        return 0;
    }

    @Override
    public int lastIndexOf(String item) {
        return 0;
        // Поиск элемента с конца.
        // Вернуть индекс элемента
        // или -1 в случае отсутствия.
    }

    @Override
    public String get(int index) {
        return null;
        // Получить элемент по индексу.
        // Вернуть элемент или исключение,
        // если выходит за рамки фактического
        // количества элементов.

    }

    @Override
    public boolean equals(StringListInterfase otherList) {
        return false;
        // Сравнить текущий список с другим.
        // Вернуть true/false или исключение,
        // если передан null.
    }

    @Override
    public int size() {
        return 0;
        // Вернуть фактическое количество элементов.
    }

    @Override
    public boolean isEmpty() {
        return false;
        // Вернуть true,
        // если элементов в списке нет,
        // иначе false.
    }

    @Override
    public void clear() {
// Удалить все элементы из списка.
    }

    @Override
    public String[] toArray() {
        return new String[0];
        // Создать новый массив
        // из строк в списке
        // и вернуть его.
    }
}
