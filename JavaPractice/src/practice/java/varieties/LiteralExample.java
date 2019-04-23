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
	}

	public static void main(String[] args) {
		byteLiteral();

	}

}
