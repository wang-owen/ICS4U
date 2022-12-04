class Property {
    private int id;
    private String address;
    private PrimarySpec primSpec;
    private SecondarySpec secSpec;

    public Property(int id, String address, PrimarySpec primSpec, SecondarySpec secSpec) {
        this.id = id;
        this.address = address;
        this.primSpec = primSpec;
        this.secSpec = secSpec;
    }

    public int getID() {
        return id;
    }

    public String getZoneCode(){ 
        return primSpec.zoneCode;
    }

    public double getPrice() {
        return primSpec.price;
    }

    public boolean matchProperty(PrimarySpec p, SecondarySpec s, double percent) {
        return primSpec.matchSpec(p) && secSpec.matchSpec(s, percent);
    }

    public Property compareSize(Property other) {
        if (primSpec.size > other.primSpec.size) {
            return this;
        }
        return other;
    }

    public String toString() {
        return String.format("ID: %d\nAddress: %s\n%s\n%s", id, address, primSpec, secSpec);
    }
}
