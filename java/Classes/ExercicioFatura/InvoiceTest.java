public class InvoiceTest 
{	
	public static void displayInvoice(Invoice inv)
	{
		System.out.println("Number: " + inv.getNumber());
		System.out.println("Description: " + inv.getDescription());
		System.out.println("Price per item: " + inv.getItemPrice());
		System.out.println("Item quantity: " + inv.getItemQuantity());
		System.out.println("Total amount: " + inv.getInvoiceAmount());
	}
	public static void main(String[] args)
	{
		Invoice inv1 = new Invoice("122200", "Banana costume set bought on amazon.", 2, 120);
		displayInvoice(inv1);
	}
}