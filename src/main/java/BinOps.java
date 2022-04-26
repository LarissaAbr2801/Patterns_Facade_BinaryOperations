public class BinOps {

    public String sum(String a, String b) {
        int arg1 = Integer.parseInt(a, 2); //перевод чисел из двоичной заиписи в int
        int arg2 = Integer.parseInt(b, 2);
        int sum = arg1 + arg2;

        return Integer.toBinaryString(sum);
    }

    public String mult(String a, String b) {
        int arg1 = Integer.parseInt(a, 2); //перевод чисел из двоичной заиписи в int
        int arg2 = Integer.parseInt(b, 2);
        int mult = arg1 * arg2;

        return Integer.toBinaryString(mult);
    }
}