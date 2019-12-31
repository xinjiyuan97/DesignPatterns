package Interpreter;

public class SubExpression extends Expression {

	@Override
	public void interpret(Context context) {
		System.out.println("-1");
		String s = context.getContext();
		int num = Integer.parseInt(s);
		num--;
		s = String.valueOf(num);
		context.setContext(s);
	}

}
