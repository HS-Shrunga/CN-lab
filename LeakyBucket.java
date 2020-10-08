import java.util.Scanner;
public class Leaky 
{
	public static int bucketSize=1000;
	public static int outputRate=100;
	public static void sendPacket(int pktSize)
	{
		if(pktSize> bucketSize)
		{
			System.out.println("Bucket Overflow");
		}
		else
		{
			while(pktSize> outputRate)
			{
				System.out.println(outputRate+"bytes of packets is sent");
				pktSize=pktSize - outputRate;
			}
			System.out.println(pktSize + "bytes of packets is sent");
		}
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the no of packets:");
		int numpackets=scanner.nextInt();
		if(numpackets>0)
		{
			for(int i=1;i<=numpackets;i++)
			{
				System.out.print("Enter the packet " + i + " size:");
				int pktSize=scanner.nextInt();
				sendPacket(pktSize);
			}
			System.out.println("queue is full");
		}
		else
		{
			System.out.println("No Packets to Send");
		}
	}
}
