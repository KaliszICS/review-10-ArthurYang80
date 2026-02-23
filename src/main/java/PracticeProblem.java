public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String pyramid(int rows) {
    String result = "";
    for (int i = 1; i <= rows; i++) {    
        for (int j = i; j < rows; j++) {
            result += " ";
        }
        for (int k = 1; k <= i; k++) {
            result += "*";
            if (k < i) {
                result += " ";
            }
        }
        if (i < rows) {
            result += "\n";
        }
    } 
	return result;
}


	public static String square(int n) {
    if (n <= 0) return "";  
    String result = "";
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) { 
            if (i == 1 || i == n || j == 1 || j == n) {
                result += "*";
            } else {
                result += " ";
            }
        }       
        if (i < n) {
            result += "\n";
        }
    }    
    return result;
}

	public static boolean hasLowercase(String str) {
    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);   
        	if (Character.isLowerCase(ch)) {
            	return true;
        }
    } 
    return false;
}

}
