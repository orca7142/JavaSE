package day06.mypac;
//set은 인자값을 저장, get은 불러오는것
//MobilePhone이 자식 클래스가 되고 Phone이 부모 변수가 된다. 그래서 부모의 변수나 매서드를 쓸수 있으나, 
// 단 private이 아니여야한다.
public class MobilePhone extends Phone{
	 

	public String getName() {
		return name;
	}

	public void setName(String name) {
		super.name = name;
	}
	 	
	 

}
