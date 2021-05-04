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
			
			System.out.println("Doðrulama baþarýlý. Sisteme kaydýnýz yapýlmýþtýr: " + member.getUserName());
		}
		
		else {
			System.out.println("Doðrulama baþarýsýz. Bilgilerinizi kontrol ediniz.");
		}
		

	}

	@Override
	public void update(Member member) {

		System.out.println("Doðrulama baþarýlý. Bilgileriniz güncellenmiþtir.: " + member.getUserName());

	}

	@Override
	public void delete(Member member) {

		if (MemberCheckService.CheckIfRealPerson(member)) {
			
			System.out.println("Doðrulama baþarýlý. Sistemden kaydýnýz silinmiþtir: " + member.getUserName());
		}
		

	}

}
