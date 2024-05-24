public class simple_interest_instance {
	float initial = 12650;
	float interest = 6;
	float tenure = 5;
 
public static void main(String args[]){
       simple_interest_instance obj = new simple_interest_instance();
	float si = (obj.initial * obj.interest * obj.tenure) / 100;
    
    System.out.println("Total simple interest after 5 years = "+si);

}
    
}