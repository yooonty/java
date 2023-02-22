package 네트워크프로그램;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPSender {

	public static void main(String[] args) throws Exception {
		// UDP용 소켓이 있어야 함.
		DatagramSocket socket = new DatagramSocket();

		// UDP용 패킷이 있어야 함. (데이터, 데이터의 크기, ip, port) //길이 정해져잇지 X
		String s = "i am java programmer..";
		byte[] data = s.getBytes(); // String을 byte 배열로!
		// localhost, 127.0.0.1 ==> 자기pc의 ip
		InetAddress ip = InetAddress.getByName("127.0.0.1");
		DatagramPacket packet = new DatagramPacket(data, data.length, ip, 8888);

		// 소켓을 이용해서 패킷을 보낸다.!
		socket.send(packet);
		socket.close(); // 전화기를 끊는다!
	}

}
