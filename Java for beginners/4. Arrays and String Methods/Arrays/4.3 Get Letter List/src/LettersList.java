public class LettersList
{
    //code the getLetterList method that accepts a word as argument and returns a list of its letters
    public static String[] getLetterList(String str){
        String[] list = new String[str.length()];
        for (int i = 0; i < str.length(); i++){
            list[i] = str.substring(i, i+1);

        }
        return list;
    }
}