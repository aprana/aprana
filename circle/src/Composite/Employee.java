package Composite;

import java.util.*;

public class Employee {
private String designatn;
private double salary;
private ArrayList subordinates;
public Employee(String designatn, double salary) {
	super();
	this.designatn = designatn;
	this.salary = salary;
	subordinates =new ArrayList();
}
public double getSalaries() {
	double sum=salary;
	for(int i=0; i<subordinates.size(); i++)
	{
		sum+=((Employee)subordinates.get(i)).getSalaries();
	}
	return sum;
}

public void add(Employee emp)
{
	subordinates.add(emp);
}

}
