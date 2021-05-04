package Adapter;

import java.rmi.RemoteException;

import Abstract.MemberCheckService;
import Entities.Member;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapterManager implements MemberCheckService {

	@Override
	public boolean CheckIfRealPerson(Member member) {
		
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		boolean result=false;
		try {
			result = kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(member.getNationalityId()), member.getFirstName().toUpperCase(), member.getLastName().toUpperCase(), member.getDateOfBirth().getYear());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

}
