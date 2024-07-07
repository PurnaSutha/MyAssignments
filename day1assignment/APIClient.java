package week3.day1assignment;

public class APIClient {
	
	public void sendRequest(String endpoint)//method 1

	{
		System.out.println("Endpoint is " + endpoint);
	
	}
	public void sendRequest(String endpoint,String requestBody,boolean requestStatus)//method2

	{
	System.out.println("Endpoint is " + endpoint + "\nThe Request body is " +requestBody + "\nThe Request Status is "  +requestStatus);
	
	}
	public static void main(String[] args) {
		APIClient api =new APIClient(); //creating object for APIClient class
		api.sendRequest("Mobile");
		api.sendRequest("Headphone","Hi ",true);
		

	}

}
