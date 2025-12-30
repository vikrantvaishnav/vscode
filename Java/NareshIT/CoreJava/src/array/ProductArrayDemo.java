package array;

import java.util.Scanner;

public class ProductArrayDemo {
	
	void main() {
		Scanner sc = new Scanner(System.in);
		Integer num = Integer.parseInt(IO.readln("Enter Emp num: "));
		Product arr[] = new Product[num];
		
		for(int i= 0;i<num; i++) {
			IO.print("Enter id: ");
			Integer id = sc.nextInt();
			String name = IO.readln("Enter name");
			IO.print("Enter Price: ");
			Double salary = sc.nextDouble();
			
			arr[i] = new Product(id,name,salary);
		}
		IO.println("Enter Product ID to search: ");
		Integer search = sc.nextInt();
		
		for(Product pro :arr) {
			if(pro.getId().equals(search)) {
				IO.println("Product Found: "+pro);
				System.exit(0);
			}
		}
		IO.println("Product with ID  not found.");
		
		sc.close();
	}
		
	}


	class Product{
		private Integer id;
		private String name;
		private Double price;
		
		public Product(Integer id,String name,Double price) {
			this.id =id;
			this.name = name;
			this.price = price;
		}
		
		
		
		public Integer getId() {
			return id;
		}


		public String toString() {
			return "id= "+id +" name: "+name+", Salary: "+price;
		}
	}

