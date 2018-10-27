public class Driver{
  public static void main(String[]args){
    SuperArray SA = new SuperArray();
    SA.clear();
    System.out.println("SA: " + SA);
    // should print "SA: []"
    System.out.println("SA(debug): " + SA.toStringDebug());
    // should print "SA(debug): [null, null, null, null, null, null, null, null, null, null]"
    System.out.println("SA size: " + SA.size());
    // should print "SA size: 0"
    System.out.println("SA isEmpty: " + SA.isEmpty());
    // should print "SA isEmpty: True"

    System.out.println();

    if (SA.add("What")) System.out.println("Added element successfully!");
    // should print "Added element successfully"
    System.out.println("SA: " + SA);
    // should print "SA: [What]"
    System.out.println("SA(debug): " + SA.toStringDebug());
    // should print "SA(debug): [What, null, null, null, null, null, null, null, null, null]"
    if (SA.add("is")) System.out.println("Added element successfully!");
    // should print "Added element successfully"
    System.out.println("SA: " + SA);
    // should print "SA: [What, is]"
    System.out.println("SA(debug): " + SA.toStringDebug());
    // should print "SA(debug): [What, is, null, null, null, null, null, null, null, null]"
    System.out.println("SA size: " + SA.size());
    // should print "SA size: 2"
    if (SA.add("this")) System.out.println("Added element successfully!");
    // should print "Added element successfully"
    System.out.println("SA: " + SA);
    // should print "SA: [What, is, this]"
    System.out.println("SA(debug): " + SA.toStringDebug());
    // should print "SA(debug): [What, is, this, null, null, null, null, null, null, null]"
    if (SA.add("witchery")) System.out.println("Added element successfully!");
    // should print "Added element successfully"
    System.out.println("SA: " + SA);
    // should print "SA: [What, is, this, witchery]"
    System.out.println("SA(debug): " + SA.toStringDebug());
    // should print "SA(debug): [What, is, this, witchery, null, null, null, null, null, null]"
    System.out.println("SA size: " + SA.size());
    // should print "SA size: 4"

    System.out.println();

    System.out.println("First element of SA: " + SA.get(0));
    // should print "First element of SA: What"
    System.out.println("Second element of SA: " + SA.get(1));
    // should print "Second element of SA: is"
    System.out.println("Third element of SA: " + SA.get(2));
    // should print "Third element of SA: this"
    System.out.println("Fourth element of SA: " + SA.get(3));
    // should print "Fourth element of SA: witchery"

    System.out.println();

    // EXCEPTION CASES WITH TRY AND CATCH FOR GET
    try {
      System.out.println("Fourth element of SA: " + SA.get(3)); // should return witchery
      System.out.println("Negative first element of SA: " + SA.get(-1)); // should trigger exception
      System.out.println(SA.get(0)); // would work, but should have no effect whatsoever due to exception above
    } catch (IndexOutOfBoundsException e) {
      System.out.println(e);
    }

    System.out.println();

    System.out.println("Old first element of SA: " + SA.set(0,"How"));
    // should print "Old first element of SA: What"
    System.out.println("SA: " + SA);
    // should print "SA: [How, is, this, witchery]"
    System.out.println("SA(debug): " + SA.toStringDebug());
    // should print "SA(debug): [How, is, this, witchery, null, null, null, null, null, null]"
    System.out.println("SA: " + SA);
    // should print "SA: [How, is, this, witchery]"
    System.out.println("SA(debug): " + SA.toStringDebug());
    // should print "SA(debug): [How, is, this, witchery, null, null, null, null, null, null]"

    System.out.println();

    // EXCEPTION CASES WITH TRY AND CATCH FOR SET
    try {
      System.out.println("Old first element of SA: " + SA.set(0,"Why")); // should return How
      System.out.println("SA: " + SA);
      System.out.println("Old tenth element of SA: " + SA.set(10,"haha")); // should trigger exception
      System.out.println("SA: " + SA); // would print, should have no effect whatsoever due to exception above
    } catch (IndexOutOfBoundsException e) {
      System.out.println(e);
    }

    System.out.println();

    SA.add("still");
    SA.add("happening");
    SA.add("?");
    SA.add("My");
    SA.add("question");
    SA.add("is");
    System.out.println("SA: " + SA);
    // should print "SA: [How, is, this, witchery, still, happening, ?, My, question, is]"
    SA.add(":");
    System.out.println("SA: " + SA);
    // should print "SA: [How, is, this, witchery, still, happening, ?, My, question, is, :]"
    SA.add("what");
    System.out.println("SA: " + SA);
    // should print "SA: [How, is, this, witchery, still, happening, ?, My, question, is, :, what]"
    SA.add("is");
    System.out.println("SA: " + SA);
    // should print "SA: [How, is, this, witchery, still, happening, ?, My, question, is, :, what, is]"
    SA.add("one");
    System.out.println("SA: " + SA);
    // should print "SA: [How, is, this, witchery, still, happening, ?, My, question, is, :, what, is, one]"
    SA.add("plus");
    System.out.println("SA: " + SA);
    // should print "SA: [How, is, this, witchery, still, happening, ?, My, question, is, :, what, is, one, plus]"
    SA.add("one");
    System.out.println("SA: " + SA);
    // should print "SA: [How, is, this, witchery, still, happening, ?, My, question, is, :, what, is, one, plus, one]"
    SA.add("?");
    System.out.println("SA: " + SA);
    // should print "SA: [How, is, this, witchery, still, happening, ?, My, question, is, :, what, is, one, plus, one, ?]"

    System.out.println();

    if (SA.contains("What")) System.out.println("SA contains the element \"What\"");
    else System.out.println("SA does not contain the element \"What\"");
    // should print "SA does not contain the element "What""
    if (SA.contains("witchery")) System.out.println("SA contains the element \"witchery\"");
    else System.out.println("SA does not contain the element \"witchery\"");
    // should print "contains the element "witchery""

    System.out.println();

    System.out.println("Index of first instance of \"Who\":" + SA.indexOf("Who"));
    // should print "Index of first instance of "Who": -1"
    System.out.println("Index of first instance of \"is\":" + SA.indexOf("is"));
    // should print "Index of first instance of "is": 1"
    System.out.println("Index of last instance of \"is\":" + SA.lastIndexOf("is"));
    // should print "Index of last instance of "is": 12"
    System.out.println("Index of last instance of \"one\":" + SA.lastIndexOf("one"));
    // should print "Index of last instance of "one": 15"
    System.out.println("Index of last instance of \"one \":" + SA.lastIndexOf("one "));
    // should print "Index of last instance of "one ": -1"

    System.out.println();

    SA.add(0,"Question");
    System.out.println("SA: " + SA);
    // should print "SA: [Question, How, is, this, witchery, still, happening, ?, My, question, is, :, what, is, one, plus, one, ?]"
    SA.add(1,":");
    System.out.println("SA: " + SA);
    // should print "SA: [Question, :, How, is, this, witchery, still, happening, ?, My, question, is, :, what, is, one, plus, one, ?]"

    System.out.println();

    // EXCEPTION CASES WITH TRY AND CATCH FOR ADD (INT, STRING)
    try {
      SA.add(16, "twenty");
      System.out.println("SA: " + SA);
      SA.add(30, "haha"); // should trigger exception
      System.out.println("SA: " + SA); // would print, should have no effect whatsoever due to exception above
    } catch (IndexOutOfBoundsException e) {
      System.out.println(e);
    }

    System.out.println();

    System.out.println("Element removed: " + SA.remove(1));
    // should print "Element removed: :"
    System.out.println("Element removed: " + SA.remove(0));
    // should print "Element removed: Question"
    System.out.println("Element removed: " + SA.remove(16));
    // should print "Element removed: ?"
    System.out.println("SA: " + SA);
    // should print "SA: [How, is, this, witchery, still, happening, My, question, is, :, what, is, one, plus, one, ?]"

    System.out.println();

    if (SA.remove("?")) System.out.println("SA: " + SA);
    else System.out.println("Index out of range, cannot remove element");
    // should print "SA: [How, is, this, witchery, still, happening, My, question, is, :, what, is, one, plus, one]"
    if (SA.remove(":")) System.out.println("SA: " + SA);
    else System.out.println("Index out of range, cannot remove element");
    // should print "SA: [How, is, this, witchery, still, happening, My, question, is, what, is, one, plus, one]"
    if (SA.remove("yadayadayada")) System.out.println("SA: " + SA);
    else System.out.println("Index out of range, cannot remove element");
    // should print "Index out of range, cannot remove element"
    if (SA.remove("howw")) System.out.println("SA: " + SA);
    else System.out.println("Index out of range, cannot remove element");
    // should print "Index out of range, cannot remove element"
  }
}
