/*
22: Count and report the number of occurrences of each character in a given string?

    Hello World    Students Allowed       Holocaust
       D = 1           A - 1                A - 1
       E - 1           D - 2                C - 1
       H - 1           E - 2                H - 1
       L - 3           L - 1                L - 1
       O - 2           N - 1                O - 2
       R - 1           O - 1                S - 1
       W - 1           S - 2                T - 1
                       T - 2                U - 1
                       U - 1
                       W - 1
*/
public class Occurances {
        public static void main(String[] args) {
            String words = "A place where someone thinks about you is a place you can call home";
            int count[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
            char c;
            for(int i=0; i<words.length(); i++) {
                c = words.charAt(i);
                if(c>=65 && c<=90) {
                    count[c-65]++;
                } else if(c>=97 && c<=122) {
                    count[c-97]++;
                }
            }
    
            for(int i=0; i<count.length; i++) {
                if(count[i]>0) {
                    System.out.println( (char)(i+65) + " = " + count[i] );
                }
            }
        }
    }

