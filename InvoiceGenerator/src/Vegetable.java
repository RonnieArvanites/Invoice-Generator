/**
 * Vegetable class extents Produce class
 * <p>Used to create Vegetable objects</p>
 * 
 */
public class Vegetable extends Produce {
	
	/**
	 * @param q the quantity of the Vegetable
	 */
	public Vegetable (double q){
		super(q);
		}
	
	/**
	 * Default constructor
	 */
	public Vegetable (){
		
	}
	
	/**
	 * @return "Vegetable" the product type
	 */
	public String produceType() {
		return "Vegetable";
		}
	
	/**
	 * @return "Vegetable" the produce classification
	 */
	public String produceClassification() {
		return "Vegetable";
	}
}

/**
 * Eggplant class extents Vegetable class
 * <p>Used to create Eggplant objects</p>
 * 
 */
class Eggplant extends Vegetable {
	
	/**
	 * @param q the quantity of the Eggplant
	 */
	public Eggplant (double q){
		super(q);
		}

	/**
	 * Default constructor
	 */
	public Eggplant(){
		
	}

	/**
	 * @return "Eggplant" the product type
	 */
	public String produceType() {
		return "Eggplant";
		}

	/**
	 * @return "Unit" the price type
	 */
	public String priceType(){
		return "Unit";
		}

	/**
	 * @return 0.74 the price
	 */
	public double price(){
		return 0.74;
		}
}

/**
 * Radish class extents Vegetable class
 * <p>Used to create Radish objects</p>
 * 
 */
class Radish extends Vegetable {
	
	/**
	 * @param q the quantity of the Radish
	 */
	public Radish (double q){
		super(q);
		}

	/**
	 * Default constructor
	 */
	public Radish(){
		
	}

	/**
	 * @return "Radish" the product type
	 */
	public String produceType() {
		return "Radish";
		}

	/**
	 * @return "Dozen" the price type
	 */
	public String priceType(){
		return "Dozen";
		}

	/**
	 * @return 1.14 the price
	 */
	public double price(){
		return 1.14;
		}
}

/**
 * Cabbage class extents Vegetable class
 * <p>Used to create Cabbage objects</p>
 * 
 */
class Cabbage extends Vegetable {
	
	/**
	 * @param q the quantity of the Cabbage
	 */
	public Cabbage (double q){
		super(q);
		}

	/**
	 * Default constructor
	 */
	public Cabbage(){
		
	}

	/**
	 * @return "Cabbage" the product type
	 */
	public String produceType() {
		return "Cabbage";
		}

	/**
	 * @return "Unit" the price type
	 */
	public String priceType(){
		return "Unit";
		}

	/**
	 * @return 1.48 the price
	 */
	public double price(){
		return 1.48;
		}
}

/**
 * Lettuce class extents Vegetable class
 * <p>Used to create Lettuce objects</p>
 * 
 */
class Lettuce extends Vegetable {

	/**
	 * @param q the quantity of the Lettuce
	 */
	public Lettuce (double q){
		super(q);
		}

	/**
	 * Default constructor
	 */
	public Lettuce(){
		
	}

	/**
	 * @return "Lettuce" the product type
	 */
	public String produceType() {
		return "Lettuce";
		}

	/**
	 * @return "Unit" the price type
	 */
	public String priceType(){
		return "Unit";
		}

	/**
	 * @return 0.82 the price
	 */
	public double price(){
		return 0.82;
		}
}

/**
 * Carrot class extents Vegetable class
 * <p>Used to create Carrot objects</p>
 * 
 */
class Carrot extends Vegetable {

	/**
	 * @param q the quantity of the Carrot
	 */
	public Carrot (double q){
		super(q);
		}

	/**
	 * Default constructor
	 */
	public Carrot(){
		
	}

	/**
	 * @return "Carrot" the product type
	 */
	public String produceType() {
		return "Carrot";
		}

	/**
	 * @return "Dozen" the price type
	 */
	public String priceType(){
		return "Dozen";
		}

	/**
	 * @return 0.98 the price
	 */
	public double price(){
		return 0.98;
		}
}