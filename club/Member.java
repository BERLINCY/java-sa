package club;

public class Member extends Person {

	private int membershipnumber;

	public Member(String surname, String firstName, String secondName,int membershipnumber) {
		super(surname, firstName, secondName);
		this.membershipnumber=membershipnumber;
		
	}

	public int getMembershipnumber() {
		return membershipnumber;
	}
	
	public String toString(){
		String fullName;
		if(secondName ==null)
		{
			fullName= membershipnumber +"--"+ firstName +surname;
		}
		else
			fullName= membershipnumber +"--"+firstName+secondName+surname;
		return fullName;
	}
	
}
