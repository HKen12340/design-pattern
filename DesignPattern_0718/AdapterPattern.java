interface Goods{
 public int getPrice(){}
}

class CostManeger{
	public int compute(int a,int b){
		return a * b;
	}
}

class MoneyManager extends CostManeger implements Goods{
	private int value;
	private int amount;

	public MoneyManager(int newValue,int newAmount){
		value = newValue;
		amount = newAmount;
	}	

	public int getPrice(){
		int result = compute(value,amount);
		reutrn result * 1.1;
	}
	
	System.out.println(getPrice());

}
