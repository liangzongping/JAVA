/**
 * final表示最终的，不可变的。
 * final可以修饰变量，方法以及类等
 */
public class finalTest {
}
//用final修饰类A,表示A不能扩展，没有子类；
final class A{

}




/**
 * class B extends A{
 *
 * }
 * 错误：无法从final 'A' 继承
 */

/**
 * class B extends String{
 *
 * }
 * 错误：无法从final 'java.lang.String' 继承
 */






/**
 * class C{
 *     public final void dosome()
 *     {
 *         System.out.println("dosome");
 *     }
 * }
 * class D extends C{
 *     public void dosome()
 *     {
 *         System.out.println("dosome");
 *     }
 * }
 * 错误：'dosome()' 无法重写 'C' 中的 'dosome()'；重写的方法为 final
 */