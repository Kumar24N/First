class SalCal
{
	String employeeType;
        double salary;
       void CalSalCal()
	{
		System.out.println("employeeType : " +employeeType);
		System.out.println("salary  in $: " +salary);
	}
}

class SalariedEmploys extends SalCal 
{

	int weeklysalary;
	int weeks;
	

		void CalSalariedEmploys()
		{
			
			salary =(weeks*weeklysalary);
			System.out.println("employeeType :" +employeeType);
			System.out.println("weeks :" +weeks);
			System.out.println("salary  in $:" +salary);
			System.out.println("***************************");

		}
}

class HourlySalary extends SalCal
{
	int hours;
	double amount;
	int excesshours;
	void CalHourlySalary()
	{
		if(hours>40)

		{
			System.out.println("employeeType :" +employeeType);
			System.out.println("hours :" +hours);
			excesshours= hours-40;
			System.out.println("excesshours :" +excesshours);
			System.out.println("amount :" +amount);
			salary = ((amount*hours)+ (excesshours*(1.5*amount)) );
			System.out.println("salary  in $:" +salary);
			System.out.println("***************************");
			
		}
		else
		{
			System.out.println("employeeType :" +employeeType);
			salary = amount*hours;
			System.out.println("hours :" +hours);
			System.out.println("amount :" +amount);
			System.out.println("salary  in $:" +salary);
			System.out.println("***************************");
		}
	}
}

class ComissionEmployee extends SalCal
{
	int sales;
	double percentage;
	
      void CalComissionEmployee()
	{
		System.out.println("employeeType :" +employeeType);
		salary = sales/percentage;
		System.out.println("sales :" +sales);
		System.out.println("percentage :" +percentage);
		System.out.println("salary  in $:" +salary);
		System.out.println("***************************");
	}
}	
 class BaseSalariedComisssionEmployee extends SalCal 
{
	int baseSal;
	double percentage;
	int sales;
	int hike;
        void CalBaseSalariedComisssionEmployee()
	{
		System.out.println("employeeType :" +employeeType);
		salary =  baseSal +(sales/percentage);
		hike= baseSal/10;
		System.out.println("sales :" +sales);
		System.out.println("hike $:" +hike);
		System.out.println("basesal :" +baseSal);
		System.out.println("percentage :" +percentage);
		System.out.println("salary in $:" +salary);
		salary= hike+salary;
		System.out.println("salary in $ after Hike :" +salary);
		System.out.println("***************************");
	}
} 	