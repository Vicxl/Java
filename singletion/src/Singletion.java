public class Singletion {
    private static volatile Singletion singletion;

    private Singletion() {};
    public static Singletion getlnstance() {
        //双重检查
        if (singletion == null) {
            synchronized (Singletion.class) {
                if (singletion == null) {
                    singletion = new Singletion();
                }
            }
        }
        return singletion;
    }
}
