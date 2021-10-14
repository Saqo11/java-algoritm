public class xnd165 {
    public static void main(String[] args) {
        String a = "av5q4ad5v6a";
        String b = "abcscscbaabhjhuhab";
        System.out.println(a.replace("a","b"));
        System.out.println(b.replace("ab",""));
        System.out.println(b.codePointAt(0));

        String value = "C";
        int charValue = value.charAt(0);
        String next = String.valueOf( (char) (charValue + 1));
        String previous = String.valueOf((char)(charValue-1));
        System.out.println(next + "  " +  previous);
    }
}
