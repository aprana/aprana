package insurance;

import java.sql.Date;

public class Payment {
	
	Date payment_time;
	Date payment_date;
	Receipt r;
	
	
	public Receipt getR() {
		return r;
	}
	public void setR(Receipt r) {
		this.r = r;
	}
	public Date getPayment_time() {
		return payment_time;
	}
	public void setPayment_time(Date payment_time) {
		this.payment_time = payment_time;
	}
	public Date getPayment_date() {
		return payment_date;
	}
	public void setPayment_date(Date payment_date) {
		this.payment_date = payment_date;
	}
	
}
