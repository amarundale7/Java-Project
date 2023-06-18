public class ListDemo{

  LinkedList<String, Integer> list = new LinkedList<>();
  list.add("A", 123);
  list.add("B", 345);

list.Stream().forEach(a->System.out.println(a));

}
