public class Q2 {
    public static void main(String[] args) {
        String animal1 = "quick brown fox";
        String animal2 = " lazy dog";
        String article = " the";
        String action = " jumps over";

        String sentence =animal1.concat(action).concat(article).concat(animal2);
        System.out.println("\n=====Using the contact method====");
        System.out.println(sentence);
        System.out.println(sentence.length());

        System.out.println("\n=====Using the + operator====");
        System.out.println(animal1 + action + article + animal2);


    }
}

