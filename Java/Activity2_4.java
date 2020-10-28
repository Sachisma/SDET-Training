
public class Activity2_4 {
	public static void main(String[] s){
        try {
            Activity2_4.exceptionTest("Will print to console");
            Activity2_4.exceptionTest(null);
            Activity2_4.exceptionTest("Will not execute");
        } catch(CustomException msg) {
            System.out.println("Block messages " + msg.getMessage());
        }
    }

    static void exceptionTest(String s1) throws CustomException {
        if(s1 == null) {
            throw new CustomException("Value is null");
        } else {
            System.out.println(s1);
        }
    }

}
