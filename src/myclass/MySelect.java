package myclass;

import uml.hotel.model.*;
import uml.hotel.templement.*;

/*�˷�����װ����DAO�е�FindById:����������в�ѯ����ΪΨһ����Ҫ����?
 * ����һ��������һ������
 */
public class MySelect {
	
	public WalkIn FindBookingmessage(int Booking_num){
		WalkInDAO bookingmessageDAO=new WalkInDAO();
		return bookingmessageDAO.findById(Booking_num);
	}
	
}

