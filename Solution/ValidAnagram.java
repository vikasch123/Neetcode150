class ValidAnagram {
    public boolean isAnagram(String s, String t) {

        
        int [] alphabet = new int[26];


        if(s.length()!=t.length())
        return false;

        for(int i=0;i<s.length();i++)
        {
            alphabet[s.charAt(i) - 'a']++;
            alphabet[t.charAt(i) - 'a']--;
        }


        for(int nums:alphabet)
        {
            if(nums!=0)
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ValidAnagram ob=new ValidAnagram();
       System.out.println( ob.isAnagram("racecar", "carrace"));
    }
}
