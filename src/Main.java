
public class Main {
    public static void main(String[] args) {

            System.out.println(hasTeen(12,11,12) ? "has a Teen number":"Does not have a teen number");
            System.out.println(isTeen(13) ? "Is a Teen number":"Not a teen number");
    }

    public static boolean hasTeen (int age1, int age2, int age3){
        return (age1 >= 13 && age1 <= 19) || (age2 >= 13 && age2 <= 19) || (age3 >= 13 && age3 <= 19);
    }

    public static boolean isTeen (int teen){

        return (hasTeen(teen, teen, teen));
    }
}