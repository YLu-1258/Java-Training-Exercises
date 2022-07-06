public class teaParty {
    
    static int tea(int tea, int candy) {
        if ((tea < 5) || (candy < 5)) {
            return 0;
        }
        else if ((tea > candy*2) || (candy > tea*2)) {
            return 2;
        }
        else {
            return 1;
        }
    }
    public static void main(String[] args) {
        System.out.println(tea(6,8));
        System.out.println(tea(3,8));
        System.out.println(tea(20,6));
    }
}
