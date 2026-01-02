public class TecEmp extends Emp{
	private double bonuce;

   public TechEmp(String ename,int e_id,double basic,String city,double onuce){
   		super(ename,e_id,basic,city);
   		this.bonuce = bonuce;
   }
   @Override
   public int getBonuce(){
    bonuce = basic +((basic *(0.3+0.53+0.1)+bonuce);
   	System.out.println(" "+bonuce); 
   	return bonuce;
   }
}