public class Lesson1 {
    public static void main(String[] args) {
    byte a16 = 0xC;
    byte a10 = 12;
    byte a8 = 014;
    byte a2 = 0b1100;
        System.out.print(a16 + " ");
        System.out.print(a10 + " ");
        System.out.print(a8 + " ");
        System.out.println(a2 + " ");
    short b16 = 0x514;
    short b10 = 1300;
    short b8 = 02424;
    short b2 = 0b0101_0001_0100;
        System.out.print(b16 + " ");
        System.out.print(b10 + " ");
        System.out.print(b8 + " ");
        System.out.println(b2 + " ");
    int c16 = 0x0;
    int c10 = 0;
    int c8 = 00;
    int c2 = 0b0;
        System.out.print(c16 + " ");
        System.out.print(c10 + " ");
        System.out.print(c8 + " ");
        System.out.println(c2 + " ");
    long d16 = 0x75BCD15;
    long d10 = 123456789L;
    long d8 = 0726746425;
    long d2 = 0b111010110111100110100010101;
        System.out.print(d16 + " ");
        System.out.print(d10 + " ");
        System.out.print(d8 + " ");
        System.out.println(d2 + " ");
}
}
