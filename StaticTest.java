class StaticTest {
	
static int i1 =5;
static int i2;

public static void sPrintMethod (int sParam) {
	System.out.println("inside sPrintMethod--->" + sParam);
	System.out.println("inside sPrintMethod--i1->" + i1);
	System.out.println("inside sPrintMethod---i2->" + i2);
	
}

static {
	
	System.out.println("inside static block");
	i2 = i1*10;
	System.out.println("i2========>" + i2);
}
	
	public static void main(String args[]){
    	sPrintMethod(50);	
		System.out.println("i2 main========>" + i2);
	}
}	