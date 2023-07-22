public class Userservice {
    public void register(String name,String password) throws LengthException {
        if(null == name|| name.length()<6 || name.length()>14 )
        {
            throw new LengthException("输入的用户名长度少于6或超过14");
        }
        if(password!=null)
        {
            System.out.println("注册成功！！！！");
        }
    }
}
