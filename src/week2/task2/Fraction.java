package week2.task2;
public class Fraction {
    private int Numerator;
    private int Denominator;
    public int getNumerator() {
        return this.Numerator;
    }
    public void setNumerator(int numerator) {
        this.Numerator = numerator;
    }

    public int getDenominator() {
        return this.Denominator;
    }
    public void setDenominator(int denominator) {
        this.Denominator = denominator;
    }

    // TODO: khai báo các thuộc tính

    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        this.Numerator = numerator;
        this.Denominator = denominator;
    }

    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction ps = new Fraction(1,2);
        ps.Numerator = this.getNumerator() * other.getDenominator() + other.Numerator * this.getDenominator();
        ps.Denominator = this.getDenominator() * other.getDenominator();
        return ps;
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction ps = new Fraction(1,2);
        ps.Numerator = this.getNumerator() * other.getDenominator() - other.getNumerator() * this.getDenominator();
        ps.Denominator = this.getDenominator() * other.getDenominator();
        return null;
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction ps = new Fraction(1,2);
        ps.Numerator = this.getNumerator() * other.getNumerator();
        ps.Denominator = this.getDenominator() * other.getDenominator();
        return null;
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction ps = new Fraction(1,2);
        ps.Numerator = this.getNumerator() * other.getDenominator();
        ps.Denominator = this.getDenominator() * other.getNumerator();
        return null;
    }
    public boolean equals(Object obj){
        Fraction ps = (Fraction) obj;
        int ps1 = ps.getNumerator() * this.getDenominator();
        int ps2 = ps.getDenominator() * this.getNumerator();
        if (ps1 == ps2) return true;
                else return false;
    }
    public String Inphanso() {
        String ps;
        ps = Integer.toString(this.Numerator) + "/" + Integer.toString(this.Denominator);
        return ps;
    }
    public static void main(String[] args){
        Fraction ps1 = new Fraction(3,5);
        Fraction ps2 = new Fraction(7,5);
        Fraction Cong = ps1.add(ps2);
        Fraction Tru = ps1.subtract(ps2);
        Fraction Nhan = ps1.multiply(ps2);
        Fraction Chia = ps1.divide(ps2);
        System.out.println(Cong.Inphanso());
        System.out.println(Tru.Inphanso());
        System.out.println(Nhan.Inphanso());
        System.out.println(Chia.Inphanso());

    }
}



