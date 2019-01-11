/**
 * Produce class
 * <p>Used to create Produce objects</p>
 */
public class Produce {
		
		//Properties
		double qty;
		
		/**
    	 * @param q the quantity of the produce
    	 */
		public Produce (double q){
			qty = q;
			}
		
		/**
    	 * Default constructor
    	 */
		public Produce(){
			qty = 0.0;
			}
		
		/**
    	 * @return "Produce" the produce type
    	 */
		public String produceType() {
			return "Produce";
			}
		
		/**
    	 * @return "Produce" the produce classification
    	 */
		public String produceClassification() {
			return "Produce";
			}
		
		/**
    	 * @return "" the price type
    	 */
		public String priceType(){
			return "";}
		
		/**
    	 * @return 0.0 the price
    	 */
		public double price(){
			return 0.0;}
		
		/**
    	 * @return qty the quantity
    	 */
		public Double getQty(){
			return qty;} // encapsulation
		
		/**
    	 * @param q the quantity to set qty to
    	 */
		public void setQty(Double q){
			qty = q;}
}
