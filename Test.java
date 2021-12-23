package assignment;
import java.util.function.Function.*;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;

class employee
{
	String Name;
	int id;
	long Salary;

  employee(String Name,int id,long Salary)
   {
	this.Name=Name;
	this.id=id;
	this.Salary=Salary;
   }
   public String getName()
   {
	   return Name;
   }
   public int getid()
   {
	   return id;
   }
   public long getSalary()
   {
	return Salary;   
   }
   public String toString()
   {
	return "Name:"+Name
			+",id:"+id
			+",Salary:"+Salary;
   }
}
public class Test
{
	public static void main(String[]args) 
	{
	ArrayList<employee> l=new ArrayList<employee>();
	
	l.add(new employee("Ashok",4567,65000));
	
	l.add(new employee("Aanand",3567,35000));
	
	l.add(new employee("rajesh",2567,75000));
	
	l.add(new employee("ramu",8567,55000));
	
	l.add(new employee("ravi",7567,45000));

	System.out.println("list of employees whose salary is greater than 50k");
	
    List<employee> l1=l.stream().filter(c-> c.getSalary() > 50000).collect(Collectors.toList());
    
    System.out.println(l1);
    
    System.out.println("...................................................");

    System.out.println("employee details whose name starts with 'A' ");
    
    List<employee> l2=l.stream().filter(c-> c.getName().contains("A")).collect(Collectors.toList());
    
    System.out.println(l2);
    
    System.out.println("...................................................");
    
    System.out.println("sum of salaries of employees whose names starts with 'A'");
    
    long sum=0;
    
    for(employee e:l)
    {
 	  if((e.Name).contains("A")){sum=sum+e.Salary;}
    }
    System.out.println(sum);
    
    System.out.println("...................................................");
    
    System.out.println("Total sum of Salaries are given below");
    
   System.out.println(l.stream().mapToDouble(employee::getSalary).reduce(0,(value1,value2)->value1 + value2));
  
    
	}
}
