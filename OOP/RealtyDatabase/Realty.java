public class Realty {
    public static void main(String[] args) {
        PropertyDatabase pd = new PropertyDatabase();
        pd.loadProperty();
        pd.printCondo();
        System.out.println();
        pd.printHouse();
        System.out.println();
        System.out.println(pd.largestCondo());
        
        PrimarySpec ps = new PrimarySpec("N10", 5000000, 1, 1);
        CondoSpec cs = new CondoSpec(true, true, true, true, true);

        pd.printAllMatch(ps, cs, 0.5);
    }
}
