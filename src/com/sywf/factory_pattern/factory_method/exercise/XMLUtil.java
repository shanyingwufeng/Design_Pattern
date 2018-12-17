package com.sywf.factory_pattern.factory_method.exercise;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * Author: YiFan
 * Date: 2018/12/11 09:23
 * Description: 文件读取类
 */
public class XMLUtil {

    public static Object getBean(String configFileName, String packageName) {
        try {
            //创建DOM文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dFactory.newDocumentBuilder();
            Document doc;
            doc = dBuilder.parse(new File(configFileName));

            //获取包含类名的文本节点
            NodeList nl = doc.getElementsByTagName("imageType");
            Node node = nl.item(0).getFirstChild();
            String cName = node.getNodeValue().trim();

            //通过类名生成实例对象并将其返回
            Class c = Class.forName(packageName + "." + cName);//生成的是工厂名
            Object object = c.newInstance();
            return object;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
