package phenikaa;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ComplexNum cp1 = new ComplexNum(2, -3);
        ComplexNum cp2 = new ComplexNum(4, -3);
        ComplexNum cp3 = new ComplexNum(5, -2);
        ComplexNum cp4 = new ComplexNum(1, -6);
        ComplexNum cp5 = new ComplexNum(7, 8);
        ComplexNum cp6 = new ComplexNum(2, 9);

        System.out.println("In ra so phuc");
        System.out.println(cp1.toString());
        System.out.println(cp3.toString());

        System.out.println("Cong 2 so phuc");
        System.out.println(cp1.add(cp2));

        System.out.println("tru 2 so phuc");
        System.out.println(cp1.sub(cp2));

        System.out.println("Nhan 2 so phuc");
        System.out.println(cp1.multi(cp2));

        System.out.println("Chia 2 so phuc");
        System.out.println(cp1.div(cp2));

        System.out.println("Nhan voi 1 so thuc = 8");
        System.out.println(cp1.multi(8));

        System.out.println("Lien hop");
        System.out.println(cp1.rev());
    }
}
