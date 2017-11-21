package lv.javaguru.homework.Hash;

public class HumanComparator {
    public static void main(String[] args) {
        Human human1 = new Human("150110-11234", "Andrey");
        Human human2 = new Human("112233-11221","Dmitry");
        Human human3 = new Human("112233-11221","Dmitry");

        System.out.println(human2.equals(human3));
        System.out.println(human2 == human3);



    }
}
