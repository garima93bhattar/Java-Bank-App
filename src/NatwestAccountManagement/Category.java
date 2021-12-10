package NatwestAccountManagement;

public class Category {

	private int typeID;
	private String typeName;
	private int interest;
	
	
	public Category(int typeID, String typeName, int interest) {
		this.typeID = typeID;
		this.typeName = typeName;
		this.interest = interest;
	}


	public int getTypeID() {
		return typeID;
	}


	public void setTypeID(int typeID) {
		this.typeID = typeID;
	}


	public String getTypeName() {
		return typeName;
	}


	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}


	public int getInterest() {
		return interest;
	}


	public void setInterest(int interest) {
		this.interest = interest;
	}


	@Override
	public String toString() {
		return "Category [typeID=" + typeID + ", typeName=" + typeName + ", interest=" + interest + "]";
	}

	
	
	
}
