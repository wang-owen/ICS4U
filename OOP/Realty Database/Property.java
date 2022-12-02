class Property {
    String id;
    String address;
    PrimarySpec primSpec;
    SecondarySpec secSpec;

    public Property(String id, String address, PrimarySpec primSpec, SecondarySpec secSpec) {
        this.id = id;
        this.address = address;
        this.primSpec = primSpec;
        this.secSpec = secSpec;
    }

    public String getID() {
        return id;
    }

    public String getZoneCode() {
        return primSpec.getZoneCode();
    }

    public double getPrice() {
        return primSpec.getPrice();
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
