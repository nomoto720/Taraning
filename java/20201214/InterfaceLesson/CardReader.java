public class CardReader implements UsbConnectable{
	@Override
	public void usbConnect(){
		System.out.println("USB接続にSDカードの読み書きができます。");
	}
}
