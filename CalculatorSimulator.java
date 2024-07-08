/*
 ************************************ First question **********************************.
 Q1) Develop a simple java application to calculate the tax for a particular employee based on his salary.
    Develop a class named “TaxCalculator“ with a method named calculateTax with the following method parameters,
    Variable Name Data Type empName String isIndian boolean empSal double This method should return a double
    taxAmount. The business logic for calculating the tax is as follows, this has to be implemented inside the
    method, If the employee is not a Indian The calculator should throw a CountryNotValidException If the employee
    name is null or empty The calculator should throw a EmployeeNameInvalidException If empSal is greater than one
    lakh and isIndian true taxAmount =empSal *8/100 Otherwise If empSal is between 50K and 1lakh and isIndian true
    taxAmount =empSal *6/100 Otherwise If empSal is between 30 and 50 Thousand and isIndian true taxAmount =empSal *5/100
    Otherwise If empSal is between 10 and 30 Thousand and isIndian true taxAmount =empSal *4/100 Otherwise The calculator
    should throw a TaxNotEligibleException. Develop a main class CalculatorSimulator , implement the following logic in
    main method 1. Execute the calculateTax Method and print the tax amount as “Tax amount is “ 2. In case the
    calculateTaxMethod throws exceptions, this method needs to catch the appropriate exception print the stack trace
    and display the following messages, a. Country not valid: “The employee should be an Indian citizen for calculating
    tax” b. Employee name not valid: “The employee name cannot be empty” c. Not eligible for Tax calculation: “The employee
    does not need to pay tax” The following test cases to be executed, change the data in main method and run it and verify
    the output messages Test Cases Employee Name Employee Salary Is Indian Message Expected Test Case 1 Ron 34000 False The
    employee should be an Indian citizen for calculating tax. Test Case 2 Tim 1000 True The employee does not need to pay
    tax Test Case 3 Jack 55000 True Tax amount is 3300 Test Case 4 30000 True The employee name cannot be empty.
 */

/*
  Name = Vishal Sharma.
 */

// Custom Exception for invalid country
class CountryNotValidException extends Exception {
    public CountryNotValidException(String message) {
        super(message);
    }
}

// Custom Exception for invalid employee name
class EmployeeNameInvalidException extends Exception {
    public EmployeeNameInvalidException(String message) {
        super(message);
    }
}

// Custom Exception for tax ineligibility
class TaxNotEligibleException extends Exception {
    public TaxNotEligibleException(String message) {
        super(message);
    }
}

// TaxCalculator class
class TaxCalculator {
    public static double calculateTax(String empName, boolean isIndian, double empSal)
            throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
        if (!isIndian) {
            throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax.");
        }
        if (empName == null || empName.isEmpty()) {
            throw new EmployeeNameInvalidException("The employee name cannot be empty.");
        }
        if (empSal > 100000) {
            return empSal * 8 / 100;
        } else if (empSal > 50000) {
            return empSal * 6 / 100;
        } else if (empSal > 30000) {
            return empSal * 5 / 100;
        } else if (empSal > 10000) {
            return empSal * 4 / 100;
        } else {
            throw new TaxNotEligibleException("The employee does not need to pay tax.");
        }
    }
}

// CalculatorSimulator class
public class CalculatorSimulator {
    public static void main(String[] args) {
        try {
            // Test Case 1
            double tax1 = TaxCalculator.calculateTax("Vishal", false, 34000);
            System.out.println("Tax amount is " + tax1);
        } catch (CountryNotValidException e) {
            System.out.println("Country not valid: " + e.getMessage());
        } catch (EmployeeNameInvalidException e) {
            System.out.println("Employee name not valid: " + e.getMessage());
        } catch (TaxNotEligibleException e) {
            System.out.println("Not eligible for Tax calculation: " + e.getMessage());
        }

        try {
            // Test Case 2
            double tax2 = TaxCalculator.calculateTax("Manmoahn", true, 1000);
            System.out.println("Tax amount is " + tax2);
        } catch (CountryNotValidException | EmployeeNameInvalidException | TaxNotEligibleException e) {
            System.out.println(e.getMessage());
        }

        try {
            // Test Case 3
            double tax3 = TaxCalculator.calculateTax("Turshar", true, 55000);
            System.out.println("Tax amount is " + tax3);
        } catch (CountryNotValidException | EmployeeNameInvalidException | TaxNotEligibleException e) {
            System.out.println(e.getMessage());
        }

        try {
            // Test Case 4
            double tax4 = TaxCalculator.calculateTax(null, true, 30000);
            System.out.println("Tax amount is " + tax4);
        } catch (CountryNotValidException | EmployeeNameInvalidException | TaxNotEligibleException e) {
            System.out.println(e.getMessage());
        }
    }
}
/*
   Output.
    Country not valid: The employee should be an Indian citizen for calculating tax.
    The employee does not need to pay tax.
    Tax amount is 3300.0
    The employee name cannot be empty.
 */






/*
 ************************************ Second Question  ********************************.
 Q2)  Create a program with a logic that throws the ArrayIndexOutOfBoundsException while
      accessing elements in an array.[Hint: Use array and loop and try to access the
      element beyond the last index]
 */

/*
  Name = Vishal Sharma.
*/
//
//public class ArrayIndexOutOfBounds {
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5};
//        try {
//            // Trying to access an element beyond the last index
//            System.out.println(arr[5]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Array index out of bounds exception occurred!");
//        }
//    }
//}
///*
//  Output.
//  Array index out of bounds exception occurred!
// */