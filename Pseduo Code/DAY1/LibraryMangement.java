package DAY1;

import java.util.Date;
import java.util.Calendar;

class Member {
    String name;
    int memberID;
    Date membershipDate;
    
    
    public Member(String name, int memberID, Date membershipDate) {
        this.name = name;
        this.memberID = memberID;
        this.membershipDate = membershipDate;
    }
    
    
    public boolean isMembershipValid(Date currentDate) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(membershipDate);
        
        calendar.add(Calendar.YEAR, 1);
        Date expirationDate = calendar.getTime();
        
        return currentDate.before(expirationDate);
    }

    public void displayMemberDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + memberID);
        System.out.println("Membership Date: " + membershipDate);
    }
}

public class LibraryMangement {

    public static void main(String[] args) {
        
        Date today = new Date();
        
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, -6); 
        Date sixMonthsAgo = cal.getTime();
        
        Member member1 = new Member("Alice Johnson", 101, sixMonthsAgo);
        
        Calendar soonToExpireCal = Calendar.getInstance();
        soonToExpireCal.add(Calendar.MONTH, -11); 
        Date soonToExpireDate = soonToExpireCal.getTime();

        Member member2 = new Member("Bob Smith", 102, soonToExpireDate);
        
        System.out.println("--- Member 1 Details ---");
        member1.displayMemberDetails();
        boolean isValid1 = member1.isMembershipValid(today);
        System.out.println("Is Membership Valid? " + isValid1);
        
        System.out.println(); 

        System.out.println("--- Member 2 Details ---");
        member2.displayMemberDetails();
        boolean isValid2 = member2.isMembershipValid(today);
        System.out.println("Is Membership Valid? " + isValid2);
    }
}