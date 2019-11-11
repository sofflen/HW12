public class Collection {

    private String[] arr;
    private int count = 0;

    Collection() {
        arr = new String[10];
    }

    public int getSize() {
        return count;
    }

    boolean add(String string) {
        String[] arrNew;
        if (count < arr.length) {
            arr[count] = string;
        } else {
            arrNew = new String[(int) (arr.length * 1.6)];
            for (int i = 0; i < arr.length; i++) {
                arrNew[i] = arr[i];
            }
            arrNew[count] = string;
            arr = arrNew;
        }
        count++;
        return true;
    }

    boolean contains(String string) {
        return indexOf(string) >= 0;
    }

    boolean delete(int index) {
        if (index > count - 1) {
            return false;
        } else {
            for (int i = index; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            count--;
        }
        return true;
    }

    boolean delete(String string) {
        if (contains(string)) {
            for (int i = indexOf(string); i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            count--;
            return true;
        } else {
            return false;
        }
    }

    String getByIndex(int index) {
        if (index > count - 1) {
            return null;
        } else {
            return arr[index];
        }
    }

    boolean equals(Collection collection) {
        if (this.count != collection.count) {
            return false;
        }
        for (int i = 0; i < collection.count; i++) {
            if (!this.contains(collection.getByIndex(i))) return false;
        }
        return true;
    }

    int indexOf(String string) {
        for (int i = 0; i < count; i++) {
            if (string.equals(arr[i])) {
                return i;
            }
        }
        return -1;
    }

    void clear() {
        for (int i = 0; i < count; i++) {
            arr[i] = null;
        }
        count = 0;
    }
}

