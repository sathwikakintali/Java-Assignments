public class BitwiseOperator {

    public static void main(String[] args) {
        int a = 5;
        int b = 3;


        int resultAnd = a & b;
        System.out.println("Bitwise AND: " + resultAnd);


        int resultOr = a | b;
        System.out.println("Bitwise OR: " + resultOr);


        int resultXor = a ^ b;
        System.out.println("Bitwise XOR: " + resultXor);
    }
}
