package Rectengle;

public  class Shape {

	

	int width=3;
	int height=5;
	char character='*';
	String shape="";
	
	public Shape(int width, int height,char character){
	this.width=width;
	this.height=height;
	this.character=character;
	}
	
	public String getShape(int width, int height,char character){
		
	for(int i=0;i<width;i++){

		shape+="\n";
		for(int j=0;j<height;j++){
			
			if(i!=0 && i!=width-1&&j!=0&& j!=height-1){
					shape+=" ";
			
				}
			else  shape+=character;
			       
		}
	
	}
	return  shape;

}
}