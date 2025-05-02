public class ClubDemo {
    private static String clubName = "Elite Programmers Club";
    private String memberName;

    public ClubDemo(String memberName) {
        this.memberName = memberName;
    }

    public static void displayClubName() {
        System.out.println("Club Name: " + clubName);
    }

    public void displayMemberInfo() {
        System.out.println("Member Name: " + memberName + " | Club: " + clubName);
    }

    public static void main(String[] args) {
        ClubDemo.displayClubName();

        ClubDemo member1 = new ClubDemo("Alice");
        ClubDemo member2 = new ClubDemo("Bob");
        ClubDemo member3 = new ClubDemo("Charlie");

        member1.displayMemberInfo();
        member2.displayMemberInfo();
        member3.displayMemberInfo();

        ClubDemo.clubName = "Global Developers League";
        System.out.println("\nAfter changing club name:");

        member1.displayMemberInfo();
        member2.displayMemberInfo();
        member3.displayMemberInfo();
    }
}
