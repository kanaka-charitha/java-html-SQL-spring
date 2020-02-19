package sss123;

public class Prime {
public static Boolean validate(final Integer primeNumber) {
	//int primeNumber;
	for(int i=2;i<(primeNumber/2);i++) {
		if(primeNumber%i==0) {
			return false;
		}
	}
	return true;
}
}
