import java.util.Objects;

public class Loan {
    private String price;
    private String date;

    public Loan(String price, String date) {
        this.price = price;
        this.date = date;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Loan loan = (Loan) o;
        return Objects.equals(price, loan.price) && Objects.equals(date, loan.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, date);
    }

    @Override
    public String toString() {
        return "Loan{" +
                "price='" + price + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
