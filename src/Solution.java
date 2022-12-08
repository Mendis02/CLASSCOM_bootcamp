import java.util.HashMap;
class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> romantoint= new HashMap<Character,Integer>();
        romantoint.put('I',1);
        romantoint.put('V',5);
        romantoint.put('X',10);
        romantoint.put('L',50);
        romantoint.put('C',100);
        romantoint.put('D',500);
        romantoint.put('M',1000);

        int lengthofs = s.length();
        int total = 0;
        int i = 0;

        while(i<lengthofs){
//s = XIV
            if(romantoint.get(s.charAt(i)) >= romantoint.get(s.charAt(i+1))){
                total=total+ romantoint.get(s.charAt(i));
                i=i+1;
            }else{
                total = total + romantoint.get(s.charAt(i+1))-romantoint.get(s.charAt(i));
                i=i+2;
            }
        }

        return total;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        int tm = obj.romanToInt("MCMXCIV");
        System.out.println(tm);
    }
}