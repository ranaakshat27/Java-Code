package Assignment21;

public class Removeall {

	public static void removeChar(String word, char ch) {
        word = word.replace(Character.toString(ch), "");
        System.out.println(word);
    }
 
    public static void main(String[] args) {
        String word = "java is a base";
        removeChar(word, 'a');
		}
}
