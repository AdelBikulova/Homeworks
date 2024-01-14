package homeWork.HW36;

public class Main {

    public static void main(String[] args) {

        OurList<Integer> ourList1 = new OurArrayList<>();
        OurList<Integer> ourList2 = new OurArrayList<>();
        OurList<Integer> ourList3 = new OurArrayList<>();
        OurList<Integer> ourList4 = new OurArrayList<>();
        OurList<Integer> ourList5 = new OurArrayList<>();

        System.out.println();

        ourList1.append(5);
        ourList1.append(8);
        ourList2.append(13);
        ourList3.append(15);
        ourList4.append(28);
        ourList5.append(30);
        ourList5.append(42);
        ourList5.append(53);

        System.out.println("Size ourList1: " + ourList1.size());
        System.out.println("Size ourList2: " + ourList2.size());
        System.out.println("Size ourList3: " + ourList3.size());
        System.out.println("Size ourList4: " + ourList4.size());
        System.out.println("Size ourList5: " + ourList5.size());

        System.out.println();

        ourList3.get(0);
        ourList5.get(2);
        System.out.println("Element at index 1 в ourList3: " + ourList3.get(0));
        System.out.println("Element at index 2 в ourList5: " + ourList5.get(2));

        System.out.println();

        ourList2.set(358, 0);
        ourList4.set(469, 0);
        System.out.println("New Element at index 0 в ourList2: " + ourList2.get(0));
        System.out.println("New Element at index 2 в ourList4: " + ourList4.get(0));

        System.out.println();

        ourList1.remove(5);
        System.out.println("Size ourList1 after remove : " + ourList1.size());

        System.out.println();

        Integer E = ourList5.removeById(1);
        if (E != null) {
            System.out.println("Removed element: " + E);
        } else {
            System.out.println("Element not found");
        }

        System.out.println("Size ourList1 after removeById: " + ourList1.size());
    }

}
