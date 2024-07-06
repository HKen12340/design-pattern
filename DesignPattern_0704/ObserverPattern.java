interface TimeAdmin{
	public void update(Subject subject);
}


class CuckooClock implements TimeAdmin{
	public void update(Subject subject){
		for(int i = 0;i < ((concreteSubject)subject).getHour();i++){
			System.out.println("ぽっぽー！");
		}
	}
}


class SubtractionDisplay implements TimeAdmin{
	private int countDownValue = 10000

	public void update(Subject subject){
		countDownValue--;
		System.out.println(countDownValue);
	}
}
