/**
 * 
 */
package practice.java.varieties;

/**
 * @author aposo
 *
 */
public class LiteralExample {

	public static void byteLiteral() {
		byte byt3 = 1_2;
		byte byt31 = 0b0110;
		byte byt32 = 0x1;
		System.out.println(byt32);
	}

	public static void floatLiteral() {
//		float float1 = 1_2.5_f; invalid
//		float float1 = 1_2._5f; invalid
		float float1 = 1_2.5f;
		float float2 = 0F;
		float float3 = 0;
		float float4 = 0_1;
		float float5 = 0b01010;
//		float float6 = 0b01010f; invalid
//		float float7 = 0b01010d; invalid
	}

	public static void doubleLiteral() {
		double d = 123_123F;
//		double d1 = 0b101D; invalid
	}

	public static void intLiteral() {
		int i = 0b01010100101;
		System.out.println(i);
	}

	public static void longLiteral() {
		long l = 0b111;
		long ll = 0b111L;
		long lll = 0b111l;
		long llll = 0b111;
	}

	public static void main(String[] args) {
		intLiteral();
		System.exit(1);
		byteLiteral();

	}

}
