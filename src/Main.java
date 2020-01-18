public class Main {
	 public static void main(String[] args) throws Exception {
	        // Create the stub object
	        EmployeesHomeStub stub = new EmployeesHomeStub();
	        // Create the request
	        EmployeesHomeStub.FindById request = new EmployeesHomeStub.FindById();
	        // Set the parameters
	        request.setId(3);
	        // Invoke the service
	        EmployeesHomeStub.FindByIdResponse response = stub.findById(request);
	        Employees res = response.get_return();
	        System.out.println("Response : " + res);
	    }
}
