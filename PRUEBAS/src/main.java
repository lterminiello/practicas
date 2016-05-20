import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;

public class main {
	public static void main(String[] args) {
		try {
			System.out.println(Inet4Address.getLocalHost().getHostAddress());
			InetAddress localHost = Inet4Address.getLocalHost();
			NetworkInterface networkInterface = NetworkInterface.getByInetAddress(localHost);
			System.out.println(networkInterface.getInterfaceAddresses().get(0).getNetworkPrefixLength());
			for (InterfaceAddress address : networkInterface.getInterfaceAddresses()) {
			    System.out.println(address.getNetworkPrefixLength());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
}
