import java.util.List;
import java.util.Objects;


public class Member {
    private String name;
    private String Surname;
    private String nif;
    private int pc;
    private List<Loan> loans;

    public Member(String name, String surname, String nif, int pc, List<Loan> loans) {
        this.name = name;
        Surname = surname;
        this.nif = nif;
        this.pc = pc;
        this.loans = loans;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public int getPc() {
        return pc;
    }

    public void setPc(int pc) {
        this.pc = pc;
    }

    public List<Loan> getLoans() {
        return loans;
    }

    public void setLoans(List<Loan> loans) {
        this.loans = loans;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return pc == member.pc && Objects.equals(name, member.name) && Objects.equals(Surname, member.Surname) && Objects.equals(nif, member.nif) && Objects.equals(loans, member.loans);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Surname, nif, pc, loans);
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", nif='" + nif + '\'' +
                ", pc=" + pc +
                ", loans=" + loans +
                '}';
    }
}
