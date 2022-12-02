public class Property {
    private String id;
    private String address;
    private PrimarySpec primSpec;
    private SecondarySpec secSpec;

    public Property(String id, String address, PrimarySpec primSpec, SecondarySpec secSpec) {
        this.id = id;
        this.address = address;
        this.primSpec = primSpec;
        this.secSpec = secSpec;
    }

    public String getID() {
        return id;
    }

    public boolean matchProperty(PrimarySpec p, SecondarySpec s, double percent) {
        if (primSpec.matchSpec(p) && secSpec.matchSpec(s, percent)) {
            return true;
        }
        return false;
    }

    public String toString() {
        return String.format("ID: %s\nAddress: %s", id, address);
    }
}
