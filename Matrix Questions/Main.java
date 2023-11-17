import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
  int[] count = new int[26];
 for (int i = 0; i < n; i++) {
                String s = sc.next(); 
count[s.charAt(0) - 'a']++;            }
            int max_count = 0;    
        char max_char = '\0';
            boolean duplicate = false;
            for (int i = 0; i < 26; i++) {
                if (count[i] > max_count) {
                    max_count = count[i];          
          max_char = (char) (i + 'a');         
           duplicate = false;
                } else if (count[i] == max_count) {
                    duplicate = true;                }           }
            if (duplicate) {
                System.out.println("No Duplicates Present");
            } else {
                System.out.println(max_count + " times " + max_char);            }        }
        sc.close();    }	}
