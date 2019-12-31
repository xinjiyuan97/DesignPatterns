package Interpreter;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		Context context = new Context();
		context.setContext("20");
		
		List<Expression> expressions = new ArrayList<Expression>();
		expressions.add(new AddExpression());
		expressions.add(new AddExpression());
		
		expressions.add(new SubExpression());
		expressions.add(new SubExpression());
		expressions.add(new AddExpression());
		
		for (Expression exp: expressions) {
			exp.interpret(context);
		}
		System.out.println(context.getContext());
	}

}
