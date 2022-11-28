import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber;
import com.google.i18n.phonenumbers.NumberParseException;

public class PhoneType {
	public static void main(String [] args) throws NumberParseException {

		String phone = args[0];
		PhoneNumberUtil phoneNumberUtil = PhoneNumberUtil.getInstance();
		Phonenumber.PhoneNumber phoneNumber = phoneNumberUtil.parse(phone, "+852");
		PhoneNumberUtil.PhoneNumberType phoneNumberType = phoneNumberUtil.getNumberType(phoneNumber);
		System.out.println("phoneNumberType = " + phoneNumberType);

	}
}
