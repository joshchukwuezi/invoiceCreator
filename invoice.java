
public class invoice {

//data for every invoice
private String address, invoiceNumber, date, matter, type,
firstName, surname;

private double professionalFee, vat, totalFee, amountPaid, feeBeforeVat, vatOnFee;

//data for some invoices
private int legalExecFee, medicalReportFee, counselFee, accidentAssessorFee, otherFee;

public void Invoice(String fn, String sn, String a, String in,
String d, String m, String t, double pf, double v, double tf, double ap, double fbv, double vof)
{
	this.firstName=fn;
	this.surname=sn;
	this.address=a;
	this.invoiceNumber=in;
	this.date=d;
	this.matter=m;
	this.type=t;
	this.professionalFee=pf;
	this.vat=v;
	this.totalFee=tf;
	this.amountPaid=ap;
	this.feeBeforeVat=fbv;
	this.vatOnFee=vof;
	
}

//getters
 public String getFirstName()
 {
	 return this.firstName;
 }

 public String getSurname()
 {
	 return this.surname;
 }
 
 public String getAddress()
 {
	 return this.address;
 }

 public String getDate()
 {
	 return this.date;
 }
 
 
 
//setters
public void setVat(double vat)
{
	this.vat=0.187;
}

public void setProfFee(double pf)
{
	this.professionalFee=pf;
}

//display
public String toString()
{
	return "Address : " + this.address + "\n" + "Date : " + this.date + "\n" + "Matter : " + this.matter
  + "\n" + "Client : " + this.firstName + " " + this.surname + "\n" + "Type : " + this.type 
  + "\n" + "Invoice number : " + this.invoiceNumber + "\n" + "Professional Fee (Before VAT) : " + this.feeBeforeVat
  + "\n" + "Legal Executive Fee : " + this.legalExecFee + "\n" + "Medical Report Fee : " + this.address +
  "\n" + "Medical Report Fee : " +  this.medicalReportFee + "Counsel Fee : " + this.counselFee + "\n" + "Accident Assessor Fee : " + this.accidentAssessorFee + "\n" + "Other Fees : " +this.otherFee
  + "\n" + "VAT (@23%) : " + this.vatOnFee + "\n" + "Total Fee (Incl. VAT) : " + this.totalFee + "\n" + "Amount Paid : " + this.amountPaid;
  
}

//creating invoice number

public String createInvoiceNumber()
{
	invoiceNumber = ""; 
	
	for (int i=0; i < getFirstName().length(); i++)
	{
		invoiceNumber = invoiceNumber + getFirstName().charAt(0);
		
	}
	
	for (int i=0; i < getDate().length(); i++)
	{
		invoiceNumber = invoiceNumber + getDate().substring(0,1) + 
		getDate().substring(3,4)
		+ getDate().substring(6,7);
	}
	
	
	for (int i=0; i < getSurname().length(); i++)
	{
		invoiceNumber = invoiceNumber + getSurname().charAt(getSurname().length()-1);
		
	}
	
	return invoiceNumber;
	
	
}

//calculations



	
	
}
