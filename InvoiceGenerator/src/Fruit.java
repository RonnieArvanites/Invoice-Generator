/**
 * Fruit class extents Produce class
 * <p>Used to create Fruit objects</p>
 * 
 */
public class Fruit extends Produce {
	
	/**
	 * @param q the quantity of the Fruit
	 */
	public Fruit (double q){
		super(q);
		}
	
	/**
	 * Default constructor
	 */
	public Fruit (){
		
	}
	
	/**
	 * @return "Fruit" the product type
	 */
	public String produceType() {
		return "Fruit";
		}
	
	/**
	 * @return "Fruit" the produce classification
	 */
	public String produceClassification() {
		return "Fruit";
	}
}

/**
 * Banana class extents Fruit class
 * <p>Used to create Banana objects</p>
 * 
 */
class Banana extends Fruit {

	/**
	 * @param q the quantity of the Banana
	 */
	public Banana (double q){
		super(q);
		}

	/**
	 * Default constructor
	 */
	public Banana(){
		
	}

	/**
	 * @return "Banana" the product type
	 */
	public String produceType() {
		return "Banana";
		}

	/**
	 * @return "Dozen" the price type
	 */
	public String priceType(){
		return "Dozen";
		}

	/**
	 * @return 0.79 the price
	 */
	public double price(){
		return 0.79;
		}
}

/**
 * Strawberry class extents Fruit class
 * <p>Used to create Strawberry objects</p>
 * 
 */
class Strawberry extends Fruit {

	/**
	 * @param q the quantity of the Strawberry
	 */
	public Strawberry (double q){
		super(q);
		}

	/**
	 * Default constructor
	 */
	public Strawberry(){
		
	}

	/**
	 * @return "Strawberry" the product type
	 */
	public String produceType() {
		return "Strawberry";
		}

	/**
	 * @return "Lbs" the price type
	 */
	public String priceType(){
		return "Lbs";
		}

	/**
	 * @return 2.50 the price
	 */
	public double price(){
		return 2.50;
		}
}

/**
 * Mango class extents Fruit class
 * <p>Used to create Mango objects</p>
 * 
 */
class Mango extends Fruit {

	/**
	 * @param q the quantity of the Mango
	 */
	public Mango (double q){
		super(q);
		}

	/**
	 * Default constructor
	 */
	public Mango(){
		
	}

	/**
	 * @return "Mango" the product type
	 */
	public String produceType() {
		return "Mango";
		}

	/**
	 * @return "Unit" the price type
	 */
	public String priceType(){
		return "Unit";
		}

	/**
	 * @return 1.49 the price
	 */
	public double price(){
		return 1.49;
		}
}

/**
 * Orange class extents Fruit class
 * <p>Used to create Orange objects</p>
 * 
 */
class Orange extends Fruit {

	/**
	 * @param q the quantity of the Orange
	 */
	public Orange (double q){
		super(q);
		}

	/**
	 * Default constructor
	 */
	public Orange(){
		
	}

	/**
	 * @return "Orange" the product type
	 */
	public String produceType() {
		return "Orange";
		}

	/**
	 * @return "Unit" the price type
	 */
	public String priceType(){
		return "Unit";
		}

	/**
	 * @return 0.39 the price
	 */
	public double price(){
		return 0.39;
		}
}

/**
 * Apple class extents Fruit class
 * <p>Used to create Apple objects</p>
 * 
 */
class Apple extends Fruit {

	/**
	 * @param q the quantity of the Apple
	 */
	public Apple (double q){
		super(q);
		}

	/**
	 * Default constructor
	 */
	public Apple(){
		
	}

	/**
	 * @return "Apple" the product type
	 */
	public String produceType() {
		return "Apple";
		}

	/**
	 * @return "Lbs" the price type
	 */
	public String priceType(){
		return "Lbs";
		}

	/**
	 * @return 2.33 the price
	 */
	public double price(){
		return 2.33;
		}
}