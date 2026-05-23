package lang.imutable.address;

public class MemberV2 {
    private String name;
    private ImutableAddress address;

    public MemberV2(String name, ImutableAddress address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ImutableAddress getAddress() {
        return address;
    }

    public void setAddress(ImutableAddress address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "MemberV2{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
