package com.xworkz.inheritence;

public class Factory {
		private String name;
		private int since;
		private int noOfWorkers;
		private String product;
		
		public Factory() {
			System.out.println("calling default no-arguement parameter constructor");
		}

		public Factory(String name, int since, int noOfWorkers, String product) {
			super();
			this.name = name;
			this.since = since;
			this.noOfWorkers = noOfWorkers;
			this.product = product;
			
			System.out.println(this.name);
			System.out.println(this.since);
			System.out.println(this.noOfWorkers);
			System.out.println(this.product);

		     

		}
		
		

	}


