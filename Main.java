package Exercise;
//String s = "ADOBECODEBANC";
//String t = "ABC";
public class Main {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String resultmain = minWindow(s, t);
        System.out.println(resultmain);
    }
    public static String minWindow(String s, String t){
        String result = "";
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                if (contains(sub, t)) {
                    if (sub.length() < minLen) {
                        minLen = sub.length();
                        result = sub;
                    }
                }
            }
        }
        return result;
    }

    public static boolean contains(String sub, String t){
        for (char c : t.toCharArray()){
            if (!sub.contains(String.valueOf(c))){
                return false;
            }
        }
        return true;
    }
}
