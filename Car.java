 class Car{
	private String carColor;//车色
	private String carPlate;//车牌号
	private String carBrand;//品牌
	private String carSite;//生产地
	
	public Car(String carColor, String carPlate, String carBrand, String carSite){
		this.carColor = carColor;
		this.carPlate = carPlate;
		this.carBrand = carBrand;
		this.carSite = carSite;
	}
	
	public String getCar(){
		return "颜色："
		+this.carColor+ "，车牌号:" 
		+this.carPlate+ "，品牌商: "
		+this.carBrand+ "，生产地: " 
		+this.carSite;
	}
	
	public static void main(String[] args){
		Car car1 = new Car("红色","陕A32463","兰博", "德国");
		System.out.println(car1.getCar());
	}
	
}