class characterReplacement{
   
    public static int characterReplacement(String s, int k) {
        int [] freq = new int[26];
        int max=0;
        int win=0;
        int l=0;
        int x=0;
        for(int i=0;i<s.length();i++)
        {
            freq[s.charAt(i)-'A']++;
             max = Math.max(max, freq[s.charAt(i)-'A']);

             win = i-l+1;
             x=win-max;

             if(x>k){
                freq[s.charAt(l)-'A']--;
                l++;
             }
        }
      return  s.length()-l; 
        
    }
    public static void main(String[] args) {
        
        String s = "AABABBA";
        int k = 1;

        int result = characterReplacement(s, k);
        System.out.println(result); // Expected output: 4
    }
}