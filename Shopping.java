//写一个购物流程
public class Shopping(){
	public static void main(String[] args){
		
	}
}

abstract class OnLineShopping(){
	public final void shop(){
		this.browseGoods();
		this.selectGoods();
		this.callService();
		this.distribution();
		this.settlement(){
			if(isIntegral){
				useIntegral();
			}else
			{
				useCoupons();
			}
		};
		this.ordePay();
		this.showOrder();
	}
	
	public void browseGoods(){
		System.out.println("浏览商品");
	}
	
	public void selectGoods(){
		System.out.println("选择商品");
	}
	
	public void callService(){
		System.out.println("客服咨询");
	}
	
	public void distribution(){
		System.out.println("添加配送信息");
	}
	
	public void settlement(){
		System.out.println("结算商品");
	}
	
	public void ordePay(){
		System.out.println("选择支付方式");
	}
	
	public void showOrder(){
		System.out.println("查看订单");
	}
	
	public abstract boolean isIntegral(){
		return true;
	}
	 
	public abstract boolean isIntegral(){
		
	}
}