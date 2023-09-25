public class roman {
    public static int value(char c){
        switch(c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }
    public static int romanToInt(String s) {
        int roman = 0;
        for(int i=s.length()-1; i>=0; i--){
            char c = s.charAt(i);
            int v = value(c);
            if(roman <= c){
                roman += v;
            }
            else{
                roman -= v;
            }
            System.out.println("roman " + roman);
        }
        return roman;
    }
    public static void main(String[] args) {
        long ans = romanToInt("III");
        System.out.println(ans);
    }
}
