package com.junior.InnerClasses;

public class ComputeFramework {

	public static void main(String[] args) {
		ComputationDB cDb = new ComputationDB();

		cDb.addOperation(cDb.generateOperation('+', 10, 5));

		ComputationDB.IBinaryOperation diffOp = cDb.generateOperation('-', 10, 5);
		cDb.addOperation(diffOp);

		cDb.executeAll();
	}

}
