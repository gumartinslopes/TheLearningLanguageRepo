public class Invoice
{
	String number, description;
	int itemQuantity;
	double itemPrice;

	public Invoice()
	{
	
	}

	public Invoice(String number, String description, int itemQuantity, int itemPrice)
	{
		setNumber(number);
		setDescription(description);
		setItemQuantity(itemQuantity);
		setItemPrice(itemPrice);
	}

	public double getInvoiceAmount()
	{
		return this.itemPrice * this.itemQuantity;
	}

	//getters
	public String getNumber()
	{
		return this.number;
	}

	public String getDescription()
	{
		return this.description;
	}

	public int getItemQuantity()
	{
		return this.itemQuantity;
	}

	public double getItemPrice()
	{
		return this.itemPrice;
	}

	//setters

	public void setNumber(String  number)
	{
		this.number = number;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public void setItemQuantity(int itemQuantity)
	{
		if(itemQuantity < 0)
			this.itemQuantity = 0;
		else
			this.itemQuantity = itemQuantity;
	}

	public void setItemPrice(double itemPrice)
	{
		if(itemPrice < 0)
			this.itemPrice = 0.0;
		else
			this.itemPrice = itemPrice;
	}
}