package Concreate;

import Abstract.MemberCheckService;
import Abstract.MemberService;
import Entities.Member;

public class MemberManager implements MemberService {

	MemberCheckService MemberCheckService;
	public MemberManager(Abstract.MemberCheckService memberCheckService) {
		
		MemberCheckService = memberCheckService;
	}

	@Override
	public void add(Member member) {

		if (MemberCheckService.CheckIfRealPerson(member)) {
			
			System.out.println("Do�rulama ba�ar�l�. Sisteme kayd�n�z yap�lm��t�r: " + member.getUserName());
		}
		
		else {
			System.out.println("Do�rulama ba�ar�s�z. Bilgilerinizi kontrol ediniz.");
		}
		

	}

	@Override
	public void update(Member member) {

		System.out.println("Do�rulama ba�ar�l�. Bilgileriniz g�ncellenmi�tir.: " + member.getUserName());

	}

	@Override
	public void delete(Member member) {

		if (MemberCheckService.CheckIfRealPerson(member)) {
			
			System.out.println("Do�rulama ba�ar�l�. Sistemden kayd�n�z silinmi�tir: " + member.getUserName());
		}
		

	}

}
