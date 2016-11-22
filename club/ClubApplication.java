package club;

public class ClubApplication {

    public static void main (String args[]) {

//        Person member1, member2, member3;
        Person p1,p2,p3;
//        Facility fac1, fac2, fac3;
        
        Club club=new Club();
        
        
        p1 =new Person("Edison", "Thomas", "Alva");
        p2=new Person("Baggio", "Roberto", null);
        club.addMember(p1);
        club.addMember(p2);
        club.showMembers();
        club.removeMember(1);
        club.showMembers();

//        member1 = new Member ("Edison", "Thomas", "Alva",1);
//        member2 = new Member ("Baggio", "Roberto", null,2);
//        member3 = new Member ("Webber", "Andrew", "Lloyd",3);

//        fac1 = new Facility ("Main Hall", null);
//        fac2 = new Facility ("Room1", "Conference Room on Level 2");
//        fac3 = new Facility ("Room2", "Meeting Room on Level 3");

//        System.out.println ("Members:");
//        p1.show ();
//        p2.show ();
//        member3.show ();
        

//        System.out.println ("\nFacilities:");
//        fac1.show ();
//        fac2.show ();
//        fac3.show ();
    }

}
