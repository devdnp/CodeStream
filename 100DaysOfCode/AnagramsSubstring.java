public class AnagramsSubstring {
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        String a1 = "listen";//scan.next();
        String b1 = "silent" ;//scan.next();
        boolean result = isAna(a1, b1);
            
        System.out.println(result);
    }
    static boolean isAna(String a1, String b1){
        if(a1.length()!=b1.length()){
            return false;
        }else{
            char[] a1Arr = a1.toCharArray();

            for (char c : a1Arr) {
                int index = b1.indexOf(c);
                if(index==-1){
                    return false;
                }else{
                    b1 = b1.substring(0, index) + b1.substring(index+1,b1.length());
                }
            }
        }

        return true;
    }

}
