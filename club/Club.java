package club;

public class Club {

	private int currentNumber=0;
	private Member[] members;
	
	public Club(){
		members=new Member[10];
	}
	
	public Member addMember(Person p){
	currentNumber++;
	Member m=new Member(p.surname,p.firstName,p.secondName, currentNumber);
	members[currentNumber]=m;
	return m;
	}
	
	public void showMembers(){

			for (Member member : members) {
				if (member != null)
				member.show();
			}
	}
	
	public void removeMember(int membershipNumber){
		if (currentNumber>0 && currentNumber < 11){
		members[membershipNumber]=null;
		}
	}
	
}
