import java.util.ArrayList;
import java.util.Scanner;

public class soundex {
    public static void sound(String word) {
            ArrayList<Character> bokstav = new ArrayList<>();
            bokstav.add(word.charAt(0));
            for (int i = 1; i < word.length(); i++) {
                if (!(word.charAt(i) == bokstav.get(bokstav.size()-1))) {
                    bokstav.add(word.charAt(i));
                }
            }
            ArrayList<Integer> lista = new ArrayList<>();
            lista.add(0);
            for(int i = 0; i < bokstav.size(); i++) {
                switch (bokstav.get(i)) {
                    case 'B':
                    case 'F':
                    case 'P':
                    case 'V':
                        if(!(1 == lista.get(lista.size()-1))){
                            System.out.print('1');
                            lista.add(1);
                        }
                        break;
                    case 'C':
                    case 'G':
                    case 'J':
                    case 'K':
                    case 'Q':
                    case 'S':
                    case 'Z':
                    case 'X':
                        if(!(2 == lista.get(lista.size()-1))){
                            System.out.print('2');
                            lista.add(2);
                        }
                        break;
                    case 'D':
                    case 'T':
                        if(!(3 == lista.get(lista.size()-1))){
                            System.out.print('3');
                            lista.add(3);
                        }
                        break;
                    case 'L':
                        if(!(4 == lista.get(lista.size()-1))){
                            System.out.print('4');
                            lista.add(4);
                        }
                        break;
                    case 'M':
                    case 'N':
                        if(!(5 == lista.get(lista.size()-1))){
                            System.out.print('5');
                            lista.add(5);
                        }
                        break;
                    case 'R':
                        if(!(6 == lista.get(lista.size()-1))){
                            System.out.print('6');
                            lista.add(6);
                        }
                        break;
                    default:
                        lista.add(0);
                        break;
                }
            }
            System.out.println();
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){ 
            sound(scan.next());
        }
        scan.close();
    }
}