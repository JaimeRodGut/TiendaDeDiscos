import java.util.HashMap;
import java.util.Objects;

public class MusicShop implements IMusicShop {
    private String name;
    private String direction;
    private HashMap<String, Disk> disks;
    private HashMap<Integer, Member> members;

    public MusicShop(String name, String direction, HashMap<String, Disk> disks, HashMap<Integer, Member> members) {
        this.name = name;
        this.direction = direction;
        this.disks = disks;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public HashMap<String, Disk> getDisks() {
        return disks;
    }

    public void setDisks(HashMap<String, Disk> disks) {
        this.disks = disks;
    }

    public HashMap<Integer, Member> getMembers() {
        return members;
    }

    public void setMembers(HashMap<Integer, Member> members) {
        this.members = members;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MusicShop musicShop = (MusicShop) o;
        return Objects.equals(name, musicShop.name) && Objects.equals(direction, musicShop.direction) && Objects.equals(disks, musicShop.disks) && Objects.equals(members, musicShop.members);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, direction, disks, members);
    }

    @Override
    public String toString() {
        return "MusicShop{" +
                "name='" + name + '\'' +
                ", direction='" + direction + '\'' +
                ", disks=" + disks +
                ", members=" + members +
                '}';
    }
}
