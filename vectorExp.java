import java.util.Vector;

public class vectorExp {
    public static void main(String[] args) {
        Vector<String> vectorList = new Vector<>();
        vectorList.add("c");
        vectorList.add("c++");
        vectorList.add("java");
        vectorList.add("JS");
        vectorList.add("PHP");
        System.out.println("Vector List is" + vectorList);

        //add at first node
        vectorList.add(0, "python");
        System.out.println("Vector List after adding at first node is" + vectorList);
    }
}
