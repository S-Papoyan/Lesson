package task_21_40;

// Տրված են a,b,c և d թվերը, կազմել ծրագիր, որը կարտածի տրված թվերից փոքրագույնի արժեքը։
public class Task_32 {
    public static void main(String[] args) {

        int a = 12, b = 23, c = 37, d = 4;

        if (a < b && a < c && a < d) {
            System.out.println(a);
        } else if (b < a && b < c && b < d) {
            System.out.println(b);
        } else if (c < a && c < b && c < d) {
            System.out.println(c);
        } else System.out.println(d);
    }
}

