public final class StringUtils {
    private StringUtils(){}

    public static int findSymbolOccurrence(String string, char chr){
        int result = 0;
        for (int i = 0; i < string.length(); i++ ){
            if (string.charAt(i) == chr)
                result++;
        }
        return result;
    }

    public static int findWordPosition(String source, String target){
        return source.indexOf(target);
    }

    public static String stringReverse(String str){
        return new StringBuilder(str).reverse().toString();
    }

    public static boolean isPalindrome(String str){
        for (int i = 0; i < str.length() / 2; i++){
            int j = str.length() - i - 1;
            if (str.charAt(i) != str.charAt(j))
                return false;
        }
        return true;
    }
}
