public class ServerNameGenerator {

    public static String[] adjectives = {"charming", "fun", "happy", "sad", "resourceful",
    "sad", "gnarly", "joyful", "tall", "short"};

    public static String[] nouns = {"horse", "cow", "dinosaur", "cat", "dog", "mouse", "bird",
    "pony", "eagle", "coyote"};

    public static int rando () {
        return (int) Math.floor(Math.random() * 10);
    }

    public static void main(String[] args) {
        System.out.println("Your new server name is: " + "\n" + adjectives[rando()] + "-" + nouns[rando()]);
    }

}

