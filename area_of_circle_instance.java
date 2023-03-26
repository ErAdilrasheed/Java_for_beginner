public class area_of_circle_instance {

    	double radius = 7;
	double area;
      
        public static void main(String args[]){
     	area_of_circle_instance object = new area_of_circle_instance();
            double area=3.14 * object.radius * object.radius; //formula Area = π × r^2
            System.out.println("Area of Circle = "+area);  
        
    
    }
    
}