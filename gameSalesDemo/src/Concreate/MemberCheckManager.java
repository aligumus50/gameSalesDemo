package Concreate;

import Abstract.MemberCheckService;
import Entities.Member;

public class MemberCheckManager implements MemberCheckService{

	@Override
	public boolean CheckIfRealPerson(Member member) {
		// TODO Auto-generated method stub
		return true;
	}

}
