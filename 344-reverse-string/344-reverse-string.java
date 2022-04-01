class Solution {
    public void reverseString(char[] s) {
       for(int i = s.length -1, j = 0; i>j; i--, j++) {
           char temp = s[i];
           s[i] = s[j];
           s[j] = temp;
       }
        System.out.println(s);
    }
}