import com.big_homework.untity.Stu;

/**
 * CREATE TABLE Stu(
 *         stuId           varchar(50)     primary key,                            #学生编号
 *         stuName         varchar(50),                                            #学生姓名
 *         instituteNo     int,                                                    #学生学院
 *         stuAge          int,                                                    #学生年龄
 *         stuSex          varchar(1),                                             #学生性别
 *         stuPassword     varchar(50)                                             #学生平台密码
 *         )
 *
 *         说明：
 *         该类充当全局变量类，其含义是记录当前登录用户的信息，当用户成功注册时，应该调用该类的setStu方法以设置当前在线用户。
 *         而以后需要用到用户信息的地方，可以调用改类的get方法获得。
 */

public class Owner {
    static private String stuId;
    static private String stuName;
    static private int instituteNo;
    static private int stuAge;
    static private String stuSex;
    static private String stuPassword;

    //获得当前用户学号
    public static String getStuId() {
        return stuId;
    }

    //获得当前用户姓名
    public static String getStuName() {
        return stuName;
    }

    //获得当前用户学院号
    public static int getinstituteNo() {
        return instituteNo;
    }

    //获得当前用户年龄
    public static int getStuAge() {
        return stuAge;
    }

    //获得当前用户性别
    public static String getStuSex() {
        return stuSex;
    }

    //获得当前用户密码
    public static String getStuPassword() {
        return stuPassword;
    }

    //获得当前用户的实体类
    public static Stu getStu() {
        String stuId = getStuId();
        String stuName = getStuName();
        int instituteNo = getinstituteNo();
        int stuAge = getStuAge();
        String stuSex = getStuSex();
        String stuPassword = getStuPassword();
        return new Stu(stuId, stuName, instituteNo, stuAge, stuSex, stuPassword);
    }

    //设置或修改当前用户学号
    public static void setStuId(String stuId) {
        Owner.stuId = stuId;
    }

    //设置或修改当前用户姓名
    public static void setStuName(String stuName) {
        Owner.stuName = stuName;
    }

    //设置或修改当前用户学院号
    public static void setinstituteNo(int stuInst) {
        Owner.instituteNo = stuInst;
    }

    //设置或修改当前用户年龄
    public static void setStuAge(int stuAge) {
        Owner.stuAge = stuAge;
    }

    //设置或修改当前用户性别
    public static void setStuSex(String stuSex) {
        Owner.stuSex = stuSex;
    }

    //设置或修改当前用户密码
    public static void setStuPassword(String stuPassword) {
        Owner.stuPassword = stuPassword;
    }

    //设置或修改当前用户所有信息
    public static void setStu(Stu stu) {
        setStuId(stu.getStuId());
        setStuName(stu.getStuName());
        setinstituteNo(stu.getInstituteNo());
        setStuAge(stu.getStuAge());
        setStuSex(stu.getStuSex());
        setStuPassword(stu.getStuPassword());
    }
}
