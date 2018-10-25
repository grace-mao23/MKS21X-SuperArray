public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray() {
    data = new String[10];
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
      return null;
    } else {
      return data[i];
    }
  }
  public String set(int i, String str) {
    if (i < 0 || i >= size()) {
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
    System.out.println("Resized!");
  }

}
