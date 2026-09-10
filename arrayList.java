
    import java.util.ArrayList;

public class arrayList {
  public static void main(String[] args) {
    ArrayList<String> List = new ArrayList<String>();
    List.add("Apple");
    List.add("banana");
    List.add("orange");
    List.add("grapes");
    System.out.println(List);
  }
}

//remove an element from the list
List.remove("banana");
System.out.println(List);
// remove last element
List.remove(List.size() - 1);
System.out.println(List);
// get first element of the list
String firstElement = List.get(0);
System.out.println("First element: " + firstElement);
