public class SuperArray{
  private String[] data;
  private int size;

  // default
  public SuperArray() {
    data = new String[10];
  }
  // other choice
  public SuperArray(int startingCapacity) {
    data = new String[startingCapacity];
  }

  public void clear() {
    size = 0;
  }

  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public boolean add(String str) {
    int a = size();
    if (size() == data.length) {
      resize();
    }
    data[a] = str;
    size++;
    return true;
  }

  public String toString() {
    String result = "[";
    for (int i = 0; i < size(); i++) {
      result += data[i] + ", ";
    }
    if (!result.equals("[")) {
      result = result.substring(0,result.length() - 2);
    }
    result += "]";
    return result;
  }
  public String toStringDebug() {
    String result = "[";
    for (int i = 0; i < data.length; i++) {
      result += data[i] + ", ";
    }
    if (!result.equals("[")) {
      result = result.substring(0,result.length() - 2);
    }
    result += "]";
    return result;
  }

  public String get(int i) {
    if (i < 0 || i >= size()) {
      throw new IndexOutOfBoundsException();
    } else {
      return data[i];
    }
  }
  public String set(int i, String str) {
    if (i < 0 || i >= size()) {
      System.out.println("Error: index out of range");
      return null;
    } else {
      String old = data[i];
      data[i] = str;
      return old;
    }
  }

  private void resize() {
    String[] newData;
    newData = new String[size() * 2 + 1];
    for (int i = 0; i < size(); i++) {
      newData[i] = data[i];
    }
    data = newData;
    // For Testing Purposes - Delete Later
    // System.out.println("Resized!");
  }

  public boolean contains(String target) {
    for (int i = 0; i < size(); i++) {
      if (data[i].equals(target)) {
        return true;
      }
    }
    return false;
  }
  public int indexOf(String target) {
    for (int i = 0; i < size(); i++) {
      if (data[i].equals(target)) {
        return i;
      }
    }
    return -1;
  }
  public int lastIndexOf(String target) {
    for (int i = size() - 1; i >= 0; i--) {
      if (data[i].equals(target)) {
        return i;
      }
    }
    return -1;
  }

  public void add(int index, String str) {
    if (index < 0 || index > size()) {
      System.out.println("Error: Index out of range");
    } else {
      if (size() == data.length) {
        resize();
      }
      for (int i = size() - 1; i >= index; i--) {
        data[i+1] = data[i];
      }
      data[index] = str;
      size++;
    }
  }

  public String remove(int index) {
    if (index < 0 || index > size()) {
      System.out.println("Error: Index out of range");
    } else {
      String result = data[index];
      for (int i = index; i < size() - 1; i++) {
        data[i] = data[i+1];
      }
      size--;
      return result;
    }
    return null;
  }

  public boolean remove(String str) {
    if (indexOf(str) == -1) {
      return false;
    } else {
      remove(indexOf(str));
      return true;
    }
  }
}
