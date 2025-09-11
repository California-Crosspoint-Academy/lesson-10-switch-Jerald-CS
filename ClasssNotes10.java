public class ClassNotes10 {
    public static void main(String[] args){
        String s = "Green";
        int q = 0;
        switch(s) {
        case "Red": q++;
        case "Green": q++;
        case "Blue": q++;
        default: q++;
        }
        System.out.println(--q);  // prints 3

        String man = "X";
        char chr = man.charAt(0);

        char myChar = 'G';
        int y = 0;

        switch(myChar) {
        case 'G':
        case 'g': y++; break;
        case 'M':
        case 'm': y--; break;
        default: y += 100; break;
        
        }
    }
}