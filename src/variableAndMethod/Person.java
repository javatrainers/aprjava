package variableAndMethod;

/*
 Business requirement discussion	(BRD call)	
 Person
	has = store information ( VARIABLES )
		name
		phone
		age
		weight
 */
public class Person {
	// variable names
	// has -A = data type and data name
	// *****DATA_TYPE VARIABLE_NAME=VARIABLE_VALUE;*****
	// RULE : variable value should match data type defined
	public String name="jane"; 
	int a;
	long phone=123;
	short age=12;
	byte x=125; // -128 to +127
	float weight=12.3f;
	boolean alive=false;// variable value does not match data type defined
}


/* COMMENTS/NOTES/DOCUMENTATION
	has = store information ( VARIABLES )
		String name; 
		long phone;
		short age;
		float weight;
	simple/primitive data (Primitive data type)
		numeric = ********byte, short, int ,  long********
			age, zip, stock, quantity
		alphabetic = ********char********
			single character
		fractional = ********float, double********
			float accuracy 6 decimal point
			123.1231266		123.1231261
			123.123127		123.123126
			
			float weight; 123.234(kg.grams)
			float productPrice; 999.99 ( dollar.cents)
			double astronomy star cordinate
			double scientific values (value of pie)
			
			
		yes/no = ********boolean******** (true/false)
			loggedin status, account status,
		
	complex information (Object data type)
		group of characters = ********String********
			name, city, state, country, product name
		Object complex data type
*/