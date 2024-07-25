public class Increment {
    public static void main(String[] args) {
    int x = 5;
    int result = x++;
    System.out.println("post-increment: " + result);
    System.out.println("Updated x: " + x);
    int y = 10;
    int updatedValue = ++y;
    System.out.println("pre-increment: " + updatedValue);
    System.out.println("Updated y: " + y);
}}
