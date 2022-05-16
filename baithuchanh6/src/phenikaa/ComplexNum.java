package phenikaa;

public class ComplexNum {
    private double a;
    private double b;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public ComplexNum(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public String toString() {
        if (a == 0) {
            return "" + b + "j";
        } else if (b == 0) {
            return ""+a;
        } else {
            return "" + a + " " + b + "j";
        }
    }

    public double mod() {
        return Math.sqrt(a*a + b*b);
    };

    public ComplexNum add(ComplexNum cp2) {
        ComplexNum tmp = new ComplexNum(a + cp2.getA(),b + cp2.getB());
        return tmp;
    }

    public ComplexNum sub(ComplexNum cp2) {
        ComplexNum tmp = new ComplexNum(a - cp2.getA(),b - cp2.getB());
        return tmp;
    }

    public ComplexNum multi(ComplexNum cp2) {
        ComplexNum tmp = new ComplexNum(a*cp2.getA() - b*cp2.getB() , a*cp2.getB() + b*cp2.getA());
        return tmp;
    }

    public ComplexNum div(ComplexNum cp2) {
        ComplexNum tmp = new ComplexNum(
                (a*cp2.getA() + b*getB())/(a*a +b*b),
                (a*cp2.getB() - b*cp2.getA())/(a*a + b*b)
        );
        return tmp;
    }

    public boolean compare(ComplexNum cp2) {
        return a == cp2.getA() && b == cp2.getB();
    }

    public ComplexNum rev() {
        ComplexNum tmp = new ComplexNum(a , -b);
        return tmp;
    }

    public ComplexNum multi(int k) {
        ComplexNum tmp = new ComplexNum(a*k, b*k);
        return tmp;
    }
}
