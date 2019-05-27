package cn.cloudtest.jmeter.util;

import org.apache.jorphan.collections.HashTree;
import org.apache.jorphan.collections.ListedHashTree;

import cn.cloudtest.jmeter.file.dto.JTestTree;
import cn.cloudtest.jmeter.file.dto.JTestTreeItem;

public class JMeterUtil {
   
	public static void getHashTreeFromJTestTree(HashTree subtree,JTestTree tree,int parentId){	
		for(JTestTreeItem item:tree.getItemlist()){
			if(item.getPid()==parentId){
				subtree.set(item.getContent(),new ListedHashTree());
				getHashTreeFromJTestTree(subtree.getTree(item.getContent()),tree,item.getId());
			}
		}
	
	}
	
}
