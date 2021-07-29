public class Q5 {
 
    static boolean isPalindrome(String str)
    {
        int i = 0, j = str.length() - 1;
 
        while (i < j) {
            
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }

        return true;
    }
 
    public static void main(String[] args)
    {
        String[] str = {"mobil","katak","motor","kakak","adik","malam"};
        
        System.out.println("PALINDROME TEXT CHECKER");
        
        for (int i = 0; i < str.length; i++){
            
             if (isPalindrome(str[i]))
                  System.out.println(str[i] + " : Benar");
             else
                  System.out.println(str[i] + " : Salah");
                  
        }
    }
}