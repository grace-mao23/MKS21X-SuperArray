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

  public boolean add(String) {
    data[size] = String;
    size++;
  }

  public String toString() {
    String result = "[ ";
    for (int i = 0; i < size(); i++) {
      result += data[i] + ", ";
    }
    result = result.substring(0,result.length() - 2);
    result += "]";
    return result;
  }
  public String toStringDebug() {
    String result = "[ ";
    for (int i = 0; i < data.length; i++) {
      result += data[i] + ", ";
    }
    result = result.substring(0,result.length() - 2);
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
      data[i] = str;
      return null;
    }
  }

}
