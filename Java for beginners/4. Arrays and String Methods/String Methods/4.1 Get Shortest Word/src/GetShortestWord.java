public class GetShortestWord
{
    //code the method getShortestWord that accepts two words and returns the shortest one
    public static String getShortestWord(String str1, String str2){
        if(str1.length() > str2.length()){
            return str2;
        }
        else{
            if (str2.length() > str1.length()){
                return str1;
            }
            else{
                return str2;
            }
        }
    }
}