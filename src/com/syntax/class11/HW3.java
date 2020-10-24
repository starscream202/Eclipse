package com.syntax.class11;

public class HW3 {

	public static void main(String[] args) {
		
		String[] countries= {"USA","Canada","Turkey","Mexico"};
		String capitals;
		
		for (String country:countries) {
			switch(country) {
			case "USA":
				capitals="DC";
				break;
			case "Canada":
				capitals="Ontario";
				break;
			case "Turkey":
				capitals="Istanbul";
				break;
			case "Mexico":
				capitals="Mexico City";
				break;
				default:
					capitals="null";
			}
		}

	}

}
