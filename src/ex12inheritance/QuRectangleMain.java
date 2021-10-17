package ex12inheritance;

//직사각형을 표현한 클래스
class Rectangle
{
     int width, height; // 가로 세로길이
     
    public Rectangle(int width) {
   		this.width = width;
   	}
    
     //멤버변수가 2개이므로 인자가 2개인 생성자 필요
     public Rectangle(int width, int height) {
    	 this.width = width;
    	 this.height = height;
     }
     //직사각형의 면적의 출력
     public void ShowAreaInfo() {
    	 System.out.println("직사각형 면적: " + (width * height));
     }
} 
//정사각형을 표현한 클래스(정사각형은 직사각형의 일종)
class Square extends Rectangle
{
	//여기에 새로 int width를 정의하면 초기화되서 안됨. 중복해서 쓰지말것.
	
    
    public Square(int width) {
    	super(width,width);
	}
	
    /*
     정사각형은 직사각형의 일종이고, 가로/세로 길이가 돌일하므로 
     하나의 겂으로 두개의 멤버변수를 초기화 할 수 있다.
     따라서 자식에서 멤버변수에 대한 확장도 필요없다.
     
      public Square(int length) {
    	  this.length = length;
    	  super(length,length);
      }
     */
	
     
     /*
      오버라이드는 굳이 super()를 할 필요가 없다. 
      상속이랑은 좀 다른 개념임.
      */
     public void ShowAreaInfo() {
    	 System.out.println("정사각형의 면적: "+ (width * width));
     }    
} 
class QuRectangleMain {
	public static void main(String[] args) {
	       	Rectangle rec = new Rectangle(4, 3);
	       	rec.ShowAreaInfo();

	       	Square sqr = new Square(7);
	       	sqr.ShowAreaInfo();
 	}
}