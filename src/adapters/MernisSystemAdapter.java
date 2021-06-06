package adapters;

import java.rmi.RemoteException;

import abstracts.GamerCheckService;
import entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisSystemAdapter implements GamerCheckService{
	

	@Override
	public boolean checkIfRealPerson(Gamer gamer) throws NumberFormatException{
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		
		try {
			boolean result = kpsPublic.TCKimlikNoDogrula(Long.parseLong(gamer.getIdentityNumber()), 
					gamer.getFirstName().toUpperCase(), 
					gamer.getLastName().toUpperCase(), 
					gamer.getDateOfBirthYear());
		}
		catch(RemoteException e) {
			e.printStackTrace();
		}
		
		return result;
		
	}
}
