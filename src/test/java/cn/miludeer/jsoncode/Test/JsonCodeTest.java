package cn.miludeer.jsoncode.Test;

import cn.miludeer.jsoncode.JsonCode;
import org.junit.Test;

/**
 * program: jsoncode
 * description: ${description}
 * author: lujinfei
 * create: 2019-02-17 10:49
 **/
public class JsonCodeTest {



    @Test
    public void testkey() {

        String json = "{\"ss\":{\"sss\":\"vvvvv\",\"fg\":{\"f\":\"ererer\",\"list\":[1,eeee,{\"\\[\"}]}}}";

        String code = JsonCode.getValue(json,"*.ss.fg.f");

        System.out.println(code);
    }

    @Test
    public void testList() {

        String json = "{\"ss\":{\"sss\":\"vvvvv\",\"fg\":{\"f\":\"ererer\",\"list\":[1,eeee,{\"\\[\"}]}}}";

        String code = JsonCode.getValue(json,"*.ss.fg.list");

        System.out.println(code);
    }

    @Test
    public void testListArray() {

        String json = "{\"ss\":{\"sss\":\"vvvvv\",\"fg\":{\"f\":\"ererer\",\"list\":[1,eeee,{\"\\[\"}]}}}";

        String[] code = JsonCode.getValueList(json,"*.ss.fg.list");

        for(int i = 0;i<code.length; i++) {
            System.out.println(i + ":" + code[i]);
        }
    }

}
