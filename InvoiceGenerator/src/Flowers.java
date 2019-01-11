/**
 * Flower class extents Produce class
 * <p>Used to create Flower objects</p>
 * 
 */
public class Flowers extends Produce {
	
	/**
	 * @param q the quantity of the Flower
	 */
	public Flowers (double q){
		super(q);
		}
	
	/**
	 * Default constructor
	 */
	public Flowers (){
		
	}
	
	/**
	 * @return "Flowers" the product type
	 */
	public String produceType() {
		return "Flowers";
		}
	
	/**
	 * @return "Flower" the produce classification
	 */
	public String produceClassification() {
		return "Flowers";
	}
}

/**
 * Rose class extents Flowers class
 * <p>Used to create Rose objects</p>
 * 
 */
class Rose extends Flowers {

	/**
	 * @param q the quantity of the Rose
	 */
	public Rose (double q){
		super(q);
		}

	/**
	 * Default constructor
	 */
	public Rose(){
		
	}

	/**
	 * @return "Rose" the product type
	 */
	public String produceType() {
		return "Rose";
		}

	/**
	 * @return "Dozen" the price type
	 */
	public String priceType(){
		return "Dozen";
		}

	/**
	 * @return 19.99 the price
	 */
	public double price(){
		return 19.99;
		}
}

/**
 * Carnation class extents Flowers class
 * <p>Used to create Carnation objects</p>
 * 
 */
class Carnation extends Flowers {

	/**
	 * @param q the quantity of the Carnation
	 */
	public Carnation (double q){
		super(q);
		}

	/**
	 * Default constructor
	 */
	public Carnation(){
		
	}

	/**
	 * @return "Carnation" the product type
	 */
	public String produceType() {
		return "Carnation";
		}

	/**
	 * @return "Dozen" the price type
	 */
	public String priceType(){
		return "Dozen";
		}

	/**
	 * @return 5.28 the price
	 */
	public double price(){
		return 5.28;
		}
}

/**
 * Tulip class extents Flowers class
 * <p>Used to create Tulip objects</p>
 * 
 */
class Tulip extends Flowers {

	/**
	 * @param q the quantity of the Tulip
	 */
	public Tulip (double q){
		super(q);
		}

	/**
	 * Default constructor
	 */
	public Tulip(){
		
	}

	/**
	 * @return "Tulip" the product type
	 */
	public String produceType() {
		return "Tulip";
		}

	/**
	 * @return "Unit" the price type
	 */
	public String priceType(){
		return "Unit";
		}

	/**
	 * @return 1.50 the price
	 */
	public double price(){
		return 1.50;
		}
}

/**
 * Lily class extents Flowers class
 * <p>Used to create Lily objects</p>
 * 
 */
class Lily extends Flowers {

	/**
	 * @param q the quantity of the Lily
	 */
	public Lily (double q){
		super(q);
		}

	/**
	 * Default constructor
	 */
	public Lily(){
		
	}

	/**
	 * @return "Lily" the product type
	 */
	public String produceType() {
		return "Lily";
		}

	/**
	 * @return "Unit" the price type
	 */
	public String priceType(){
		return "Unit";
		}

	/**
	 * @return 3.00 the price
	 */
	public double price(){
		return 3.00;
		}
}

/**
 * Orchid class extents Flowers class
 * <p>Used to create Orchid objects</p>
 * 
 */
class Orchid extends Flowers {

	/**
	 * @param q the quantity of the Orchid
	 */
	public Orchid (double q){
		super(q);
		}

	/**
	 * Default constructor
	 */
	public Orchid(){
		
	}

	/**
	 * @return "Orchid" the product type
	 */
	public String produceType() {
		return "Orchid";
		}

	/**
	 * @return "Unit" the price type
	 */
	public String priceType(){
		return "Unit";
		}

	/**
	 * @return 13.99 the price
	 */
	public double price(){
		return 13.99;
		}
}