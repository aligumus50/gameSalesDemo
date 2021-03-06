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
			
			System.out.println("Doğrulama başarılı. Sisteme kaydınız yapılmıştır: " + member.getUserName());
		}
		
		else {
			System.out.println("Doğrulama başarısız. Bilgilerinizi kontrol ediniz.");
		}
		

	}

	@Override
	public void update(Member member) {

		System.out.println("Doğrulama başarılı. Bilgileriniz güncellenmiştir.: " + member.getUserName());

	}

	@Override
	public void delete(Member member) {

		if (MemberCheckService.CheckIfRealPerson(member)) {
			
			System.out.println("Doğrulama başarılı. Sistemden kaydınız silinmiştir: " + member.getUserName());
		}
		

	}

}
