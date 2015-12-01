import groovy.sql.Sql

/**
 * Created by C5023792 on 11/11/2015.
 */
class TempData {

    static void main(args) {
        def orderCode = "201003100621700";
        def db = Sql.newInstance(
                "jdbc:oracle:thin:@10.237.89.156:1521:tj11gdb6",
                "ECCVA_15D_0914_01",
                "ECCVA_15D_0914_01",
                "oracle.jdbc.driver.OracleDriver")
        println("执行查询语句");
        def sysdate = db.firstRow("select to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') from dual")
        println sysdate[0];
    }
}
