public class Driver {
public static void main(String[] args) {
	q1 qa=new q1("((a,a),(a))$");
	if(qa.S()) {
		qa.read_next_token();
		if(qa.token=='$')
			System.out.println("q1 Accepted");
		else
			System.out.println("q1 Not Accepted");
	}
	else {
		System.out.println("q1 Not Accepted");
	}
	
	
	q6 qf=new q6("a+b*b+1$");
	if(qf.S()) {
		qf.read_next_token();
		if(qf.token=='$')
			System.out.println("q6 Accepted");
		else {
			System.out.println("q6 Not Accepted");
		}
	}
	else {
		System.out.println("q6 Not Accepted");
	}
	
	q7 qg=new q7("ans=(a**b)/(d*c)$");
	if(qg.A()) {
		qg.read_next_token();
		if(qg.token=='$')
			System.out.println("q7 Accepted");
		else {
			System.out.println("q7 Not Accepted");
		}
	}
	else {
		System.out.println("q7 Not Accepted");
	}
	q8 qh=new q8("id=num;id(num)$");
	if(qh.L()) {
		qh.read_next_token();
		if(qh.token=='$')
			System.out.println("q8 Accepted");
		else {
			System.out.println("q8 Not Accepted");
		}
	}
	else {
		System.out.println("q8 Not Accepted");
	}
}
}
